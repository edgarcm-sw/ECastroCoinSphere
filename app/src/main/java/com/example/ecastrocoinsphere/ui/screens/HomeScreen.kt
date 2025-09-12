package com.example.ecastrocoinsphere.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ecastrocoinsphere.ui.components.HeaderRow
import com.example.ecastrocoinsphere.ui.components.TopCard
import com.example.ecastrocoinsphere.ui.theme.Background
import com.example.ecastrocoinsphere.ui.theme.TextMain

@Composable
fun HomeScreen(innerPadding: PaddingValues) {
    val topCards = listOf(
        "Global Market Cap" to "$2.18T",
        "Fear & Greed" to "Neutral (54)",
        "Altcoin Season" to "No"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
            .padding(innerPadding)
            .padding(horizontal = 10.dp)
    ) {
        Text(
            text = "CoinSphere",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = TextMain,
            modifier = Modifier
                .padding(top = 10.dp, bottom = 10.dp)
        )


        LazyColumn {
            items(topCards) { (textS, textI) ->
                TopCard(textS, textI)
            }
        }

        LazyColumn {
            item {
                HeaderRow()
            }
        }
    }
}