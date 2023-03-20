package com.example.multi_module_movielistdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.multi_module_movielistdemo.navigation.AppNavigation
import com.example.multi_module_movielistdemo.navigation.NavigationProvider
import com.example.multi_module_movielistdemo.ui.theme.Multi_module_MovieListDemoTheme
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var navigationProvider: NavigationProvider


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Multi_module_MovieListDemoTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()
                App(navHostController = navController,navigationProvider)
            }
        }
    }
}

@Composable
fun App(navHostController: NavHostController,navigationProvider: NavigationProvider) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
       AppNavigation(navController = navHostController, navigationProvider =navigationProvider )
    }
}
