package com.example.wall_i.data.db

import ImageResponse
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ImageResponseDAO{

    @Insert
    fun saveImg(url:Entity)

    @Query(value = "Select * from Entity")
    fun getImgUrl():List<Entity>

}