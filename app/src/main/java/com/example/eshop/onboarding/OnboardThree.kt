package com.example.eshop.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.eshop.R
import com.example.eshop.navigation.SignIn
import com.example.eshop.ui.theme.Background

@Composable
fun OnboardThreeScreen(navHostController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .background(Background)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ellipse_906),
            contentDescription = "onboardone", modifier = Modifier
                .size(160.dp)
                .align(Alignment.TopEnd)
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxSize()
                .padding(20.dp),
            //horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.elipse_905), contentDescription = "",
                modifier = Modifier
                    .size(136.dp)
                    .padding(top = 120.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
            ) {

                Image(
                    painter = painterResource(id = R.drawable.nike), contentDescription = "nike",
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(width = 250.dp, height = 250.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.spring_prev_ui),
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(width = 280.dp, height = 270.dp)
                        .padding(top = 20.dp)
                )
            }
            Image(
                painter = painterResource(id = R.drawable.ellipse_903), contentDescription = "",
                modifier = Modifier
                    .size(10.dp)
                    .align(Alignment.End)
            )
            Image(
                painter = painterResource(id = R.drawable.ellipse_904), contentDescription = "",
                modifier = Modifier
                    .size(75.dp)
                    .padding(top = 60.dp)
            )

            Text(
                text = stringResource(id = R.string.onboard_three_title),
                fontSize = 40.sp, fontWeight = FontWeight.W500,
                fontStyle = FontStyle.Italic,
                modifier = Modifier
                    .padding(top = 20.dp)
            )
            Text(
                text = stringResource(id = R.string.onboard_three_subtitle),
                fontSize = 20.sp, fontWeight = FontWeight.W400,
                fontFamily = FontFamily.Cursive,
                color = colorResource(id = R.color.subtitle_color),
                modifier = Modifier
                    .padding(top = 10.dp)
            )
            NavigationRow3 {
                navHostController.navigate(SignIn)
            }
        }
    }
}
@Composable
fun NavigationRow3(onClick: () -> Unit){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 60.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row {
            Image(
                painter = painterResource(id = R.drawable.rectangle_1104),
                contentDescription = "",
                modifier = Modifier
            )
            Spacer(modifier = Modifier.width(5.dp))
            Image(
                painter = painterResource(id = R.drawable.rectangle_1105),
                contentDescription = "",
                modifier = Modifier
            )
            Spacer(modifier = Modifier.width(5.dp))
            Image(
                painter = painterResource(id = R.drawable.rectangle_1103),
                contentDescription = "",
                modifier = Modifier
            )

        }

        TextButton(
            onClick = onClick,
            modifier = Modifier
                .size(150.dp, 54.dp)
                .background(colorResource(id = R.color.primary), RoundedCornerShape(36.dp))
        ) {
            Text(text = stringResource(id = R.string.next), color = Color.White)
        }
    }
}