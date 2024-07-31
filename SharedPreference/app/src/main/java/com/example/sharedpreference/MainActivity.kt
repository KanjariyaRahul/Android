package com.example.sharedpreference

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var unm : EditText = findViewById(R.id.unm)
        var password : EditText = findViewById(R.id.password)
        var btnsave : Button = findViewById(R.id.btnsave)
        var btnshow  : Button = findViewById(R.id.btnshow)

        var sp = application.getSharedPreferences("logindata",Context.MODE_PRIVATE)
        var editor = sp.edit()

        btnsave.setOnClickListener {
            editor.putString("unm",unm.text.toString())
            editor.putString("pass",password.text.toString())
            editor.commit()
            Toast.makeText(applicationContext,"Data Saved!!",Toast.LENGTH_LONG).show()
            unm.setText("")
            password.setText("")
        }
        btnshow.setOnClickListener {
            unm.setText(sp.getString("unm",""))
            password.setText(sp.getString("pass",""))
        }
    }
}