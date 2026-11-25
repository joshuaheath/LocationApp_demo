package com.example.locationapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.locationapp.MainViewModel
import com.mapbox.geojson.Point
import com.mapbox.maps.MapboxMap
import com.mapbox.maps.extension.compose.MapboxMap
import com.mapbox.maps.extension.compose.animation.viewport.rememberMapViewportState
import com.mapbox.maps.extension.compose.annotation.Marker

@Composable
fun MapScreen(viewModel: MainViewModel) {

    val location = viewModel.location
    location?.let {
        MapboxMap(
            Modifier.fillMaxSize(),
            mapViewportState = rememberMapViewportState {
                setCameraOptions {
                    zoom(7.0)
                    center(Point.fromLngLat(location.longitude, location.latitude))
                    pitch(0.0)
                    bearing(0.0)

                }
            }) {
            Marker(
                point = Point.fromLngLat(location.longitude, location.latitude)
            )
        }
    }

    Column() {
        Text("Map Screen")
    }

}