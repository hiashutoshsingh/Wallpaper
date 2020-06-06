package com.example.wall_i.view

import ImageListResponse
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.wall_i.R
import com.example.wall_i.data.api.PixBayInterface
import com.example.wall_i.data.api.ServiceBuilder
import com.example.wall_i.utils.Constants
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageSearched = intent.getStringExtra("image")!!

        val request = ServiceBuilder.invoke()
        val call = request.getAllImages(Constants.apiKey, imageSearched)


        call.enqueue(object : Callback<ImageListResponse> {
            override fun onResponse(
                call: Call<ImageListResponse>,
                response: Response<ImageListResponse>
            ) {
                if (response.isSuccessful) {
                    Toast.makeText(
                        this@HomeActivity,
                        " LINK " + response.body()!!.hits[0].id.toString(),
                        Toast.LENGTH_LONG
                    ).show()
                }
            }

            override fun onFailure(call: Call<ImageListResponse>, t: Throwable) {
                Toast.makeText(this@HomeActivity, "${t.message}", Toast.LENGTH_LONG).show()
            }

        })


    }
}
