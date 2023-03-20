package com.example.data.di

import com.core.network.dataProviders.PokeMonDataProviders
import com.example.data.repo.PokeMonRepositoryImpl
import com.features.movie.domain.repo.PokeMonRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object DataLayerModule {

    @Provides
    fun provideRepositoryImpl(pokeMonDataProviders: PokeMonDataProviders): PokeMonRepository {
        return PokeMonRepositoryImpl(pokeMonDataProviders)
    }
}