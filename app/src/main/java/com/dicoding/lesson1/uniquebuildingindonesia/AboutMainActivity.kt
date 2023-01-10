package com.dicoding.lesson1.uniquebuildingindonesia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AboutMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_main)

        supportActionBar?.title = "About"
    }
}