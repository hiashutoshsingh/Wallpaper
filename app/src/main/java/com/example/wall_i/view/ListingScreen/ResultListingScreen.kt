package com.example.wall_i.view.ListingScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.wall_i.data.DataSource
import com.example.wall_i.R
import com.example.wall_i.model.ListDataModel
import kotlinx.android.synthetic.main.activity_result_listing_screen.*

class ResultListingScreen : AppCompatActivity(),onItemClick {
    private lateinit var Ladapter: ListAdapter
    val col=2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_listing_screen)
        ListRecyclerView.apply{
            layoutManager=StaggeredGridLayoutManager(2,1)
            var Data=DataSource.createDataSet()
            Ladapter=ListAdapter(Data,this@ResultListingScreen)
            adapter=Ladapter


        }
    }

    override fun onclick(data: ListDataModel, I: Int) {
        var intent= Intent(this,SingleImageActivty::class.java)
        intent.putExtra("image",data.img)
        intent.putExtra("Desc",data.img_name)
        startActivity(intent)

    }
}
