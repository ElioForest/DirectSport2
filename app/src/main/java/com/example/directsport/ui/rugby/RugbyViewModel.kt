package com.example.directsport.ui.rugby

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RugbyViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Page Rugby"
    }
    val text: LiveData<String> = _text
}