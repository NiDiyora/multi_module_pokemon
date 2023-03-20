package com.features.movie.ui.screen

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.core.common.UiEvent
import com.features.movie.domain.use_cases.GetPokemonListUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import javax.inject.Inject

@HiltViewModel
class PokemonListViewModel @Inject constructor(private val getPokemonListUseCases: GetPokemonListUseCases) :
    ViewModel() {


    private val _pokemonList = mutableStateOf(PokemonListStateHolder())
    val pokemonList: State<PokemonListStateHolder> get() = _pokemonList


    init {
        getPokemonList(200)
    }
    private fun getPokemonList(limit: Int) {
        getPokemonListUseCases.invoke(limit).onEach {
            when (it) {
                is UiEvent.Loading -> {
                    _pokemonList.value = PokemonListStateHolder(isLoading = true)
                }
                is UiEvent.Error -> {
                    _pokemonList.value = PokemonListStateHolder(error = it.message ?: "")
                }
                is UiEvent.Success -> {
                    _pokemonList.value = PokemonListStateHolder(data = it.data)
                }

            }

        }.launchIn(viewModelScope)
    }

}