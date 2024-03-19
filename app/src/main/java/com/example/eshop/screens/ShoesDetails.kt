package com.example.eshop.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight.Companion.W400
import androidx.compose.ui.text.font.FontWeight.Companion.W500
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eshop.R
import com.example.eshop.components.SpacerHeight
import com.example.eshop.components.SpacerWidth
import com.example.eshop.ui.theme.Backgorund
import com.example.eshop.ui.theme.LightGrey
import com.example.eshop.ui.theme.Primary

@Composable
fun ShoesDetails() {
    Box(
        modifier = Modifier
            .background(Backgorund)
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            ShoesDetailsHeader()
            ImageView()
            OtherComponents()
        }
    }


}

@Composable
fun ShoesDetailsHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(40.dp),
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

        Text(
            text = stringResource(id = R.string.mens_shoes),
            fontSize = 20.sp,
            fontWeight = W500,
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

@Composable
fun ImageView() {
    Box(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .size(width = 0.dp, height = 200.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.nike_2), contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .size(width = 310.dp, height = 176.dp)
        )
        Box(
            modifier = Modifier
                .padding(top = 110.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.shoes_360), contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .size(width = 311.dp, height = 50.dp)
            )
            Box(
                modifier = Modifier
                    .padding(top = 27.dp)
                    .background(Primary, RoundedCornerShape(36.dp))
                    .size(42.dp)
                    .align(Alignment.Center)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.polygon_1),
                        contentDescription = "",
                        modifier = Modifier
                            .size(16.5.dp)
                            .padding(start = 6.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.polygon_2),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(end = 6.dp)
                            .size(12.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun OtherComponents() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White, RoundedCornerShape(24.dp))
    ) {
        Column(
            modifier = Modifier
                .padding(20.dp)
        ) {
            ShoeDetails()
            SpacerHeight()
            ShoeGallery()
            ShoeSize()
        }
    }
}
//@Composable
//fun Details(){
//    ShoeDetails(shoes = Shoes)
//}

@Composable
fun ShoeDetails() {

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "BEST SELLER", style = TextStyle(
                fontSize = 16.sp, fontWeight = W400, color = Primary
            )
        )
        SpacerHeight(5.dp)
        Text(
            text = "Nike", style = TextStyle(
                fontSize = 24.sp, fontWeight = W500, color = colorResource(id = R.color.title_color)
            )
        )
        Text(
            text = "Rs.1199", style = TextStyle(
                fontSize = 20.sp, fontWeight = W500, color = colorResource(id = R.color.title_color)
            )
        )
        SpacerHeight(5.dp)
        Text(
            text = "Air Jordan is an American brand of basketball shoes athletic, casual, and style clothing produced by Nike....",
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = W400,
                color = colorResource(id = R.color.subtitle_color)
            )
        )
    }
    //"${"Rs." + shoes.mrp}"
}

@Composable
fun ShoeGallery() {
    Column {
        Text(
            text = "Gallery", style = TextStyle(
                fontSize = 22.sp, fontWeight = W500, color = colorResource(id = R.color.title_color)
            )
        )
        Row(
            modifier = Modifier
                .padding(top = 10.dp)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.nike_prev_ui), contentDescription = "",
                modifier = Modifier
                    .size(56.dp)
                    .background(LightGrey, RoundedCornerShape(10.dp))
            )
            SpacerWidth()
            Image(
                painter = painterResource(id = R.drawable.nike_prev_ui), contentDescription = "",
                modifier = Modifier
                    .size(56.dp)
                    .background(LightGrey, RoundedCornerShape(10.dp))
            )
            SpacerWidth()
            Image(
                painter = painterResource(id = R.drawable.nike_prev_ui), contentDescription = "",
                modifier = Modifier
                    .size(56.dp)
                    .background(LightGrey, RoundedCornerShape(10.dp))
            )
        }
    }
}

@Composable
fun ShoeSize() {
    Column(
        modifier = Modifier
            .padding(top = 10.dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Size", style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = W500,
                    color = colorResource(id = R.color.title_color)
                )
            )
            Row {
                Text(
                    text = "EU",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = W500,
                        color = colorResource(id = R.color.title_color)
                    ),
                    //modifier = Modifier.size(30.dp)
                )
                SpacerWidth()
                Text(
                    text = "US",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = W500,
                        color = colorResource(id = R.color.title_color)
                    ),
                    //modifier = Modifier.size(30.dp)
                )
                SpacerWidth()
                Text(
                    text = "UK",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = W500,
                        color = colorResource(id = R.color.title_color)
                    ),
                    //modifier = Modifier.size(30.dp)
                )
            }
        }

        Row(
            modifier = Modifier
                .padding(top = 10.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "6", style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = W400,
                    color = colorResource(id = R.color.subtitle_color)
                ),
                modifier = Modifier
                    .background(LightGrey, RoundedCornerShape(36.dp))
                    .size(50.dp),
                textAlign = TextAlign.Center
            )
            Text(
                text = "7", style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = W400,
                    color = colorResource(id = R.color.subtitle_color)
                ),
                modifier = Modifier
                    .background(LightGrey, RoundedCornerShape(36.dp))
                    .size(50.dp),
                textAlign = TextAlign.Center
            )
            Text(
                text = "8", style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = W400,
                    color = colorResource(id = R.color.subtitle_color)
                ),
                modifier = Modifier
                    .background(LightGrey, RoundedCornerShape(36.dp))
                    .size(50.dp),
                textAlign = TextAlign.Center
            )
            Text(
                text = "9", style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = W400,
                    color = colorResource(id = R.color.subtitle_color)
                ),
                modifier = Modifier
                    .background(LightGrey, RoundedCornerShape(36.dp))
                    .size(50.dp),
                textAlign = TextAlign.Center
            )
            Text(
                text = "10", style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = W400,
                    color = colorResource(id = R.color.subtitle_color)
                ),
                modifier = Modifier
                    .background(LightGrey, RoundedCornerShape(36.dp))
                    .size(50.dp),
                textAlign = TextAlign.Center
            )
            Text(
                text = "11", style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = W400,
                    color = colorResource(id = R.color.subtitle_color)
                ),
                modifier = Modifier
                    .background(LightGrey, RoundedCornerShape(36.dp))
                    .size(50.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}