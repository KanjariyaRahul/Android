package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var reg :TextView = findViewById(R.id.register)

        reg.setOnClickListener {
            var i = Intent(this,Register::class.java)
            startActivity(i)
        }
    }
}