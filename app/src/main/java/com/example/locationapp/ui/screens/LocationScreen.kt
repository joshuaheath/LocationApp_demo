package com.example.locationapp.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.locationapp.MainViewModel
import com.mapbox.geojson.Point
import com.mapbox.maps.extension.compose.MapboxMap
import com.mapbox.maps.extension.compose.annotation.Marker

@Composable
fun LocationScreen(viewModel: MainViewModel) {
    Text("Locations Screen")

    MapboxMap(Modifier.fillMaxSize()) {
        Marker(
            point = Point.fromLngLat(-74.0060, 40.7128)
        )
    }
}