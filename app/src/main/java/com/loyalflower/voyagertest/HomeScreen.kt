package com.loyalflower.voyagertest

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

@OptIn(ExperimentalMaterial3Api::class)
object HomeScreen : Screen {
    private fun readResolve(): Any = HomeScreen

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        var name by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var pw by remember { mutableStateOf("") }

        Scaffold(
            topBar = { TopAppBar(title = { Text("Voyager Test Home") }) },
            content = { innerPadding ->
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(40.dp) // 16.dp 자동 간격
                    ) {
                        TextField(
                            value = name,
                            onValueChange = { name = it },
                            label = { Text("Name") }
                        )
                        TextField(
                            value = email,
                            onValueChange = { email = it },
                            label = { Text("Email") }
                        )
                        TextField(
                            value = pw,
                            onValueChange = { pw = it },
                            label = { Text("Password") }
                        )
                        Button(onClick = {
                            navigator.push(UserDataScreen(
                                User(
                                    name = name,
                                    email = email,
                                    password = pw
                                )
                            ))
                        }) {
                            Text("User Data Class to Detail Screen")
                        }
                    }
                }
            }
        )
    }
}
