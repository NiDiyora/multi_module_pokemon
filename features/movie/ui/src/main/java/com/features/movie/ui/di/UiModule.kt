package com.features.movie.ui.di

import com.features.movie.ui.navigation.PokeMonApi
import com.features.movie.ui.navigation.PokeMonApiImpl
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object UiModule {

    fun providePokemonApi():PokeMonApi{
        return PokeMonApiImpl()
    }
}