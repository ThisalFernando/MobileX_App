package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainSignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_sign_up)

        val signupbutton = findViewById<Button>(R.id.signup)
        val loginlink = findViewById<Button>(R.id.link)

        signupbutton.setOnClickListener {
            startActivity(Intent(this, MainSuccess::class.java))
        }
        loginlink.setOnClickListener {
            startActivity(Intent(this, MainLogin::class.java))
        }
    }
}