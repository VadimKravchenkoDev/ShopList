package com.kravchenkovadim.shoppinglist.main_screen

import com.kravchenkovadim.shoppinglist.R

sealed class BottomNavItem (val title: String, val iconId: Int, val route: String){
    object ListItem: BottomNavItem("List", R.drawable.list_icon, "route1")
    object NoteItem: BottomNavItem("Note", R.drawable.note_icon, "route2")
    object AboutItem: BottomNavItem("About", R.drawable.about_icon, "route3")
    object SettingsItem: BottomNavItem("Settings", R.drawable.settings_icon, "route4")
}