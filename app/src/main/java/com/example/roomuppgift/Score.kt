package com.example.roomuppgift

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity( tableName = "high_scores")
data class Score (
    @PrimaryKey ( autoGenerate = true) val id: Int,
    @ColumnInfo(name = "name") var  namn : String,
    @ColumnInfo(name = "Score") var points : Int,
    @ColumnInfo(name = "category") var category: Int?)
{
}


