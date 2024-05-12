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
import com.example.tugasfrontend.data.DataKapal
import com.example.tugasfrontend.data.Kapal
import com.example.tugasfrontend.topAppBar.topAppback

@Composable
fun detailKapalScreen(
    modifier : Modifier = Modifier,
    navController: NavController,
    KapalId : Int?
        )
        {
        val newKapalList = DataKapal.kapalList.filter { kapal ->
            kapal.id == KapalId
        }
        Column(
            modifier = Modifier
        ) {
            detailKapalContent(newKapalList = newKapalList,navController = navController)
        }
    }

@Composable
fun detailKapalContent(
    newKapalList: List<Kapal>,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        if (newKapalList.isNotEmpty()) {
            topAppback(
                text = newKapalList.first().title,
                navController = navController,
                modifier = Modifier.fillMaxWidth()
            )
            Column(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                newKapalList.forEach { kapal ->
                    Card(
                        modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp)
                        ) {
                            Image(
                                painter = painterResource(id = kapal.kapalImage),
                                contentDescription = null,
                                modifier = Modifier.fillMaxWidth()
                                    .height(200.dp)
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "Nama : ${kapal.title}")
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "Deskripsi : ${kapal.description}")
                        }
                    }
                }
            }
        } else {
            Text(text = "Tidak ada motor untuk ditampilkan", modifier = Modifier.fillMaxWidth().padding(16.dp))
        }
    }
}
