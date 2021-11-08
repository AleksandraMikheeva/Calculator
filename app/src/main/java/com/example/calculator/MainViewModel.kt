package com.example.calculator

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    override fun onCleared() {
        super.onCleared()
        Log.d("MainViewMddel", "onCleared")
    }
}