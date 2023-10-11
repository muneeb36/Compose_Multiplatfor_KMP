package com.example.mykmp_app.UI.Navigators.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.mykmp_app.UI.Navigators.NavigationScreens
import io.kamel.core.utils.File
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import kotlinx.coroutines.delay
import moe.tlaster.precompose.navigation.Navigator
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
@Composable
fun SplashScreen(
    navigator: Navigator
){

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        // Background gradient
        Box(
            modifier = Modifier.fillMaxSize().background(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color.Blue, Color.Green), // Customize your gradient colors
                        startY = 0f,
                        endY = 1000f
                    )
                )
        )

        // Image with blink animation
        var isBlinking by remember { mutableStateOf(true) }
        val alpha = if (isBlinking) 1f else 0f

        KamelImage(
//            asyncPainterResource(data = File("/Volumes/MyDrive/KMP_Projects/MyKMP_app/shared/src/commonMain/resources/compose_multiplatform.xml")),
            asyncPainterResource(data = File("/Volumes/MyDrive/KMP_Projects/MyKMP_app/shared/src/commonMain/resources/compose_multiplatform.xml")),
            null,
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(200.dp).alpha(alpha),
            onFailure = {
                Text("Error in image loading")
            }
        )


        LaunchedEffect(isBlinking) {
            delay(5000) // Adjust blink duration as needed (e.g., 1000ms)
            isBlinking = false
            delay(5000) // Delay before transitioning (e.g., 1000ms)
            isBlinking = true
            navigator.navigate(NavigationScreens.Home.route)
        }

    }
}
