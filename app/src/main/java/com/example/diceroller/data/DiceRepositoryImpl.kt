package com.example.diceroller.data

import com.example.diceroller.domain.DiceRepository

object DiceRepositoryImpl: DiceRepository {

    override fun roll(): Int{
        return (1..6).random()
    }
}