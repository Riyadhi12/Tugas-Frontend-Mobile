package com.example.tugasfrontend.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tugasfrontend.Navigation.Screens
import com.example.tugasfrontend.data.DataMotors
import com.example.tugasfrontend.data.Motor
import com.example.tugasfrontend.topAppBar.topAppBar

@Composable
fun lcGrid(
    navController: NavController
) {
    val motors = remember { DataMotors.motorList }
    Column {
        topAppBar("Motor Sport")
        LazyVerticalGrid(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxSize()
        ) {
            items(
                items = motors, key = {it.id},
                itemContent = {
                    ListMotor(motor = it ) { MotorId ->
                        navController.navigate(Screens.detailMotorScreen.name + "/${MotorId}")
                    }
                }
            )
        }
    }

}
@Composable
fun ListMotor(motor : Motor,
              modifier: Modifier = Modifier,
              onClick : (Int) -> Unit
) {
    Card (
        //colors = CardDefaults.cardColors(
        //containerColor = Color.White),
        modifier = Modifier
            .clickable {
            onClick(motor.id)}
            .padding(horizontal = 8.dp, vertical = 2.dp)
            .fillMaxWidth()
            .size(width = 100.dp, height = 230.dp),
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ){
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Bottom, // Menempatkan teks di bagian bawah Column
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ImageMotor(motor = motor)
            Column(
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth()
                    //.align(Alignment.CenterVertically)
            ) {
                Text(text = motor.title,
                    modifier = Modifier,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(3.dp))
                Text(text = "View Detail")
            }
        }
    }

}
@Composable
private fun ImageMotor(motor : Motor){
    Image(painter = painterResource(id = motor.motorImage),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(135.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}