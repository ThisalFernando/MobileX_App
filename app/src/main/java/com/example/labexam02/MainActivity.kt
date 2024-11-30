package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signupbutton = findViewById<Button>(R.id.signup)
        val loginbutton = findViewById<Button>(R.id.login)
        signupbutton.setOnClickListener{
            startActivity(Intent(this,MainSignUp::class.java))
        }
        loginbutton.setOnClickListener{
            startActivity(Intent(this,MainLogin::class.java))
        }

    }
}