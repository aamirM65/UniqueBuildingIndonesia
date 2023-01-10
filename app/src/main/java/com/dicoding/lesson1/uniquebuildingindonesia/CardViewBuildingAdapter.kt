package com.dicoding.lesson1.uniquebuildingindonesia

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewBuildingAdapter(private val listBuilding: ArrayList<Building>) : RecyclerView.Adapter<CardViewBuildingAdapter.CardViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_building, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val building = listBuilding[position]

        Glide.with(holder.itemView.context)
            .load(building.photo)
            .apply(RequestOptions().override(550, 220))
            .into(holder.imgPhoto)

        holder.tvName.text = building.name
        holder.tvDetail.text = building.detail

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailBuildingActivity::class.java)
                .putExtra("intent_title", holder.tvName.text)
                .putExtra("intent_images", building.photo)
                .putExtra("intent_detail", holder.tvDetail.text)
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return listBuilding.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto : ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
    }
}
