package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_profile)

        val homebutton = findViewById<ImageButton>(R.id.home)
        val searchbutton = findViewById<ImageButton>(R.id.search)
        val paymentbutton = findViewById<ImageButton>(R.id.payment)
        val logoutbutton = findViewById<Button>(R.id.logout)

        homebutton.setOnClickListener {
            startActivity(Intent(this, MainHome::class.java))
        }
        searchbutton.setOnClickListener{
            startActivity(Intent(this,MainSearch::class.java))
        }
        paymentbutton.setOnClickListener{
            startActivity(Intent(this,MainPayment::class.java))
        }
        logoutbutton.setOnClickListener{
            startActivity(Intent(this,MainLogin::class.java))
        }
    }
}