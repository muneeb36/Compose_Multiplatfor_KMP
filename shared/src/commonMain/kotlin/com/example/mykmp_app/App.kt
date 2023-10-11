package com.example.mykmp_app

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.mykmp_app.UI.Navigators.AppNavHost
import kotlinx.coroutines.*
import org.jetbrains.compose.resources.ExperimentalResourceApi


@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {


    MaterialTheme {

        AppNavHost()

//        SplashScreen()
    }
}

