package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)

        val loginbutton = findViewById<Button>(R.id.login)
        val signuplink = findViewById<Button>(R.id.link)

        loginbutton.setOnClickListener {
            startActivity(Intent(this, MainOnboard01::class.java))
        }
        signuplink.setOnClickListener {
            startActivity(Intent(this, MainSignUp::class.java))
        }
    }
}