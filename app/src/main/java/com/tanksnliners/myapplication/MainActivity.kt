package com.tanksnliners.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button
        val button = findViewById<Button>(R.id.button)

        //handle button click
        button.setOnClickListener {

            startActivity(Intent(this, ServicesActivity::class.java))

        }

        val button2 = findViewById<Button>(R.id.button2)

        button2.setOnClickListener {
            startActivity(Intent(this, ContactActivity::class.java))
        }

    }
}
