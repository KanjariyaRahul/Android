package com.example.filehandling

import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edtbox : EditText = findViewById(R.id.editTextTextMultiLine)
        var btnwrite : Button = findViewById(R.id.button)
        var btnread : Button = findViewById(R.id.button2)

        var builder = AlertDialog.Builder(this)
        btnwrite.setOnClickListener {
            var fop = openFileOutput("myfile",Context.MODE_PRIVATE)
            fop.write(edtbox.text.toString().toByteArray())
            builder.setTitle("FILE HANDLING")
            builder.setMessage("Your Data Saved!!")
            builder.setPositiveButton("OK",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(applicationContext,i.toString(),Toast.LENGTH_LONG).show()
            })
            builder.setNegativeButton("CANCLE",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(applicationContext,i.toString(),Toast.LENGTH_LONG).show()
            })
            builder.setNeutralButton("CLOSE",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(applicationContext,i.toString(),Toast.LENGTH_LONG).show()
            })
            edtbox.setText("")
            builder.show()

        }

        btnread.setOnClickListener {
            var line : String? = ""
            var fip = application.openFileInput("myfile")
            var br = BufferedReader(InputStreamReader(fip))
            while(line != null){
                line = br.readLine()
                if(line != null){
                    edtbox.append(line+"\n")
                }
            }
        }
    }
}