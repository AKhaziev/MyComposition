package com.example.mycomposition.domain.entity


data class GameSettings(
    val valSumValue: Int,
    val minCountOfRightAnswers: Int,
    val minPercentOfRightAnswers: Int,
    val gameTineInSeconds: Int
)