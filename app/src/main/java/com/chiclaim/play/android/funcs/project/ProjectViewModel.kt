package com.chiclaim.play.android.funcs.project

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProjectViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is project Fragment"
    }
    val text: LiveData<String> = _text
}