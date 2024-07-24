package com.example.typesofintent

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge


class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.button)

        var edSurname : EditText = findViewById(R.id.edSurname)
        var edName : EditText = findViewById(R.id.edname)


        btn.setOnClickListener {
            var i= Intent(this,SecondActivity::class.java)

            i.putExtra("surname",edSurname.text.toString())
            i.putExtra("name",edName.text.toString())
            startActivity(i)
        }

    }
}
