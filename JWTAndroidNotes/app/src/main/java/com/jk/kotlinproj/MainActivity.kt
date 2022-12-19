package com.jk.kotlinproj

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.jk.kotlinproj.ui.theme.JWTAuthKtorAndroidTheme
import com.ramcosta.composedestinations.DestinationsNavHost
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().apply {

        }
        setContent {
            JWTAuthKtorAndroidTheme {
                DestinationsNavHost(navGraph = NavGraphs.root)
            }
        }
    }
}