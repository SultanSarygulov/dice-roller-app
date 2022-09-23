package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.diceroller.presentation.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        rollButton.setOnClickListener { viewModel.rollDice() }


        /*rollButton.setOnClickListener { rollDice() }*/
    }

    /*private fun rollDice() {

        val diceRoll = dice.roll()

        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }*/
}

/*class Dice(val sides: Int) {
    fun roll(): Int {

        return (1..sides).random()
    }
}*/