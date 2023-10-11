package com.example.mykmp_app.Ktor

import androidx.compose.runtime.Composable
import com.example.mykmp_app.App


//// Android-specific code (AndroidMain)
//actual class AndroidLogger : Logger {
//    override fun log(message: String) {
//        android.util.Log.d("MyApp", message)
//    }
//}
@Composable
fun MainView() = App()
