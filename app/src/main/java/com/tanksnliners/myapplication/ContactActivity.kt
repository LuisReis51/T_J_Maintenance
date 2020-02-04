package com.tanksnliners.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contact.*

class ContactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val phoneNumber = "13129535173"
        val phoneNumber2 = "12197768427"
        val phoneNumber3 = "12198190656"


        action_dial_button.setOnClickListener {

            val intent = Intent(Intent.ACTION_DIAL)

            intent.data = Uri.parse("tel:" + phoneNumber)

            startActivity(intent)
        }

        action_dial_button2.setOnClickListener {

            val intent = Intent(Intent.ACTION_DIAL)

            intent.data = Uri.parse("tel:" + phoneNumber2)

            startActivity(intent)
        }

        action_dial_button3.setOnClickListener {

            val intent = Intent(Intent.ACTION_DIAL)

            intent.data = Uri.parse("tel:" + phoneNumber3)

            startActivity(intent)
        }

    }
}
