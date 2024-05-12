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
import com.example.tugasfrontend.data.DataMotors
import com.example.tugasfrontend.data.Motor
import com.example.tugasfrontend.topAppBar.topAppback

@Composable
fun detailMotorScreen(
    modifier : Modifier = Modifier,
    navController: NavController,
    MotorId : Int?
)
{
    val newMotorList = DataMotors.motorList.filter { motor ->
        motor.id == MotorId
    }
    Column(
        modifier = Modifier
    ) {
        detailMotorContent(newMotorList = newMotorList,navController = navController )
    }
}

@Composable
fun detailMotorContent(
    newMotorList: List<Motor>,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        if (newMotorList.isNotEmpty()) {
            topAppback(
                text = newMotorList.first().title,
                navController = navController,
                modifier = Modifier.fillMaxWidth()
            )
            Column(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                newMotorList.forEach { motor ->
                    Card(
                        modifier = Modifier.padding(vertical = 8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp)
                        ) {
                            Image(
                                painter = painterResource(id = motor.motorImage),
                                contentDescription = null,
                                modifier = Modifier.fillMaxWidth()
                                    .width(300.dp)
                                    .height(200.dp)
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "Nama : ${motor.title}")
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "Deskripsi : ${motor.description}")
                        }    }
                }
            }
        } else {
            Text(text = "Tidak ada motor untuk ditampilkan", modifier = Modifier.fillMaxWidth().padding(16.dp))
        }
    }
}
