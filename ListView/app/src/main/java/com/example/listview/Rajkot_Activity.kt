package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import org.w3c.dom.Text

class Rajkot_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rajkot)

        var citynm : TextView = findViewById(R.id.textView)
        var citydis : TextView = findViewById(R.id.textView2)
        var btn : FloatingActionButton = findViewById(R.id.floatingActionButton)
        var img : ImageView = findViewById(R.id.imageView2)



        var intent : Intent = intent
        var city = intent.getStringExtra("city")
        var dis = intent.getStringExtra("disc")
        var path = intent.getIntExtra("path",0)

        citynm.setText("Welcome to " +city)
        citydis.setText(dis)
        img.setImageResource(path)
        btn.setOnClickListener {
            var i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }
    }
}