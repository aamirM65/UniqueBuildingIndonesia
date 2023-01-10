package com.dicoding.lesson1.uniquebuildingindonesia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvBuilding: RecyclerView
    private var list: ArrayList<Building> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Unique Building Indonesia"

        rvBuilding = findViewById(R.id.rv_building)
        rvBuilding.setHasFixedSize(true)

        list.addAll(BuildingData.listData)
        showRecyclerCardView()
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.about_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.ic_about -> {
                intent = Intent(this, AboutMainActivity::class.java)
                startActivity(intent)
            }
        }
    }


    private fun showRecyclerCardView() {
        rvBuilding.layoutManager = LinearLayoutManager(this)
        val cardViewBuildingAdapter = CardViewBuildingAdapter(list)
        rvBuilding.adapter = cardViewBuildingAdapter
    }
}