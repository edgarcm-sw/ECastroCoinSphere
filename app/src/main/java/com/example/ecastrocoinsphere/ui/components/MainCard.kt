package com.example.ecastrocoinsphere.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.ecastrocoinsphere.ui.theme.Surface
import com.example.ecastrocoinsphere.ui.theme.TextDim

@Composable
fun HeaderRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "#",
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            color = TextDim,
            modifier = Modifier.weight(0.2f)
        )
        Text(
            text = "Name",
            fontWeight = FontWeight.Bold,
            // fontFamily = FontFamily.SansSerif,
            fontSize = 12.sp,
            color = TextDim,
            modifier = Modifier.weight(1f)
        )
        Text(
            text = "Price",
            fontWeight = FontWeight.Bold,
            // fontFamily = FontFamily.SansSerif,
            fontSize = 12.sp,
            color = TextDim,
            modifier = Modifier.weight(1f)
        )
    }
    Divider(
        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.2f),
        thickness = 1.dp
    )
}

@Composable
fun TopCripto(num: String, url: String, name: String, price: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(5.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Surface),
        contentAlignment = Alignment.CenterStart
    ) {
        Row() {
            Text(
                text = num,
                modifier = Modifier
                    .weight(0.2f)
                )

            Box(
                modifier = Modifier
                    .width(10.dp)
                    .height(10.dp)
                    .weight(1f)
                    .clip(RoundedCornerShape(50.dp))
            ) {
                AsyncImage(
                    model = url,
                    contentDescription = name,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }

            Text(
                text = name
            )

            Text(
                text = price,
                modifier = Modifier
                    .weight(1f)
            )
        }
    }
}