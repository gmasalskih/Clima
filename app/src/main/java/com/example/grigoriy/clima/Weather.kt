package com.example.grigoriy.clima

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_weather.*

class Weather : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)
        changeCityBtn.setOnClickListener {
            startActivity(Intent(this, ChangeCity::class.java))
        }
    }
}
