package com.vikas.valuefetcher

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var name = mutableStateOf(0)
    val firebase = FireBase()
    fun run (){
        Log.d("Tag","this is a run")
        firebase.Send(name.value.toString())
    }
}