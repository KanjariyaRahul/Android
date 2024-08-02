package com.example.loginapp

import android.app.DatePickerDialog
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Initialize UI elements
        var login: TextView = findViewById(R.id.login)
        var editSurname: EditText = findViewById(R.id.editSurname)
        var editName: EditText = findViewById(R.id.editName)
        var editEmail: EditText = findViewById(R.id.editEmail)
        var editPassword: EditText = findViewById(R.id.editPassword)
        var editDob: EditText = findViewById(R.id.editdob)
        var gender: RadioGroup = findViewById(R.id.ReadioGroup)
        var editCity: AutoCompleteTextView = findViewById(R.id.editCity)
        var btnRegister: Button = findViewById(R.id.btnregister)
        var calendar = Calendar.getInstance()

        // Get SharedPreferences
        val sp = getSharedPreferences("registerData", Context.MODE_PRIVATE)
        val editor = sp.edit()


        if (intent != null && intent.hasExtra("EMAIL")) {
            val email = intent.getStringExtra("EMAIL")
            editSurname.setText(sp.getString("editSurname", ""))
            editName.setText(sp.getString("editName", ""))
            editEmail.setText(email)
            editEmail.isEnabled = false
            editPassword.setText(sp.getString("editPassword", ""))
            editDob.setText(sp.getString("editdob", ""))

            val genderValue = sp.getString("gender", "")
            if (genderValue == "Male") {
                gender.check(R.id.radmale)
            } else if (genderValue == "Female") {
                gender.check(R.id.radfemale)
            }

            editCity.setText(sp.getString("editCity", ""))
        }
        // Login button listener
        login.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        // Date of Birth picker
        editDob.setOnClickListener {
            DatePickerDialog(this, { _, year, month, day ->
                // Display date in format: dd/mm/yyyy
                editDob.setText("$day/${month + 1}/$year")
            }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show()
        }

        // Register button listener
        btnRegister.setOnClickListener {
            val selectedGenderId = gender.checkedRadioButtonId
            val selectedGender = if (selectedGenderId != -1) {
                findViewById<RadioButton>(selectedGenderId).text.toString()
            } else {
                "Not Specified"
            }

            // Save data to SharedPreferences
            editor.putString("editSurname", editSurname.text.toString())
            editor.putString("editName", editName.text.toString())
            editor.putString("editEmail", editEmail.text.toString())
            editor.putString("editPassword", editPassword.text.toString())
            editor.putString("editdob", editDob.text.toString())
            editor.putString("gender", selectedGender)
            editor.putString("editCity", editCity.text.toString())
            editor.commit()


            // Show a toast message
            Toast.makeText(applicationContext, "Data Saved!!", Toast.LENGTH_LONG).show()

            // Navigate to DisplayActivity
            val intent = Intent(this, Login::class.java)
            startActivity(intent)

            // Clear input fields (optional, if you want to clear the fields after saving)
            editSurname.setText("")
            editName.setText("")
            editEmail.setText("")
            editPassword.setText("")
            editDob.setText("")
            gender.clearCheck()
            editCity.setText("")
        }
    }
}