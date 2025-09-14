package com.example.ecastrocoinsphere.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import com.example.ecastrocoinsphere.ui.components.TopCripto
import com.example.ecastrocoinsphere.ui.model.Cripto
import com.example.ecastrocoinsphere.ui.theme.Background
import com.example.ecastrocoinsphere.ui.theme.TextMain

@Composable
fun HomeScreen(innerPadding: PaddingValues) {
    // Constante list para las card de la parte superior (la información de cada una)
    val topCards = listOf(
        "Global Market Cap" to "$2.18T",
        "Fear & Greed" to "Neutral (54)",
        "Altcoin Season" to "No"
    )

    // Constante list para la Cripto Card, igual su información
    val topCriptos = listOf(
        Cripto(
            "1",
            "https://logos-world.net/wp-content/uploads/2020/08/Bitcoin-Logo.png",
            "Bitcoin",
            "$116,075.12"
        ),
        Cripto(
            "2",
            "https://www.creativefabrica.com/wp-content/uploads/2021/06/14/Cryptocurrency-Ethereum-Logo-Graphics-13394054-1.jpg",
            "Ethereum",
            "$4,685.27"
        ),
        Cripto(
            "3",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQprv8mFkdSS3n8MfBE8HGGwJd_r9UbmECu2A&s",
            "XRP",
            "$3.13"
        ),
        Cripto(
            "4",
            "https://www.creativefabrica.com/wp-content/uploads/2021/06/14/Cryptocurrency-Tether-Usdt-Logo-BNW-Graphics-13393964-1.jpg",
            "Tether",
            "$1.00"
        ),
        Cripto(
            "5",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_Tq97-Pbo95DdBUs0rEHGDkQ4eBkl8gW3WA&s",
            "Solana",
            "$246.87"
        ),
        Cripto(
            "6",
            "https://cdn.pixabay.com/photo/2021/04/30/16/47/bnb-6219388_1280.png",
            "BNB",
            "$937.12"
        ),
        Cripto(
            "7",
            "https://files.swissborg.com/product/wealth-app/assets/ic_crypto_usdc.png",
            "USD Coin",
            "$0.99983"
        ),
        Cripto(
            "8",
            "https://www.citypng.com/public/uploads/preview/hd-dogecoin-logo-icon-coin-png-701751694779734rtff9rbuve.png",
            "Dogecoin",
            "$0.29"
        ),
        Cripto(
            "9",
            "https://cdn4.iconfinder.com/data/icons/crypto-currency-and-coin-2/256/cardano_ada-512.png",
            "Cardano",
            "$0.93"
        ),
        Cripto(
            "10",
            "https://zengo.com/wp-content/uploads/Tron.png",
            "TRON",
            "$0.35"
        )
    )

    // LazyColumn en el que estara toda la información del homescreen para mejor rendimiento de la App
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
            .padding(innerPadding)
            .padding(horizontal = 10.dp),
        contentPadding = PaddingValues(vertical = 2.dp),
        verticalArrangement = Arrangement.spacedBy(2.dp)
    ) {
        item {
            Text(
                text = "CoinSphere",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = TextMain,
                modifier = Modifier.padding(top = 10.dp, bottom = 4.dp)
            )
        }

        // Top cards como items separados
        items(topCards) { (title, value) ->
            TopCard(title, value)
        }

        item {
            Spacer(modifier = Modifier.height(4.dp))
            HeaderRow()
        }

        // Lista de criptos
        items(topCriptos) { cripto ->
            TopCripto(cripto.num, cripto.url, cripto.name, cripto.price)
        }
    }
}