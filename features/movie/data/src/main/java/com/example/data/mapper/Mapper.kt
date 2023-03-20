package com.example.data.mapper

import com.core.network.model.PokemonResponse
import com.features.movie.domain.modal.PokeMon

fun PokemonResponse.toDomainPokeMonList(): List<PokeMon> {
    return this.results.map {
        PokeMon(name = it.name ?: "", url = it.url ?: "")
    }
}