package com.example.multi_module_movielistdemo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.core.common.navigation_constant.PokeMonFeatures

@Composable
fun AppNavigation(navController: NavHostController, navigationProvider: NavigationProvider) {

    NavHost(navController = navController, startDestination = PokeMonFeatures.nestedRoute) {
        navigationProvider.pokemonApi.registrationGraph(navController, this)
    }
}