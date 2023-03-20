package com.core.network

import com.core.network.model.PokemonResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    //https://pokeapi.co/api/v2/pokemon?limit=100


    @GET("/v2/pokemon")
    suspend fun getPokemonList(@Query("limit") limit: Int): PokemonResponse
}