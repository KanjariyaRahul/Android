package com.example.database

import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var ed_Sname : EditText
    lateinit var ed_Sem : EditText
    lateinit var btn_Insert : Button
    lateinit var btn_Clear : Button
    lateinit var  rs : Cursor
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ed_Sname = findViewById(R.id.ed_Sname)
        ed_Sem = findViewById(R.id.ed_Sem)
        btn_Insert = findViewById(R.id.btn_Insert)
        btn_Clear = findViewById(R.id.btn_Clear)




        var helper = MyDBHelper(applicationContext)
        var db = helper.writableDatabase
        Toast.makeText(applicationContext, "database and table created", Toast.LENGTH_SHORT).show()
        rs = db.rawQuery("Select Sid _id , Sname , Sem FROM Student ",null)

        if(rs.moveToFirst())
        {
            ed_Sname.setText(rs.getString(1))
            ed_Sem.setText(rs.getString(2))
        }


        btn_Insert.setOnClickListener {
            
        }
    }
}