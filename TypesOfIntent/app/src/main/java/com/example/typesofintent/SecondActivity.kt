package com.example.typesofintent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)


        var textSurname : TextView = findViewById(R.id.textSurname)
        var textName : TextView = findViewById(R.id.textName)

        var intent: Intent = intent
        var sName = intent.getStringExtra("surname" )
        var Name = intent.getStringExtra("name" )

        textSurname.setText("Surname : "+ sName)
        textName.setText("Name : " + Name )

        var btn_web :Button = findViewById(R.id.button2)
        btn_web.setOnClickListener {
//            var uri = Uri.parse("Https://www.google.com")
        }



    }
}