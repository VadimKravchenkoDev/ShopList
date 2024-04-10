package com.kravchenkovadim.shoppinglist.main_screen


import android.annotation.SuppressLint
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.FloatingActionButtonDocked
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.kravchenkovadim.shoppinglist.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    Scaffold(
        bottomBar = {
            BottomNav()
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { },
                shape = CircleShape,
                containerColor = Color(0xFF05BEFA),
            ) {
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
    ) {  // This block defines the content within the Scaffold
        FloatingActionButtonDocked(
            docked = true
        )
    }
}

