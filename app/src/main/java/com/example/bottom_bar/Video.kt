package com.example.bottom_bar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.bottom_bar.ui.theme.GreenJc


@Composable
fun Video(navController: NavController){
    Box(modifier= Modifier.fillMaxSize()) {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp)
            ,
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start)
        {
            IconButton(
                onClick = { navController.popBackStack() },
                modifier = Modifier.padding(20.dp)
            ) {
                Icon(
                    Icons.Default.ArrowBack,
                    contentDescription = "Back to Home",
                    tint = Color.Black
                )
            }
            Text(text = "This is video page", fontSize = 30.sp, color = Color.Green)
        }
    }
}