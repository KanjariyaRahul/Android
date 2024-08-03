package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        var etEmail :TextView = findViewById(R.id.etEmail);
        var etPassword : TextView = findViewById(R.id.etPassword);
        var btnLogin : Button = findViewById(R.id.btnLogin);
        var btnRegister : TextView = findViewById(R.id.btnRegister);



        btnLogin.setOnClickListener {
            var email = etEmail.text.toString()
            var password = etPassword.text.toString()
            var sp = getSharedPreferences("registerData", MODE_PRIVATE)
            var savedEmail = sp.getString("editEmail", "")
            var savedPassword = sp.getString("editPassword", "")

            if (email == savedEmail && password == savedPassword) {
                val intent = Intent(this, DisplayActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Invalid login credentials", Toast.LENGTH_SHORT).show()
            }
        }

        btnRegister.setOnClickListener {
            var i = Intent(this,Register::class.java)
            startActivity(i)
        }

    }
}