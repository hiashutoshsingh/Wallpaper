package com.example.wall_i.view.favoriteScreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.wall_i.R
import com.example.wall_i.model.ListDataModel
import kotlinx.android.synthetic.main.activity_favorite_screen.*

class FavoriteScreen : AppCompatActivity(),onObjClicked{
    private lateinit var Fadapter: FavoriteListAdapter
    val col=2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_screen)
        initRecyclerView()


        }
    fun initRecyclerView(){
        FavRecyclerView.apply {
       TODO("do after database is working")
            layoutManager=StaggeredGridLayoutManager(col,1)
            //  var Data = DataSource.createDataSet(initListView(response.body()!!.imageList))
            //  Fadapter = FavoriteListAdapter(data,click)
            //  adapter = fadapter
        }
    }
    override fun onfavClicked(data: ListDataModel, I: Int) {
        TODO("do after database is working")
    }



}
