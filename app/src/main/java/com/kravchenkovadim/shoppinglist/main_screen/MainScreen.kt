package com.kravchenkovadim.shoppinglist.main_screen

import android.annotation.SuppressLint
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.rememberNavController
import com.kravchenkovadim.shoppinglist.R
import com.kravchenkovadim.shoppinglist.ShoppingListScreen.ShoppingListScreen
import com.kravchenkovadim.shoppinglist.navigation.NavigationGraph
import com.kravchenkovadim.shoppinglist.ui.theme.BlueLight
import com.kravchenkovadim.shoppinglist.ui.theme.Purple80

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "UnusedMaterialScaffoldPaddingParameter")

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomNav(navController)
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { },
                backgroundColor = Purple80) {
                Icon(
                    painter = painterResource(
                        id = R.drawable.add_icon
                    ),
                    contentDescription = "Add",
                    tint = Color.White,
                )
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        isFloatingActionButtonDocked = true
    ){
        NavigationGraph(navController)
    }
}
