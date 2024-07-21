package com.example.myapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class TextViewActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_text_view)

        var textView : TextView = findViewById(R.id.textView3)

        var actvcity : AutoCompleteTextView = findViewById(R.id.actvcity)
        var city = arrayOf("jamnagr", "rajkot" , "Surat" , "Baroda")
        var adpter = ArrayAdapter<String>(this ,android.R.layout.simple_selectable_list_item ,city )
        actvcity.setAdapter(adpter)

        textView.setOnClickListener {
            Toast.makeText(applicationContext, "Hello rahul", Toast.LENGTH_SHORT).show()
        }
    }
}