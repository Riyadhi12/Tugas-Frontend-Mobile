package com.example.tugasfrontend.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.tugasfrontend.CarListItem
import com.example.tugasfrontend.ListKapalRow
import com.example.tugasfrontend.Navigation.Screens
import com.example.tugasfrontend.data.DataCar
import com.example.tugasfrontend.data.DataKapal
import com.example.tugasfrontend.topAppBar.topAppBar


@Composable
fun lcCar(
    navController: NavController
) {
    val kapals = remember {DataKapal.kapalList}
    val cars = remember {DataCar.carList }
    Column {
        topAppBar("Kapal Pesiar & Sport Car")
        LazyRow (
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ){
            items(
                items = kapals, key = {it.id},
                itemContent = {
                    ListKapalRow(kapal = it){KapalId ->
                        navController.navigate(Screens.detailKapalScreen.name+"/${KapalId}")
                    }
                }
            )
        }

        Spacer(modifier = Modifier.height(13.dp))

        LazyColumn(
            contentPadding = PaddingValues(horizontal = 20.dp, vertical = 20.dp)
        ){
            items(
                items = cars,key = {it.id},
                itemContent = {
                    CarListItem(car = it){
                            CarId ->
                        navController.navigate(Screens.detailCarScreen.name+"/${CarId}")
                    }
                }
            )
        }
    }
}
