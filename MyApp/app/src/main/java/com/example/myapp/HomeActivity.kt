package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

//        val cltv: Button = findViewById(R.id.cltv)
        val llDt: Button = findViewById(R.id.llDt)
        val rlbtn: Button = findViewById(R.id.rlbtn)
        val flsr: Button = findViewById(R.id.flsr)

        val cltv: Button = findViewById(R.id.cltv)

        cltv.setOnClickListener {
            // Log message to check if the button is clicked
            android.util.Log.d("HomeActivity", "Button clicked")
            val intent = Intent(this, TextViewActivity::class.java)
            startActivity(intent)
        }

//        cltv.setOnClickListener {
//            val intent = Intent(this, TextViewActivity::class.java)
//            Toast.makeText(this, "Navigating to TextViewActivity", Toast.LENGTH_SHORT).show()
//            startActivity(intent)
//        }

//        llDt.setOnClickListener {
//            val intent = Intent(this, Date_Time_PickerActivity::class.java)
//            startActivity(intent)
//        }
//
//        rlbtn.setOnClickListener {
//            val intent = Intent(this, ButtonsActivity::class.java)
//            startActivity(intent)
//        }
//
//        flsr.setOnClickListener {
//            val intent = Intent(this, Seek_Rating_BarActivity::class.java)
//            startActivity(intent)
//        }
    }
}
