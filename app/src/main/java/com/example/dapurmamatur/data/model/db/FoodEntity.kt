package com.example.dapurmamatur.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "food_table")
data class FoodEntity(
    @PrimaryKey
    val id: Int,
    val title: String,
    val img: String
)