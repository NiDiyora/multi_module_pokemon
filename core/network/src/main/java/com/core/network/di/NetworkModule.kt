package com.core.network.di

import com.core.network.ApiService
import com.core.network.dataProviders.PokeMonDataProviders
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    @Provides
    fun provideApiService(): ApiService {
        return Retrofit.Builder().baseUrl("https://pokeapi.co/api")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ApiService::class.java)
    }

    @Provides
    fun providePokemonDataProvider(apiService: ApiService): PokeMonDataProviders {
        return PokeMonDataProviders(apiService = apiService)
    }
}