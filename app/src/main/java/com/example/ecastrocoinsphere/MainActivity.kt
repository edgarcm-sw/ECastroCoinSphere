package com.example.ecastrocoinsphere

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ecastrocoinsphere.ui.screens.HomeScreen
import com.example.ecastrocoinsphere.ui.theme.ECastroCoinSphereTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ECastroCoinSphereTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Le agrego el padding de la interfaz a la pantalla principal
                    HomeScreen(innerPadding)
                }
            }
        }
    }
}



@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    ECastroCoinSphereTheme {
        // Ejecuto el HomeScreen como Pantalla principal al ejecutar
        HomeScreen(
            PaddingValues(20.dp)
        )
    }
}