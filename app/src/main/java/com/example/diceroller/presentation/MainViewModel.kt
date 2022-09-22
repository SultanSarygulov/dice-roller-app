package com.example.diceroller.presentation

import androidx.lifecycle.ViewModel
import com.example.diceroller.data.DiceRepositoryImpl
import com.example.diceroller.domain.RollUseCase

class MainViewModel: ViewModel() {

    private val repository = DiceRepositoryImpl

    private val rollUseCase = RollUseCase(repository)

    fun rollDice(): Int{
        return rollUseCase.roll()
    }
}