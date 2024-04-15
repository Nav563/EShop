package com.example.eshop.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.eshop.ui.theme.Primary

@Composable
fun CartScreen(){
    Box {
        Text(text = "Cart Screen", style = TextStyle(
            fontSize = 32.sp, fontWeight = FontWeight.W700, color = Primary
        )
        )
    }
}