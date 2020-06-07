package com.example.wall_i.data.db

import ImageResponse
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ImageResponseDAO{

    @Insert
    fun saveImg(url:ImageResponse)

    @Query(value = "Select * from ImageResponse")
    fun getImgUrl():ArrayList<ImageResponse>

}