package com.example.wall_i.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ImageResponseDAO{

    @Insert
    fun saveImg(url:ImageEntity)

    @Query(value = "Select * from ImageEntity")
    fun getImgUrl():List<ImageEntity>

}