package com.example.foodrecipes.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.foodrecipes.models.Result
import com.example.foodrecipes.util.Constants.Companion.FAVOURITE_RECIPES_TABLE

@Entity(tableName = FAVOURITE_RECIPES_TABLE)
class FavouritesEntity(

    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: Result
)