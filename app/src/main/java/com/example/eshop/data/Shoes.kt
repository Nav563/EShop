package com.example.eshop.data

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.example.eshop.R
import com.example.eshop.ui.theme.Primary

data class Shoes(
    val id: Int,
    val status: String,
    val name: String,
    val mrp: Int,
    @DrawableRes val image: Int,
    val color: Color,
    val size: List<Int>,
    val details: String
)

val shoesList = listOf(
    Shoes(
        1,
        "BEST SELLER",
        "Nike Jordan",
        1199,
        R.drawable.nike_prev_ui,
        Primary,
        listOf(5,6,7,8,9,10,11,12),
        "Air Jordan is an American brand of basketball shoes athletic, casual, and style clothing produced by Nike...."
    ),
    Shoes(
        2,
        "BEST SELLER",
        "Nike Air Max",
        1099,
        R.drawable.spring_prev_ui,
        Primary,
        listOf(5,6,7,8,9,10,11,12),
        "Air Jordan is an American brand of basketball shoes athletic, casual, and style clothing produced by Nike...."
    ),
    Shoes(
        3,
        "BEST SELLER",
        "Nike Air Force",
        199,
        R.drawable.digital_sketches_prev_ui,
        Primary,
        listOf(5,6,7,8,9,10,11,12),
        "Air Jordan is an American brand of basketball shoes athletic, casual, and style clothing produced by Nike...."
    ),
    Shoes(
        4,
        "BEST SELLER",
        "PUMA x CIELE",
        299,
        R.drawable.spring_prev_ui,
        Primary,
        listOf(5,6,7,8,9,10,11,12),
        "Air Jordan is an American brand of basketball shoes athletic, casual, and style clothing produced by Nike...."
    ),
    Shoes(
        5,
        "BEST SELLER",
        "PUMA velocity",
        499,
        R.drawable.nike_prev_ui,
        Primary,
        listOf(5,6,7,8,9,10,11,12),
        "Air Jordan is an American brand of basketball shoes athletic, casual, and style clothing produced by Nike...."
    ),
    Shoes(
        6,
        "BEST SELLER",
        "PUMA Electrify",
        799,
        R.drawable.digital_sketches_prev_ui,
        Primary,
        listOf(5,6,7,8,9,10,11,12),
        "Air Jordan is an American brand of basketball shoes athletic, casual, and style clothing produced by Nike...."
    ),
    Shoes(
        7,
        "BEST SELLER",
        "Adidas XLG",
        899,
        R.drawable.nike_prev_ui,
        Primary,
        listOf(5,6,7,8,9,10,11,12),
        "Air Jordan is an American brand of basketball shoes athletic, casual, and style clothing produced by Nike...."
    ),
    Shoes(
        8,
        "BEST SELLER",
        "Adidas Adiform",
        999,
        R.drawable.spring_prev_ui,
        Primary,
        listOf(5,6,7,8,9,10,11,12),
        "Air Jordan is an American brand of basketball shoes athletic, casual, and style clothing produced by Nike...."
    ),
    Shoes(
        9,
        "BEST SELLER",
        "Adidas Samba OG",
        699,
        R.drawable.digital_sketches_prev_ui,
        Primary,
        listOf(5,6,7,8,9,10,11,12),
        "Air Jordan is an American brand of basketball shoes athletic, casual, and style clothing produced by Nike...."
    ),
    Shoes(
        10,
        "BEST SELLER",
        "Adidas Gazelle",
        599,
        R.drawable.nike_prev_ui,
        Primary,
        listOf(5,6,7,8,9,10,11,12),
        "Air Jordan is an American brand of basketball shoes athletic, casual, and style clothing produced by Nike...."
    )
)
