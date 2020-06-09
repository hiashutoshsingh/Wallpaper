package com.example.wall_i.view.favoriteScreen

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wall_i.R
import com.example.wall_i.model.ListDataModel
import kotlinx.android.synthetic.main.list_model.view.*

class FavoriteListAdapter(var items:ArrayList<ListDataModel>,var clickfav: onObjClicked):
    RecyclerView.Adapter<FavoriteListAdapter.FavListViewHolder>() {

    class FavListViewHolder(view : View):RecyclerView.ViewHolder(view){
        private var favImg=view.Images

        fun bindFav(model:ListDataModel,clicked:onObjClicked){

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavListViewHolder=
        FavListViewHolder(
      LayoutInflater.from(parent.context).inflate(R.layout.list_model,parent,false)
    )

    override fun getItemCount(): Int=items.size

    override fun onBindViewHolder(holder: FavListViewHolder, position: Int) {
        holder.bindFav(items.get(position),clickfav)
    }


}
interface onObjClicked{
    fun onfavClicked(data:ListDataModel,I :Int)

}