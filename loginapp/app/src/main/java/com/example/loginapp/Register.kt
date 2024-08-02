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
        val login: TextView = findViewById(R.id.login)
        val editSurname: EditText = findViewById(R.id.editSurname)
        val editName: EditText = findViewById(R.id.editName)
        val editEmail: EditText = findViewById(R.id.editEmail)
        val editPassword: EditText = findViewById(R.id.editPassword)
        val editDob: EditText = findViewById(R.id.editdob)
        val gender: RadioGroup = findViewById(R.id.ReadioGroup)
        val editCity: AutoCompleteTextView = findViewById(R.id.editCity)
        val btnRegister: Button = findViewById(R.id.btnregister)
        val calendar = Calendar.getInstance()

        // Get SharedPreferences
        val sp = getSharedPreferences("registerData", Context.MODE_PRIVATE)
        val editor = sp.edit()

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
            editor.apply {
                putString("editSurname", editSurname.text.toString())
                putString("editName", editName.text.toString())
                putString("editEmail", editEmail.text.toString())
                putString("editPassword", editPassword.text.toString())
                putString("editdob", editDob.text.toString())
                putString("gender", selectedGender)
                putString("editCity", editCity.text.toString())
                apply() // Use apply() for asynchronous commit
            }

            // Show a toast message
            Toast.makeText(applicationContext, "Data Saved!!", Toast.LENGTH_LONG).show()

            // Navigate to DisplayActivity
            val intent = Intent(this, DisplayActivity::class.java)
            startActivity(intent)

            // Clear input fields (optional, if you want to clear the fields after saving)
            clearInputFields()
        }
    }

    private fun clearInputFields() {
        findViewById<EditText>(R.id.editSurname).setText("")
        findViewById<EditText>(R.id.editName).setText("")
        findViewById<EditText>(R.id.editEmail).setText("")
        findViewById<EditText>(R.id.editPassword).setText("")
        findViewById<EditText>(R.id.editdob).setText("")
        findViewById<RadioGroup>(R.id.ReadioGroup).clearCheck()
        findViewById<AutoCompleteTextView>(R.id.editCity).setText("")
    }
}
