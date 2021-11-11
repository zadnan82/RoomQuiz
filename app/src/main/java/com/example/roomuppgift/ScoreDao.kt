package com.example.roomuppgift


import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


@Dao
interface ScoreDao {

    @Insert
    fun insert( score : Score )


    @Delete
    fun delete(score: Score)

    @Query("SELECT * FROM high_scores")
    fun getAll() : List<Score>

    @Query ("SELECT * FROM high_scores WHERE category LIKE :categoryName")
    fun findByCategory(categoryName: String) : List<Score>

    @Query("SELECT * FROM high_scores ORDER BY score ASC")
    fun getScoreSortByAsc(): List<Score>

    @Query("SELECT * FROM high_scores ORDER BY score DESC")
    fun getScoreSortByDes(): List<Score>
}





