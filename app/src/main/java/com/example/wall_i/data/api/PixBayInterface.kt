package com.example.wall_i.data.api

import ImageListResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixBayInterface {

    @GET("/")
    fun getAllImages(@Query("value") query: String): Call<ImageListResponse>

}