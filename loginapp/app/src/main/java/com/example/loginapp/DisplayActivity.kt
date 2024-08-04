package com.example.loginapp

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieDrawable

class DisplayActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        // Initialize UI elements
        val tvName: TextView = findViewById(R.id.tvName)
        val tvSurname: TextView = findViewById(R.id.tvSurname)
        val tvEmail: TextView = findViewById(R.id.tvEmail)
        val tvDob: TextView = findViewById(R.id.tvDob)
        val tvGender: TextView = findViewById(R.id.tvGender)
        val tvCity: TextView = findViewById(R.id.tvCity)
        val btnEdit: Button = findViewById(R.id.btnEdit)
        var logout : Button = findViewById(R.id.logout)



        // Get SharedPreferences
        val sp = getSharedPreferences("registerData", Context.MODE_PRIVATE)
        // Retrieve and display data from SharedPreferences
        tvName.text = sp.getString("editName", "")
        tvSurname.text = sp.getString("editSurname", "")
        tvEmail.text = sp.getString("editEmail", "")
        tvDob.text = sp.getString("editdob", "")
        tvGender.text = sp.getString("gender", "")
        tvCity.text = sp.getString("editCity", "")


        btnEdit.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            intent.putExtra("EMAIL", tvEmail.text.toString())
            startActivity(intent)
        }

        logout.setOnClickListener {
            var i = Intent(this,Login::class.java)
            startActivity(i)
        }
    }
}
