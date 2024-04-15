package com.example.eshop.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight.Companion.W700
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eshop.ui.theme.Primary

@Composable
fun ProfileScreen(){
    Box {
        Text(text = "Profile Screen", style = TextStyle(
            fontSize = 32.sp, fontWeight = W700, color = Primary
        ))
    }
}