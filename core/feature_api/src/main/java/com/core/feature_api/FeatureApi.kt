package com.core.feature_api

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController

interface FeatureApi {

    fun registrationGraph(navController: NavHostController, navGraphBuilder: NavGraphBuilder)
}