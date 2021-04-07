package com.example.directsport.ui.foot

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FootViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "C'est ICI le FOOTBALL"
    }
    val text: LiveData<String> = _text
}