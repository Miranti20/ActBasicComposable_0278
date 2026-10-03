package com.example.mylayout

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size

@Composable
fun HalamanTugasLogin(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
    }
    Image(
        painter = painterResource(id = R.drawable.bg_perpustakaan),
        contentDescription = "Background",
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize()
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Login",
            color = Color.White,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Ini adalah halaman login,",
            color = Color.White.copy(alpha = 0.9f),
            fontSize = 14.sp
        )
    }

    Spacer(modifier = Modifier.height(16.dp))

    Image(
        painter = painterResource(id = R.drawable.logo_umy),
        contentDescription = "Logo UMY",
        modifier = Modifier.size(110.dp)
    )

    Spacer(modifier = Modifier.height(20.dp))

    Text(
        text = "Nama",
        color = Color(0xFFFFD700),
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold
    )
}



