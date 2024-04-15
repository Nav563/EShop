package com.example.eshop.screens.navigation

sealed class Screens (val screen : String){

    data object HomeScreen: Screens("home_screen")
    data object FavoriteScreen: Screens("favorite_screen")
    data object CartScreen: Screens("cart_screen")
    data object Notification: Screens("notification_screen")
    data object ProfileScreen: Screens("profile_screen")
    data object ShoesDetails: Screens("shoes_details")
}