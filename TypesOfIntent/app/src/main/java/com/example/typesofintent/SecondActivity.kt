package com.example.typesofintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val textSurname: TextView = findViewById(R.id.textSurname)
        val textName: TextView = findViewById(R.id.textName)

        val intent: Intent = intent
        val sName = intent.getStringExtra("surname")
        val Name = intent.getStringExtra("name")

        textSurname.text = "Surname : $sName"
        textName.text = "Name : $Name"

        val btnWeb: Button = findViewById(R.id.button2)
        btnWeb.setOnClickListener {
            val uri = Uri.parse("https://www.google.com") // Corrected the URL schema to lowercase
            val i = Intent(Intent.ACTION_VIEW, uri)
            startActivity(i)
        }

        var ed_number : EditText = findViewById(R.id.editTextPhone)
        var btn_phone : Button = findViewById(R.id.button3)

        btn_phone.setOnClickListener {
            var uri = Uri.parse("tel : "+ed_number.text.toString())
            var i = Intent(Intent.ACTION_DIAL,uri)
            startActivity(i)
        }

        var btn_map : Button = findViewById(R.id.button4)

        btn_map.setOnClickListener {
            var uri = Uri.parse("geo:0,0=?"+ "jamnagr, gujarat")
            var i = Intent(Intent.ACTION_VIEW,uri)
            startActivity(i)
        }
    }
}
