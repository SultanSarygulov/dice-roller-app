package com.example.diceroller.domain

class RollUseCase(private val diceRepository: DiceRepository ) {

    fun roll(): Int {
        return diceRepository.roll()
    }
}