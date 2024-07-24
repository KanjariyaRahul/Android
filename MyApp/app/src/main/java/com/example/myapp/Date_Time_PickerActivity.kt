package com.example.myapp

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.text.Editable

import android.text.TextWatcher
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Calendar

class Date_Time_PickerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_date_time_picker)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var etEmail : EditText = findViewById(R.id.editTextTextEmailAddress)
        var etDate : EditText = findViewById(R.id.editTextDate)
        var etTime : EditText = findViewById(R.id.editTextTime)
        var cal = Calendar.getInstance()



        var actvCity : AutoCompleteTextView = findViewById(R.id.actiCity)

        var city = arrayOf("rajkot", "jamnagr", "Ahmedabad" , "Baroda" , "junagadh" , "Bhavanagar")
        var adapter = ArrayAdapter<String>(this , android.R.layout.simple_spinner_dropdown_item, city)
        actvCity.setAdapter(adapter)


        var macktvSkill : MultiAutoCompleteTextView = findViewById(R.id.mactvSkill)

        var skills = arrayOf("Web design" , "Web Devlopment" , "seo" , "dev ops" , "Android" , "flutter")
        var skillAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_checked , skills)
        macktvSkill.setAdapter(skillAdapter)
        macktvSkill.setTokenizer(MultiAutoCompleteTextView.CommaTokenizer())

        etEmail.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if(!android.util.Patterns.EMAIL_ADDRESS.matcher(p0).matches()){
                    etEmail.setError("Invalid Input")
                }
            }
            override fun afterTextChanged(p0: Editable?) {
            }
        })

        etDate.setOnClickListener {
            DatePickerDialog(this , DatePickerDialog.OnDateSetListener { datePicker, year, month, day ->
                etDate.setText("$day/${month+1}/$year")
//                Toast.makeText(applicationContext, "$day/${month+1}/$year", Toast.LENGTH_LONG).show()
            }, cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH)).show()
        }

        etTime.setOnClickListener {
            TimePickerDialog(this,TimePickerDialog.OnTimeSetListener { timePicker, hours, minutes ->
                etTime.setText("$hours : $minutes")
            }, cal.get(Calendar.HOUR) , cal.get(Calendar.MINUTE),true).show()
        }


    }
}