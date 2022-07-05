package com.example.mycomposition.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable

// enum-классы неявно реализуют Serializable, поэтому указывать нет необходимости
@Parcelize
enum class Level : Parcelable{
    TEST, EASY, NORMAL, HARD
}