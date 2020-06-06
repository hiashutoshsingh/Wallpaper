package com.example.wall_i.data.api

import com.example.wall_i.utils.Constants
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceBuilder {

    operator fun invoke(): PixBayInterface {
        return Retrofit.Builder()
            .baseUrl(Constants.baseUrl)
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(PixBayInterface::class.java)
    }
}