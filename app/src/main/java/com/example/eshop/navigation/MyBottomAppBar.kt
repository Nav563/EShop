package com.example.eshop.navigation

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.eshop.screens.CartScreen
import com.example.eshop.screens.FavoriteScreen
import com.example.eshop.screens.HomeScreen
import com.example.eshop.screens.NotificationScreen
import com.example.eshop.screens.ProfileScreen
import com.example.eshop.screens.ShoesDetails
import com.example.eshop.screens.navigation.Screens
import com.example.eshop.ui.theme.LightGrey
import com.example.eshop.ui.theme.Primary


@Composable
fun MyBottomAppBar() {
    val navController = rememberNavController()
    val context = LocalContext.current.applicationContext
    val selected = remember {
        mutableStateOf(Icons.Default.Home)
    }

    Scaffold(
        bottomBar = {
            BottomAppBar(containerColor = Primary, modifier = Modifier.height(60.dp)) {
                IconButton(
                    onClick = {
                        selected.value = Icons.Default.Home
                        navController.navigate(Screens.HomeScreen.screen) {
                            popUpTo(0)
                        }
                    },
                    modifier = Modifier.weight(1F)
                ) {
                    Icon(
                        Icons.Default.Home,
                        contentDescription = null,
                        modifier = Modifier
                            .size(26.dp),
                        tint = if (selected.value == Icons.Default.Home) Color.White
                        else LightGrey
                    )
                }

                IconButton(
                    onClick = {
                        selected.value = Icons.Default.FavoriteBorder
                        navController.navigate(Screens.FavoriteScreen.screen) {
                            popUpTo(0)
                        }
                    },
                    modifier = Modifier.weight(1F)
                ) {
                    Icon(
                        Icons.Default.FavoriteBorder,
                        contentDescription = null,
                        modifier = Modifier
                            .size(26.dp),
                        tint = if (selected.value == Icons.Default.FavoriteBorder) Color.White
                        else LightGrey
                    )
                }

                IconButton(
                    onClick = {
                        selected.value = Icons.Default.ShoppingCart
                        navController.navigate(Screens.CartScreen.screen) {
                            popUpTo(0)
                        }
                    },
                    modifier = Modifier.weight(1F)
                ) {
                    Icon(Icons.Default.ShoppingCart, contentDescription = null, modifier = Modifier
                        .size(26.dp), tint = if (selected.value == Icons.Default.ShoppingCart) Color.White
                    else LightGrey)
                }
//                Box(
//                    modifier = Modifier
//                        .weight(1F)
//                        .padding(16.dp),
//                    //contentAlignment = Alignment.BottomEnd
//                ) {
//                    FloatingActionButton(onClick = {
//                        Toast.makeText(
//                            context,
//                            " Open Cart",
//                            Toast.LENGTH_SHORT
//                        ).show()
//                    }) {
//                        Icon(Icons.Default.ShoppingCart, contentDescription = null, tint = Primary)
//                    }
//                }

                IconButton(
                    onClick = {
                        selected.value = Icons.Default.Notifications
                        navController.navigate(Screens.Notification.screen) {
                            popUpTo(0)
                        }
                    },
                    modifier = Modifier.weight(1F)
                ) {
                    Icon(
                        Icons.Default.Notifications,
                        contentDescription = null,
                        modifier = Modifier
                            .size(26.dp),
                        tint = if (selected.value == Icons.Default.Notifications) Color.White
                        else LightGrey
                    )
                }
                IconButton(
                    onClick = {
                        selected.value = Icons.Default.Person
                        navController.navigate(Screens.ProfileScreen.screen) {
                            popUpTo(0)
                        }
                    },
                    modifier = Modifier.weight(1F)
                ) {
                    Icon(
                        Icons.Default.Person,
                        contentDescription = null,
                        modifier = Modifier
                            .size(26.dp),
                        tint = if (selected.value == Icons.Default.Person) Color.White
                        else LightGrey
                    )
                }

            }
        }
    ) {paddingValues ->
        NavHost(navController = navController,
            startDestination = Screens.HomeScreen.screen,
            modifier = Modifier.padding(paddingValues)){
            composable(Screens.HomeScreen.screen){
               HomeScreen(navController)
            }
            composable(Screens.FavoriteScreen.screen){
                FavoriteScreen()
            }
            composable(Screens.CartScreen.screen){
                CartScreen()
            }
            composable(Screens.Notification.screen){
                NotificationScreen()
            }
            composable(Screens.ProfileScreen.screen){
                ProfileScreen()
            }
            composable(Screens.ShoesDetails.screen){
                ShoesDetails()
            }
        }

    }
}