package com.example.framelayout_pb_sb_rb

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.*


class HomeActivity : AppCompatActivity() {
//    @SuppressLint("MissingInflatedId")
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1) this button Constraint Layout text view
        var cltv: Button = findViewById(R.id.cltv)

        //2) this button linear layout date/time picker
        var llDt: Button = findViewById(R.id.llDt)
        
        //3) this button Relative Layout Button
        var rlbtn: Button = findViewById(R.id.rlbtn)

        // 4) this button Frame Layout Seek/Rating Bar
        var flsr: Button = findViewById(R.id.flsr)

        cltv.setOnClickListener {
            val intent = Intent(this, TextViewActivity::class.java)
            startActivity(intent)
        }

        llDt.setOnClickListener {
            val intent = Intent(this, TextViewActivity::class.java)
            startActivity(intent)
        }

        rlbtn.setOnClickListener {
            val intent = Intent(this, TextViewActivity::class.java)
            startActivity(intent)
        }

        flsr.setOnClickListener {
            val intent = Intent(this, TextViewActivity::class.java)
            startActivity(intent)
        }
    }

}