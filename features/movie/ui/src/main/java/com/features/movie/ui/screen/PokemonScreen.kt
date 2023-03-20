package com.features.movie.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.features.movie.domain.modal.PokeMon

@Composable
fun PokemonScreen(viewModel: PokemonListViewModel = hiltViewModel()) {
    val result = viewModel.pokemonList.value
    if (result.data != null) {
        PokemonList(result.data)
    }
}

@Composable
fun PokemonList(result: List<PokeMon>) {
    LazyColumn {
        items(items = result) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(10.dp), backgroundColor = Color.White,
                elevation = 8.dp
            ) { Text(text = it.name, fontSize = 20.sp, color = Color.Black) }
        }
    }

}