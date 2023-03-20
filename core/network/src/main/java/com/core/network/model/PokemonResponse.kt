package com.core.network.model

data class PokemonResponse(
    val count: Int?,
    val next: String?,
    val previous: Any,
    val results: List<PokeMonDTO>
)