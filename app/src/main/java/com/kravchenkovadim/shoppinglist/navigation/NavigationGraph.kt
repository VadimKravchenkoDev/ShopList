package com.kravchenkovadim.shoppinglist.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kravchenkovadim.shoppinglist.ShoppingListScreen.ShoppingListScreen
import com.kravchenkovadim.shoppinglist.utils.Routes

@Composable
fun NavigationGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.SHOPPING_LIST ){
        composable(Routes.SHOPPING_LIST){
            ShoppingListScreen()
        }
    }
}