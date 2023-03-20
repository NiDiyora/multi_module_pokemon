package com.features.movie.ui.screen

import com.features.movie.domain.modal.PokeMon

data class PokemonListStateHolder(
    val isLoading:Boolean = false,
    val data:List<PokeMon>? =null,
    val error:String = ""

)
