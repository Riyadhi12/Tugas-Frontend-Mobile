package com.example.tugasfrontend.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasfrontend.R
import com.example.tugasfrontend.topAppBar.topAppBar

@Composable
fun about() {
    topAppBar("About")
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
        , verticalArrangement = Arrangement.Center
    ) {

        Card(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 2.dp)
                .size(width = 300.dp, height = 300.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.riyadhi3) , contentDescription = "",
                modifier = Modifier
                    .fillMaxSize()
                    .size(width = 300.dp, height = 300.dp),
                        contentScale = ContentScale.FillBounds
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Column {
            Card(
                modifier = Modifier.padding(8.dp)
            ) {
                Text(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    text = "NAMA : Muhammad Riyadhi",
                    //style = MaterialTheme.typography.body1,
                    textAlign = TextAlign.Center
                )
               }
                Card(
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        text = "Email : mriyadhi914@gmail.com",
                        //style = MaterialTheme.typography.body1,
                        textAlign = TextAlign.Center
                    )
                }
            Card(
                modifier = Modifier.padding(8.dp)
            ) {
                Text(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    text = "Universitas : UPNVYK",
                    //style = MaterialTheme.typography.body1,
                    textAlign = TextAlign.Center
                )
            }
            Card(
                modifier = Modifier.padding(8.dp)
            ) {
                Text(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    text = "Jurusan : INFORMATIKA",
                    //style = MaterialTheme.typography.body1,
                    textAlign = TextAlign.Center
                )
            }
        }
    }

}