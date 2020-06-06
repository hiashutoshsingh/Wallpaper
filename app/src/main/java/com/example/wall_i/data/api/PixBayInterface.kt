package com.example.wall_i.data.api

import ImageListResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixBayInterface {

    @GET("api/")
    fun getAllImages(@Query("key") key: String, @Query("q") q: String): Call<ImageListResponse>

}