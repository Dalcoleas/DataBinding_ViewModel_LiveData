package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class ScoreViewModel : ViewModel(){
    var scoreA = MutableLiveData<Int>()
    var scoreB = MutableLiveData<Int>()
    init {
        scoreA.value = 0
        scoreB.value = 0
    }
}