package com.example.tugasfrontend

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasfrontend.data.Car
import com.example.tugasfrontend.data.DataKapal.kapal
import com.example.tugasfrontend.data.Kapal

@Composable
fun CarListItem(car: Car,
                onClick: (Int) -> Unit
                ) {
    Card (
        //colors = CardDefaults.cardColors(
            //containerColor = Color.White),
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth()
            .clickable {
                onClick(car.id)
            }
            .size(width = 100.dp, height = 120.dp),
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ){
            Row(
            ) {
                CarImage(car = car)
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                        .fillMaxWidth()
                        .align(Alignment.CenterVertically)
                ) {
                    Text(text = car.title,
                        modifier = Modifier,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(7.dp))
                    Text(text = "View Detail")
                }
            }
        }

}
@Composable
private fun CarImage(car : Car){
    Image(painter = painterResource(id = car.carImage),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(103.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}

@Composable
fun ListKapalRow(
    kapal : Kapal,
    modifier: Modifier = Modifier,
    onClick : (Int) -> Unit
) {
    Card(
        modifier = modifier.clickable {
            onClick(kapal.id)
        }
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth()
            .size(width = 200.dp, height = 270.dp),
        shape = MaterialTheme.shapes.medium
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            ImageKapal(kapal = kapal)
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = kapal.title,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "View Detail",
                //style = typography.body2,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
        }
    }
}


@Composable
private fun ImageKapal(kapal: Kapal){
    Image(painter = painterResource(id = kapal.kapalImage),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(150.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}