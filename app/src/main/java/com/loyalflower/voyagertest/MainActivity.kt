package com.loyalflower.voyagertest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.loyalflower.voyagertest.ui.theme.VoyagerTestTheme
import cafe.adriel.voyager.navigator.Navigator

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VoyagerTestTheme {
                Navigator(screen = HomeScreen)
            }
        }
    }
}
