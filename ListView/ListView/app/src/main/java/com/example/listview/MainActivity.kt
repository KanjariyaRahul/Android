package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview : ListView = findViewById(R.id.listview)

        var city = arrayOf("Rajkot","Surat","Ahemedabad","Baroda","Amreli")
        var adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,city)
        listview.adapter = adapter

        listview.setOnItemClickListener { adapterView, view, i, l ->
            var value = listview.getItemAtPosition(i).toString()
            var i = Intent(this,Rajkot_Activity::class.java)
            if (value.equals("Rajkot")){
                i.putExtra("city",value)
                var dis  = "Ahmedabad is the largest city in the State of Gujarat and the Seventh- largest urban agglomeration in India, with a population of almost 74 lakhs (7.4 Million). City is Located on the banks of the River Sabarmati."
                i.putExtra("disc",dis.toString())
                var path = R.drawable.rajkot
                i.putExtra("path",path)
            }
            else if (value.equals("Surat")){
                i.putExtra("city",value)
                var dis  = "This is Surat..."
                i.putExtra("disc",dis.toString())
                var path = R.drawable.surat
                i.putExtra("path",path)
            }
            else if (value.equals("Ahemedabad")){
                i.putExtra("city",value)
                var dis  = "This is Ahemedabad..."
                i.putExtra("disc",dis.toString())
                var path = R.drawable.ahemedabad
                i.putExtra("path",path)
            }
            else if (value.equals("Baroda")){
                i.putExtra("city",value)
                var dis  = "This is Baroda..."
                i.putExtra("disc",dis.toString())
                var path = R.drawable.baroda
                i.putExtra("path",path)
            }
            else if (value.equals("Amreli")){
                i.putExtra("city",value)
                var dis  = "This is Amreli..."
                i.putExtra("disc",dis.toString())
                var path = R.drawable.amreli
                i.putExtra("path",path)
            }


            startActivity(i)
//            Toast.makeText(applicationContext,value,Toast.LENGTH_LONG).show()
        }
    }
}