package com.example.eshop.data

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.example.eshop.R
import com.example.eshop.ui.theme.Primary

data class Product(
    val id: Int,
    val title: String,
    @DrawableRes val image: Int,
    val color: Color
)

val productList = listOf(
    Product(
        1,
        "Nike",
        R.drawable.nikes,
        Primary
    ),
    Product(
        2,
        "Puma",
        R.drawable.puma,
        Primary
    ),
    Product(
        3,
        "Under Armour",
        R.drawable.under_armour,
        Primary
    ),
    Product(
        4,
        "Adidas",
        R.drawable.adidas,
        Primary
    ),
    Product(
        5,
        "Converse",
        R.drawable.converse,
        Primary
    )

)