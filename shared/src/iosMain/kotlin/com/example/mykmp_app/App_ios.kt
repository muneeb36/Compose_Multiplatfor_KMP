package com.example.mykmp_app

import androidx.compose.ui.window.ComposeUIViewController

fun MainViewController() = ComposeUIViewController { App() }

//// iOS-specific code (iOSMain)
//actual class iOSLogger : Logger {
//    override fun log(message: String) {
//        println(message)
//    }
//}