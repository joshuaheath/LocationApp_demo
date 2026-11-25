package com.example.locationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mapbox.geojson.Point
import com.mapbox.maps.extension.compose.MapboxMap
import com.mapbox.maps.extension.compose.animation.viewport.rememberMapViewportState
import com.mapbox.maps.plugin.attribution.Attribution
import com.mapbox.maps.plugin.scalebar.ScaleBar

import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import com.example.locationapp.ui.Navigation
import com.example.locationapp.ui.theme.LocationAppTheme
import com.mapbox.maps.MapboxExperimental
import com.mapbox.maps.extension.compose.MapboxMap
import com.mapbox.maps.extension.compose.annotation.Marker


import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import com.mapbox.maps.extension.compose.MapboxMap
import com.mapbox.maps.extension.compose.annotation.Marker

@OptIn(MapboxExperimental::class)
public class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LocationAppTheme {
                Navigation()

                }
            }
        }
    }
