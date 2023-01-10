package com.dicoding.lesson1.uniquebuildingindonesia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class DetailBuildingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_building)

        supportActionBar!!.title = intent.getStringExtra("intent_title")

        val imgItem: ImageView = findViewById(R.id.img_item_photo)
        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvDetail: TextView = findViewById(R.id.tv_item_detail)

        tvName.text = intent.getStringExtra("intent_title")
        tvDetail.text = intent.getStringExtra("intent_detail")

        Glide.with(this)
            .load(intent.getIntExtra("intent_images", 0))
            .into(imgItem)

    }
}