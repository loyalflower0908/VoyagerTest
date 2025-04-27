package com.loyalflower.voyagertest

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen

@OptIn(ExperimentalMaterial3Api::class)
data class UserDataScreen(val user: User) : Screen {
    @Composable
    override fun Content() {
        Scaffold(
            topBar = { TopAppBar(title = { Text("User Data") }) },
            content = { innerPadding ->
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(24.dp) // 16.dp 자동 간격
                    ) {
                        Text("User Data", style = MaterialTheme.typography.headlineMedium)
                        Spacer(modifier = Modifier.height(8.dp))
                        Text("Name: ${user.name}")
                        Text("Email: ${user.email}")
                        Text("Password: ${user.password}")
                    }
                }
            }
        )
    }
}
