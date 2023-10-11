package com.example.mykmp_app.UI.Navigators


sealed class NavigationScreens(val route:String) {
    object Splash: NavigationScreens(route = "screen_splash")
    object Home: NavigationScreens(route = "screen_home")

}
