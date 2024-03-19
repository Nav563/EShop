package com.example.eshop.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.eshop.onboarding.OnboardOneScreen
import com.example.eshop.onboarding.OnboardThreeScreen
import com.example.eshop.onboarding.OnboardTwoScreen
import com.example.eshop.onboarding.SplashScreen
import com.example.eshop.screens.HomeScreen
import com.example.eshop.screens.ShoesDetails
import com.example.eshop.screens.auth.SignInScreen
import com.example.eshop.screens.auth.SignUpScreen

@Composable
fun StartNavigation() {
    val navController = rememberNavController()
    //var searchList = remember { mutableStateOf( }

    NavHost(
        navController = navController,
        startDestination = Splash
    ) {
        composable(Splash) {
            SplashScreen(navController)
        }
        composable(SignIn) {
            SignInScreen(navController)
        }
        composable(SignUp) {
            SignUpScreen(navController)
        }
        composable(OnBoard1) {
            OnboardOneScreen(navController)
        }
        composable(OnBoard2) {
            OnboardTwoScreen(navController)
        }
        composable(OnBoard3) {
            OnboardThreeScreen(navController)
        }
        composable(Home) {
            HomeScreen(navController)
        }
        composable(ShoesDetails) {
            ShoesDetails()
        }
    }
}

const val Splash = "splash_screen"
const val SignIn = "signin_screen"
const val SignUp = "register_screen"
const val OnBoard1 = "onboard_one_screen"
const val OnBoard2 = "onboard_two_screen"
const val OnBoard3 = "onboard_three_screen"
const val Home = "home_screen"
const val ShoesDetails = "shoes_details"
const val Posts = "profile_item_row"
const val PunyaCoins = "profile_item_row"
const val ShareBhandara = "share_bhandara_screen"
const val ChefDetails = "chef_details_screen"