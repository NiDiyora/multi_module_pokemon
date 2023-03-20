package com.features.movie.domain.di

import com.features.movie.domain.repo.PokeMonRepository
import com.features.movie.domain.use_cases.GetPokemonListUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@InstallIn(SingletonComponent::class)
@Module
object DomainLayerModule {

    @Provides
    fun providePokeMonListUseCase(pokeMonRepository: PokeMonRepository): GetPokemonListUseCases {
        return GetPokemonListUseCases(pokeMonRepository)
    }
}