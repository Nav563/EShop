package com.example.eshop.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.W400
import androidx.compose.ui.text.font.FontWeight.Companion.W500
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eshop.R
import com.example.eshop.components.SpacerHeight
import com.example.eshop.components.SpacerWidth
import com.example.eshop.screens.navigation.Screens
import com.example.eshop.ui.theme.Background
import com.example.eshop.ui.theme.Primary

@Preview
@Composable
fun FavoriteScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
    ) {
        Column {
            FavoritesHeader()
        }
    }
}

@Composable
fun FavoritesHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(25.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .size(20.dp)
                .background(Color.White, RoundedCornerShape(30.dp))
        ) {
            Icon(painter = painterResource(id = R.drawable.back), contentDescription = "")
        }

        androidx.compose.material3.Text(
            text = stringResource(id = R.string.favorite),
            fontSize = 20.sp,
            fontWeight = FontWeight.W500,
            color = colorResource(id = R.color.title_color)
        )
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .size(20.dp)
                .background(Color.White, RoundedCornerShape(30.dp))
        ) {
            Icon(painter = painterResource(id = R.drawable.bag), contentDescription = "")
        }
    }
}

@Preview
@Composable
fun FavoriteItems() {
    Box(
        modifier = Modifier
            .background(Color.White, RoundedCornerShape(6.dp))
            .width(156.dp)
            .height(203.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(10.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(imageVector = Icons.Default.FavoriteBorder, contentDescription = "",
                    modifier = Modifier
                        .clickable {

                        })
                Image(painter = painterResource(id = R.drawable.nike_2), contentDescription = "")
            }

            Text(
                text = "BEST SELLER",
                style = TextStyle(fontSize = 14.sp, fontWeight = W400, color = Primary)
            )
            SpacerHeight()
            Text(
                text = "BEST SELLER", style = TextStyle(
                    fontSize = 18.sp, fontWeight = W500, color = colorResource(
                        id = R.color.title_color
                    )
                )
            )
            SpacerHeight()

            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "$58.7", modifier = Modifier
                        .weight(1F), style = TextStyle(
                        fontSize = 18.sp, fontWeight = W500, color = colorResource(
                            id = R.color.title_color
                        )
                    )
                )
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .background(Color.Yellow, RoundedCornerShape(36.dp))
                        .size(20.dp),
                    colors = ButtonColors(
                        Color.Yellow,
                        contentColor = Color.Yellow,
                        disabledContentColor = Color.Yellow,
                        disabledContainerColor = Color.Yellow
                    )
                ) {

                }
                SpacerWidth()
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .background(Color.Green, RoundedCornerShape(36.dp))
                        .size(20.dp),
                    colors = ButtonColors(
                        Color.Green,
                        contentColor = Color.Green,
                        disabledContentColor = Color.Green,
                        disabledContainerColor = Color.Green
                    )
                ) {

                }
            }
        }
    }
}