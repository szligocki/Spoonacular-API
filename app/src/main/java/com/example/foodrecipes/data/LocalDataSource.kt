package com.example.foodrecipes.data

import com.example.foodrecipes.data.database.RecipesDao
import com.example.foodrecipes.data.database.entities.FavouritesEntity
import com.example.foodrecipes.data.database.entities.RecipesEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocalDataSource @Inject constructor(
    private val recipesDao: RecipesDao
) {
    fun readRecipes(): Flow<List<RecipesEntity>> {
        return recipesDao.readRecipes()
    }

    fun readFavouriteRecipes(): Flow<List<FavouritesEntity>> {
        return recipesDao.readFavouriteRecipes()
    }

    suspend fun insertRecipes(recipesEntity: RecipesEntity) {
        recipesDao.insertRecipes(recipesEntity)
    }

    suspend fun insertFavouriteRecipes(favouritesEntity: FavouritesEntity) {
        recipesDao.insertFavouriteRecipes(favouritesEntity)
    }

    suspend fun deleteFavouriteRecipe(favouritesEntity: FavouritesEntity) {
        recipesDao.deleteFavouriteRecipes(favouritesEntity)
    }

    suspend fun deleteAllFavouriteRecipes() {
        recipesDao.deleteAllFavouriteRecipes()
    }
}