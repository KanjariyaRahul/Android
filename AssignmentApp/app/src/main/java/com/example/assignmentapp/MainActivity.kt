package com.example.assignmentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val llDt: Button = findViewById(R.id.llDt)
        val rlbtn: Button = findViewById(R.id.rlbtn)
        val flsr: Button = findViewById(R.id.flsr)

        val cltv: Button = findViewById(R.id.cltv)

        cltv.setOnClickListener {
            var p = Intent(this,Web::class.java)
            startActivity(p);
        }

        llDt.setOnClickListener {
            var form= Intent(this,Form::class.java)
            startActivity(form)
        }

        rlbtn.setOnClickListener {
            var progress= Intent(this,Imagebar::class.java)
            startActivity(progress)
        }

        flsr.setOnClickListener {
            var progress= Intent(this,seek_rating_bar::class.java)
            startActivity(progress)
        }
    }
}