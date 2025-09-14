package com.example.ecastrocoinsphere.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.ecastrocoinsphere.ui.theme.Surface
import com.example.ecastrocoinsphere.ui.theme.TextDim
import com.example.ecastrocoinsphere.ui.theme.TextMain

@Composable
fun TopCripto(num: String, url: String, name: String, price: String) {
    // Box del diseño de las Card de las criptos
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(65.dp)
            .padding(5.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Surface),
        contentAlignment = Alignment.CenterStart
    ) {
        // Row para el acomodo de la información
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Texto del numero de cada Cripto (num que sale de la lista creada en el homescreen)
            Text(
                text = num,
                fontWeight = FontWeight.Bold,
                fontSize = 13.sp,
                color = TextDim,
                modifier = Modifier
                    .weight(0.3f)
                    .padding(start = 10.dp)
                )

            // Box con el diseño de la imagen traida de internet
            Box(
                modifier = Modifier
                    .padding(start = 5.dp, end = 10.dp)
                    .size(30.dp)
                    .clip(CircleShape),
                contentAlignment = Alignment.CenterStart
            ) {
                AsyncImage(
                    model = url,
                    contentDescription = name,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }

            // Diseño del texto del nombre de la cripto (name de la lista creada)
            Text(
                text = name,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = TextMain,
                modifier = Modifier
                    .weight(1f)
            )

            // Diseño del precio de cada cripto (price de la lista creada)
            Text(
                text = price,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = TextMain,
                modifier = Modifier
                    .weight(1.5f)
            )
        }
    }
}