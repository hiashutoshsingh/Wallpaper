package com.example.wall_i.data.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class ImageEntity(
    @PrimaryKey(autoGenerate = true)
    @SerializedName("id") val id: Int,
    @ColumnInfo(name="webformatURL")
    @SerializedName("webformatURL") val webFormatURL: String


)



