package com.example.data.repo

import com.core.network.dataProviders.PokeMonDataProviders
import com.example.data.mapper.toDomainPokeMonList
import com.features.movie.domain.modal.PokeMon
import com.features.movie.domain.repo.PokeMonRepository
import javax.inject.Inject

class PokeMonRepositoryImpl @Inject constructor(private val pokeMonDataProviders: PokeMonDataProviders):PokeMonRepository {

    override suspend fun getPokeMonList(limit: Int): List<PokeMon> {
        return pokeMonDataProviders.getPokeMonList(limit).toDomainPokeMonList()
    }
}