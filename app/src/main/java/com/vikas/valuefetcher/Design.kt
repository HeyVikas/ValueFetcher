package com.vikas.valuefetcher

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.lifecycle.viewModelScope

@Composable
fun Function(state: MainViewModel) {
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Click Me")
        }
        Text(text = state.name.value.toString())
    }

}