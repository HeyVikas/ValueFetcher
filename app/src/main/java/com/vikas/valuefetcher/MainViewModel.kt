package com.vikas.valuefetcher

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var name = mutableStateOf(0)
}