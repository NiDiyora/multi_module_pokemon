package com.features.movie.ui.navigation

import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.core.common.navigation_constant.PokeMonFeatures
import com.core.feature_api.FeatureApi
import com.features.movie.ui.screen.PokemonScreen

internal object InterNalPokeMonFeaturesApi : FeatureApi {
    override fun registrationGraph(
        navController: androidx.navigation.NavHostController,
        navGraphBuilder: androidx.navigation.NavGraphBuilder
    ) {
        navGraphBuilder.navigation(
            startDestination = PokeMonFeatures.pokeScreenRoute,
            route = PokeMonFeatures.nestedRoute
        ) {
            composable(PokeMonFeatures.pokeScreenRoute) {
                PokemonScreen()
            }
        }
    }
}