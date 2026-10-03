package com.example.mylayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HalamanTugasLogin(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        // 1. Latar Belakang Perpustakaan
        Image(
            painter = painterResource(id = R.drawable.bg_perpustakaan),
            contentDescription = "Background Utama Halaman Login",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // 2. Konten Utama (Harus dibungkus Column agar berurutan dari atas ke bawah)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Judul Login
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

            Spacer(modifier = Modifier.height(16.dp))

            // Logo UMY
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = "Logo UMY",
                modifier = Modifier.size(110.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Label Nama
            Text(
                text = "Nama",
                color = Color(0xFFFFD700),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )

            // Nama Mahasiswa
            Text(
                text = "Miranti",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            // NIM Mahasiswa
            Text(
                text = "20240140278",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Foto Profil Melingkar
            Image(
                painter = painterResource(id = R.drawable.foto_profil),
                contentDescription = "Foto Profil",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(220.dp)
                    .clip(CircleShape)
                    .border(4.dp, Color.White, CircleShape)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HalamanTugasLoginPreview() {
    HalamanTugasLogin()
}