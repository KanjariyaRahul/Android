package com.example.database

import android.content.ContentValues
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    lateinit var ed_Sname : EditText
    lateinit var ed_Sem : EditText
    lateinit var btn_Insert : Button
    lateinit var btn_Clear : Button
    lateinit var btn_Update : Button
    lateinit var btn_Delete : Button
    lateinit var btn_Next : Button
    lateinit var btn_Perv : Button
    lateinit var btn_First : Button
    lateinit var btn_Last : Button
    lateinit var  rs : Cursor
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ed_Sname = findViewById(R.id.ed_Sname)
        ed_Sem = findViewById(R.id.ed_Sem)
        btn_Insert = findViewById(R.id.btn_Insert)
        btn_Clear = findViewById(R.id.btn_Clear)
        btn_Update = findViewById(R.id.btn_Update)
        btn_Delete = findViewById(R.id.btn_Detele)
        btn_Next = findViewById(R.id.btn_Next)
        btn_Perv = findViewById(R.id.btn_Perv)
        btn_First = findViewById(R.id.btn_First)
        btn_Last  = findViewById(R.id.btn_Last)


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
            var cv = ContentValues()
            cv.put("Sname",ed_Sname.text.toString())
            cv.put("Sem",ed_Sem.text.toString())
            db.insert("Student" , null ,cv)
            showMessage("Record Inserted Successfully")
        }
        btn_Update.setOnClickListener {
            var cv = ContentValues()
            cv.put("Sname",ed_Sname.text.toString())
            cv.put("Sem",ed_Sem.text.toString())
            db.update("Student"  ,cv,"Sid = ?", arrayOf(rs.getString(0)))
            rs = db.rawQuery("Select Sid _id , Sname , Sem FROM Student ",null)
            showMessage("Record Updated Successfully")
            clear()
        }
        btn_Delete.setOnClickListener {
            db.delete("Student" ,"Sid = ?", arrayOf(rs.getString(0)))
            rs = db.rawQuery("Select Sid _id , Sname , Sem FROM Student ",null)
            showMessage("Record Deleted Successfully")
            clear()
        }


        btn_Clear.setOnClickListener {
            clear()
        }

        btn_Next.setOnClickListener {
            if(rs.moveToNext())
            {
                ed_Sname.setText(rs.getString(1))
                ed_Sem.setText(rs.getString(2))
            }
            else if(rs.moveToFirst())
            {
                ed_Sname.setText(rs.getString(1))
                ed_Sem.setText(rs.getString(2))
            }
            else{
                Toast.makeText(applicationContext, "Data Not found !!", Toast.LENGTH_SHORT).show()
            }
        }

        btn_Perv.setOnClickListener {
            if(rs.moveToPrevious())
            {
                ed_Sname.setText(rs.getString(1))
                ed_Sem.setText(rs.getString(2))
            }
            else if(rs.moveToFirst())
            {
                ed_Sname.setText(rs.getString(1))
                ed_Sem.setText(rs.getString(2))
            }
            else{
                Toast.makeText(applicationContext, "Data Not found !!", Toast.LENGTH_SHORT).show()
            }
        }

        btn_First.setOnClickListener {
            if(rs.moveToFirst()){
                ed_Sname.setText(rs.getString(1))
                ed_Sem.setText(rs.getString(2))
            }
            else{
                Toast.makeText(applicationContext, "Data Note Found !!", Toast.LENGTH_SHORT).show()
            }
        }

        btn_Last.setOnClickListener {
            if(rs.moveToLast()){
                ed_Sname.setText(rs.getString(1))
                ed_Sem.setText(rs.getString(2))
            }
            else{
                Toast.makeText(applicationContext, "Data Note Found !!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun clear() {
        ed_Sname.setText("")
        ed_Sem.setText("")
        ed_Sname.requestFocus()
    }

    private fun showMessage(s: String) {
        AlertDialog.Builder(this)
            .setTitle("Success!!!")
            .setMessage(s)
            .setPositiveButton("Ok", {dialogInterface, i->
                if(rs.moveToFirst()){
                    ed_Sname.setText(rs.getString(1))
                    ed_Sem.setText(rs.getString(2))
                }else{
                    Toast.makeText(applicationContext, "Data not Found", Toast.LENGTH_SHORT).show()
                }
            }).show()
    }

}
