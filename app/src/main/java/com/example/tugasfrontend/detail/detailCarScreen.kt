package com.example.tugasfrontend.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.tugasfrontend.data.Car
import com.example.tugasfrontend.data.DataCar
import com.example.tugasfrontend.topAppBar.topAppback

@Composable
fun detailCarScreen(
    modifier : Modifier = Modifier,
    navController: NavController,
    CarId : Int?
) {
   val newCarsList = DataCar.carList.filter {car ->
       car.id == CarId
   }
    Column(
        modifier = Modifier
    ) {
        detailCarContent(newCarsList = newCarsList,navController=navController)
    }
}

@Composable
fun detailCarContent(
    newCarsList: List<Car>,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        if (newCarsList.isNotEmpty()) {
            topAppback(
                text = newCarsList.first().title,
                navController = navController,
                modifier = Modifier.fillMaxWidth()
            )
            Column(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                newCarsList.forEach { car ->
                    Card(
                        modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp)
                        ) {
                            Image(
                                painter = painterResource(id = car.carImage),
                                contentDescription = null,
                                modifier = Modifier.fillMaxWidth()
                                    .height(200.dp)
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "Nama : ${car.title}")
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "Deskripsi : ${car.description}")
                        }
                    }
                }
            }
        } else {
            Text(text = "Tidak ada mobil untuk ditampilkan", modifier = Modifier.fillMaxWidth().padding(16.dp))
        }
    }
}


