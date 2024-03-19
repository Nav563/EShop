package com.example.eshop.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.W700
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.eshop.R
import com.example.eshop.navigation.OnBoard1
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navHostController: NavHostController){
    Box(modifier = Modifier
        .fillMaxSize()
        .fillMaxHeight(1F)){
        val scope = rememberCoroutineScope()
        LaunchedEffect(key1 = true) {
            // Simulating a heavy task delay
            delay(2000)
            navHostController.navigate(OnBoard1)
        }
        Image(painter = painterResource(id = R.drawable.splash), contentDescription = "", contentScale = ContentScale.FillHeight,
            modifier = Modifier.fillMaxHeight())

        Text(text = stringResource(id = R.string.oxy_boots),
            color = Color.White,
            fontSize = 28.sp,
            fontWeight = W700,
            modifier = Modifier
                .align(Alignment.Center))
    }
}

