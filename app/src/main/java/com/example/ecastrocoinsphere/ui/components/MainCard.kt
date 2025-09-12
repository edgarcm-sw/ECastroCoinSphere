package com.example.ecastrocoinsphere.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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