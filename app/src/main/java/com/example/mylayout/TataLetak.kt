package com.example.mylayout

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Row

@Composable
fun TataLetakColumn() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Belajar Jetpack Compose")
        Text(text = "Column")
        Text(text = "Layout Dasar")
    }
}

@Composable
fun TataLetakRow() {
    Row {
        Text(text = "Satu")
        Text(text = "Dua")
        Text(text = "Tiga")
    }
}