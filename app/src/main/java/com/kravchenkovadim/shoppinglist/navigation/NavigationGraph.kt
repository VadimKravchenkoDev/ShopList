package com.kravchenkovadim.shoppinglist.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kravchenkovadim.shoppinglist.ShoppingListScreen.ShoppingListScreen
import com.kravchenkovadim.shoppinglist.about_screen.AboutScreen
import com.kravchenkovadim.shoppinglist.note_list_screen.NoteListScreen
import com.kravchenkovadim.shoppinglist.setting_screen.SettingsScreen
import com.kravchenkovadim.shoppinglist.utils.Routes

@Composable
fun NavigationGraph(navController: NavHostController) {

    NavHost(navController = navController, startDestination = Routes.SHOPPING_LIST) {
        composable(Routes.SHOPPING_LIST) {
            ShoppingListScreen()
        }
        composable(Routes.NOTE_LIST) {
            NoteListScreen()
        }
        composable(Routes.ABOUT) {
            AboutScreen()
        }
        composable(Routes.SETTINGS) {
            SettingsScreen()
        }
    }
}