package com.example.ecastrocoinsphere.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.ecastrocoinsphere.ui.components.TopCard
import com.example.ecastrocoinsphere.ui.theme.Background

@Composable
fun HomeScreen() {
    val topcards = listOf(
        "Global Market Cap" to "$2.18T",
        "Fear & Greed" to "Neutral (54)",
        "Altcoin Season" to "No"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
    ) {
        Text(
            text = "CoinSphere",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )


        LazyColumn {
            items(topcards) { (textS, textI) ->
                TopCard(textS, textI)
            }
        }
    }
}