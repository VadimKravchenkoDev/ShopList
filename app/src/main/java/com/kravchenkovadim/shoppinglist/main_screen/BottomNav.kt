package com.kravchenkovadim.shoppinglist.main_screen

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.kravchenkovadim.shoppinglist.ui.theme.BlueLight

@Composable

fun BottomNav(
    navController: NavHostController
) {
    val listItems = listOf(
        BottomNavItem.ListItem,
        BottomNavItem.NoteItem,
        BottomNavItem.AboutItem,
        BottomNavItem.SettingsItem
    )
    BottomNavigation(backgroundColor = Color.White) {
        listItems.forEach { bottomNavItem ->
            BottomNavigationItem(
                selected = false,
                onClick = {
                    navController.navigate(bottomNavItem.route)
                },
                icon = {
                    Icon(
                        painter = painterResource(
                            id = bottomNavItem.iconId
                        ),
                        contentDescription = "icon",
                    )
                },
                label = {
                    Text(text = bottomNavItem.title)
                },
                selectedContentColor = BlueLight,
                unselectedContentColor = Color.Gray,
                alwaysShowLabel = false
            )
        }
    }
}