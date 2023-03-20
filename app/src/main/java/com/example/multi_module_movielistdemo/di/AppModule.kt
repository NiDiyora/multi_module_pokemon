package com.example.multi_module_movielistdemo.di

import com.example.multi_module_movielistdemo.navigation.NavigationProvider
import com.features.movie.ui.navigation.PokeMonApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object AppModule {


    @Provides
    fun provideNavigationProvider(pokeMonApi: PokeMonApi): NavigationProvider {
        return NavigationProvider(pokeMonApi)
    }
}