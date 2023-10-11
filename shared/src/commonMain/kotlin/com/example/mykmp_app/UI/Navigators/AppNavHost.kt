package com.example.mykmp_app.UI.Navigators

import androidx.compose.runtime.Composable
import com.example.mykmp_app.UI.Navigators.Screens.Home_Screen
import com.example.mykmp_app.UI.Navigators.Screens.SplashScreen
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import moe.tlaster.precompose.navigation.transition.NavTransition


@Composable
fun AppNavHost() {
    val navigator = rememberNavigator()
    NavHost(
        navigator = navigator,
        navTransition = NavTransition(),
        initialRoute = NavigationScreens.Splash.route
    ) {
        scene(
            route = NavigationScreens.Splash.route,
            navTransition = NavTransition()
        ) {
//            SplashScreen(navigator)

            SplashScreen(navigator)
        }
        scene(
            route = NavigationScreens.Home.route,
            navTransition = NavTransition()
        ) {
            Home_Screen(navigator)
        }

    }

//    @Composable
//    fun currentRoute(navigator: Navigator): String? {
//        return navigator.currentEntry.collectAsState(null).value?.route?.route
//
//    }
}