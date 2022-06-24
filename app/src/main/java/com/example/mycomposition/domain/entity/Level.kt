package com.example.mycomposition.domain.entity

import java.io.Serializable

// enum-классы неявно реализуют Serializable, поэтому указывать нет необходимости
enum class Level {
    TEST, EASY, NORMAL, HARD
}