package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainSuccess : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_success)

        val loginbutton = findViewById<Button>(R.id.login)
        loginbutton.setOnClickListener{
            startActivity(Intent(this,MainLogin::class.java))
        }
    }
}