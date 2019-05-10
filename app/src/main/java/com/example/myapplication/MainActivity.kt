package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var scoreViewModel: ScoreViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        scoreViewModel = ViewModelProviders.of(this).get(ScoreViewModel::class.java)

        var binding:ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.lifecycleOwner = this

        binding.score = scoreViewModel

    }

    fun addOneTeamA(v:View) {
        scoreViewModel.scoreA.value = scoreViewModel.scoreA.value?.plus(1)
    }

    fun addOneTeamB(v:View) {
        scoreViewModel.scoreB.value = scoreViewModel.scoreB.value?.plus(1)
    }

    fun addTwoTeamA(v:View) {
        scoreViewModel.scoreA.value = scoreViewModel.scoreA.value?.plus(2)
    }

    fun addTwoTeamB(v:View) {
        scoreViewModel.scoreB.value = scoreViewModel.scoreB.value?.plus(2)
    }

    fun addThreeTeamA(v:View) {
        scoreViewModel.scoreA.value = scoreViewModel.scoreA.value?.plus(3)
    }

    fun addThreeTeamB(v: View) {
        scoreViewModel.scoreB.value = scoreViewModel.scoreB.value?.plus(3)
    }

    fun resetScores(v: View) {
        scoreViewModel.scoreA.value = 0
        scoreViewModel.scoreB.value = 0

    }
}
