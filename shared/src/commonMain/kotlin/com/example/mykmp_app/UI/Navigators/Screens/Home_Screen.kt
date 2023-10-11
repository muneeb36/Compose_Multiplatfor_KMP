package com.example.mykmp_app.UI.Navigators.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import moe.tlaster.precompose.navigation.Navigator

@Composable
fun Home_Screen(navigator: Navigator)
{
    MyUI()
}

@Composable
fun MyUI() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Button(
            onClick = {

            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("Hello")
        }
    }
}