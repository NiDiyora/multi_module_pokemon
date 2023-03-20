package com.features.movie.domain.use_cases

import com.core.common.UiEvent
import com.features.movie.domain.repo.PokeMonRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import javax.inject.Inject

class GetPokemonListUseCases @Inject constructor(private val pokemonRepository:PokeMonRepository) {
    operator fun invoke(limit: Int) = flow {
        emit(UiEvent.Loading())
        emit(UiEvent.Success(pokemonRepository.getPokeMonList(limit)))

    }.catch {
        emit(UiEvent.Error(it.message ?: ""))
    }.flowOn(Dispatchers.IO)
}