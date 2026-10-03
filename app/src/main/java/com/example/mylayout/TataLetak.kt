package com.example.mylayout

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text

@Composable
fun TataLetakColumn() {
    Column {
        Text(text = "Belajar Jetpack Compose")
        Text(text = "Column")
        Text(text = "Layout Dasar")
    }
}