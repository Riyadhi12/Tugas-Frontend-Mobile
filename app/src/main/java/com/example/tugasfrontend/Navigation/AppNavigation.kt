package com.example.tugasfrontend.Navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.tugasfrontend.screen.about
import com.example.tugasfrontend.detail.detailCarScreen
import com.example.tugasfrontend.screen.lcCar
import com.example.tugasfrontend.screen.lcGrid
import com.example.tugasfrontend.detail.detailKapalScreen
import com.example.tugasfrontend.detail.detailMotorScreen

@Composable
fun AppNavigation() {
    val navController : NavHostController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar{
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                listOfNavItems.forEach{navItem ->
                    NavigationBarItem(
                        selected = currentDestination?.hierarchy?.any{
                            it.route == navItem.route } ==true,
                        onClick = {
                             navController.navigate(navItem.route){
                                 popUpTo(navController.graph.findStartDestination().id){
                                     saveState = true
                                 }
                                 launchSingleTop = true
                                 restoreState = true
                             }
                        },
                        icon = {
                               Icon(
                                   imageVector = navItem.icon,
                                   contentDescription = null
                               )
                        },
                        label = {
                            Text(text = navItem.label)
                        }
                    )
                }
            }
        }
    ) {paddingValues ->  
        NavHost(
            navController = navController ,
            startDestination = Screens.lcCar.name,
            modifier = Modifier
                .padding(paddingValues)
            ){
            composable(route = Screens.lcCar.name){
            lcCar(navController)
            }
            composable(route = Screens.lcGrid.name){
                lcGrid(navController)
            }
            composable(route = Screens.about.name){
                about()
            }
            composable(route = Screens.detailCarScreen.name + "/{CarId}", arguments = listOf(
                navArgument("CarId"){
                    type = NavType.IntType
                }) ){
                navBackStackEntry ->
                detailCarScreen(navController = navController, CarId = navBackStackEntry.arguments?.getInt("CarId"))
            }
            composable(route = Screens.detailKapalScreen.name + "/{KapalId}", arguments = listOf(
                navArgument("KapalId"){
                    type = NavType.IntType
                }) ){
                    navBackStackEntry ->
                detailKapalScreen(navController = navController, KapalId = navBackStackEntry.arguments?.getInt("KapalId"))
            }
            composable(route = Screens.detailMotorScreen.name + "/{MotorId}", arguments = listOf(
                navArgument("MotorId"){
                    type = NavType.IntType
                }) ){
                    navBackStackEntry ->
                detailMotorScreen(navController = navController, MotorId = navBackStackEntry.arguments?.getInt("MotorId"))
            }
        }
    }
}