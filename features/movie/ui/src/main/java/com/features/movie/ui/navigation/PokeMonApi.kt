package com.features.movie.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.core.feature_api.FeatureApi

interface PokeMonApi : FeatureApi {

}

class PokeMonApiImpl : PokeMonApi {
    override fun registrationGraph(
        navController: NavHostController,
        navGraphBuilder: NavGraphBuilder
    ) {
        InterNalPokeMonFeaturesApi.registrationGraph(navController, navGraphBuilder)
    }

}