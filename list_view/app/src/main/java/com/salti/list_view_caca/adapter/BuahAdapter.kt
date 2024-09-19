package com.salti.list_view_caca.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.salti.list_view_caca.R
import com.salti.list_view_caca.model.ModelBuah

class BuahAdapter (val itemList: ArrayList<ModelBuah>)
    : RecyclerView.Adapter<BuahAdapter.MyViewHolder>()
{
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        //deklarasi widget dari item layout
        var itemImage: ImageView
        var itemText: TextView

        init {
            itemImage = itemView.findViewById(R.id.gambar1)
            itemText = itemView.findViewById(R.id.nama1)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //kita deklare layout
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_custom_buah, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //set data ke widget
        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemText.setText(itemList[position].judul)
    }
}