package com.example.journalia

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation()
{
    val navController = rememberNavController()

    NavHost(navController = navController , startDestination = "A" )
    {
        composable(route = "A"){
            HomePage(navController = navController)
        }
        composable(route = "B"){
            Calender(navController = navController)
        }
        composable(route = "C"){
            ClubPage(navController = navController)
        }
        composable(route = "D"){
            ClubSubPage(navController = navController)
        }
        composable(route = "E"){
            CircularPage(navController = navController)
        }
    }
    SearchBar(navController = navController)
}