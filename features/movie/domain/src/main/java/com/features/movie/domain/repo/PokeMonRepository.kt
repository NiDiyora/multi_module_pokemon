package com.features.movie.domain.repo

import com.features.movie.domain.modal.PokeMon

interface PokeMonRepository {
    suspend fun getPokeMonList(limit: Int): List<PokeMon>
}