package com.example.labexam02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.os.Looper

class MainWelcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val handler = Handler(Looper.getMainLooper())

        handler.postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        },3000)

    }
}