package com.example.bottom_bar

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bottom_bar.ui.theme.Bottom_BarTheme
import com.example.bottom_bar.ui.theme.GreenJc

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Bottom_BarTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                 MyBottomAPPBar()
                }
            }
        }
    }
}

@Composable
fun MyBottomAPPBar(){
    val navigationController= rememberNavController()
    val context= LocalContext.current.applicationContext
    val selected= remember {
        mutableStateOf(Icons.Default.Home)
    }

    Scaffold(
        bottomBar ={
            BottomAppBar(
                containerColor = GreenJc
            ) {
                IconButton(
                    onClick = {
               selected.value=Icons.Default.Home
                navigationController.navigate(Screens.Home.screen){
                    popUpTo(0)
                }
                },
              modifier=Modifier.weight(1f)){
                  Icon(Icons.Default.Home, contentDescription =null, modifier = Modifier.size(26.dp),
                      tint = if(selected.value==Icons.Default.Home) Color.White else Color.DarkGray)

              }
                IconButton(
                    onClick = {
                        selected.value=Icons.Default.Notifications
                        navigationController.navigate(Screens.Notification.screen){
                            popUpTo(0)
                        }
                    },
                    modifier=Modifier.weight(1f)){
                    Icon(Icons.Default.Notifications, contentDescription =null, modifier = Modifier.size(26.dp),
                        tint = if(selected.value==Icons.Default.Notifications) Color.White else Color.DarkGray)

                }
                Box(modifier= Modifier
                    .weight(1f)
                    .padding(16.dp),
                    contentAlignment = Alignment.Center){
                    FloatingActionButton(onClick = {Toast.makeText(context,"Open Bottom Sheet",Toast.LENGTH_SHORT).show() }){}
                        Icon(Icons.Default.Add,contentDescription = null, tint = GreenJc)
                    }
                IconButton(
                    onClick = {
                        selected.value=Icons.Default.Person
                        navigationController.navigate(Screens.Profile.screen){
                            popUpTo(0)
                        }
                    },
                    modifier=Modifier.weight(1f)){
                    Icon(Icons.Default.Person, contentDescription =null, modifier = Modifier.size(26.dp),
                        tint = if(selected.value==Icons.Default.Person) Color.White else Color.DarkGray)

                }
                IconButton(
                    onClick = {
                        selected.value=Icons.Default.Settings
                        navigationController.navigate(Screens.Settings.screen){
                            popUpTo(0)
                        }
                    },
                    modifier=Modifier.weight(1f)){
                    Icon(Icons.Default.Settings, contentDescription =null, modifier = Modifier.size(26.dp),
                        tint = if(selected.value==Icons.Default.Settings) Color.White else Color.DarkGray)

                }

                }



        }
    ) {
paddingValues ->
        NavHost(navController = navigationController,
            startDestination = Screens.Home.screen,
           modifier=Modifier.padding(paddingValues) ){
            composable(Screens.Home.screen){ Home() }
            composable(Screens.Notification.screen){ Notification() }
            composable(Screens.Profile.screen){ Profile() }
            composable(Screens.Settings.screen){ Settings() }
            composable(Screens.Search.screen){ Search() }
        }
    }
}