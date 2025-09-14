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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ecastrocoinsphere.ui.theme.TextDim

@Composable
// Diseño de la separación de la información de las Cripto
fun HeaderRow() {
    // Row para el acomodo de la información
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        // Textos con su respectivo diseño y proporciones de la Row (Weight)
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
    // Linea para dividir esa información de la Card de las Criptos
    Divider(
        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.2f),
        thickness = 1.dp
    )
}