package com.example.tugasfrontend.Navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItem(
    val label : String,
    val icon : ImageVector,
    val route : String
)
val listOfNavItems: List<NavItem> = listOf(
    NavItem(
        label = "Screen 1",
        icon = Icons.Default.Home,
        route = Screens.lcCar.name
    ),
    NavItem(
        label = "Screen 2",
        icon = Icons.Default.Home,
        route = Screens.lcGrid.name
    ),
    NavItem(
        label = "Screen 3",
        icon = Icons.Default.Home,
        route = Screens.about.name
)
)