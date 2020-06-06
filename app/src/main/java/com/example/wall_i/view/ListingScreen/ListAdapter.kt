package com.example.wall_i.view.ListingScreen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.wall_i.R
import com.example.wall_i.model.ListDataModel
import kotlinx.android.synthetic.main.list_model.view.*

class ListAdapter(var items:ArrayList<ListDataModel>,var click:onItemClick): RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    class ListViewHolder(view: View):RecyclerView.ViewHolder(view){
        var mImage=view.Images


        fun bind(model:ListDataModel,DataClick:onItemClick){
            var requestoptions= RequestOptions()
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_background)
            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestoptions)
                .load(model.img)
                .into(mImage)



        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder =
        ListViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.list_model,parent,false)

    )

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
       holder.bind(items.get(position),click)
    }
}
interface onItemClick{
    fun onclick(data:ListDataModel,I: Int)
}