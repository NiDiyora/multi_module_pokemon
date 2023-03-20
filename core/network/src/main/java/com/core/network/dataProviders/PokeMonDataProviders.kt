package com.core.network.dataProviders

import com.core.network.ApiService
import com.core.network.model.PokemonResponse
import javax.inject.Inject

class PokeMonDataProviders @Inject constructor(private val apiService: ApiService) {

    suspend fun getPokeMonList(limit: Int) = apiService.getPokemonList(limit)
}