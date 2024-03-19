package com.example.bottom_bar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bottom_bar.ui.theme.GreenJc

@Composable
fun Settings(){
    Box(modifier= Modifier.fillMaxSize()){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center)
                .padding(30.dp)
            ,
//            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            Text(text = "This is setting page", fontSize = 30.sp, color = GreenJc)
            Spacer(modifier = Modifier.height(50.dp))
            Button(
                modifier=Modifier
                    .padding(20.dp)
                    .size(width = 250.dp, height = 60.dp)
                ,
                onClick = { }
            ) {
                Text(text = "Change Username",
                    fontSize = 25.sp)
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                modifier=Modifier
                    .padding(20.dp)
                    .size(width = 250.dp, height = 60.dp)
                ,
                onClick = {}
            ) {
                Text(text = "Delete Account",
                    fontSize = 25.sp, color = Color(0xFFFF0000)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                modifier=Modifier
                    .padding(20.dp)
                    .size(width = 250.dp, height = 60.dp)
                ,
                onClick = { }
            ) {
                Text(text = "Log out",
                    fontSize = 25.sp)
            }

        }
    }
}
