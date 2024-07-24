package com.example.framelayout_pb_sb_rb

import android.os.Bundle
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ButtonsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_buttons)

        var button : Button = findViewById(R.id.button)
        var imgbtn : ImageButton = findViewById(R.id.imageButton)
        var tglbtn : ToggleButton = findViewById(R.id.toggleButton)
        var imgview : ImageView = findViewById(R.id.imageView)
        var  floatingbtn : FloatingActionButton = findViewById(R.id.floatingActionButton)
//        var phone : EditText = findViewById(R.id.editTextPhone)

        button.setOnClickListener {
            Toast.makeText(applicationContext,"Simple Button Clicked..",Toast.LENGTH_LONG).show()
        }
        imgbtn.setOnClickListener {
            Toast.makeText(applicationContext,"View Button Clicked..",Toast.LENGTH_LONG).show()
        }
        tglbtn.setOnClickListener {
            if(tglbtn.text.equals("OFF")){
                imgview.setImageResource(R.drawable.off)
            }
            else{
                imgview.setImageResource(R.drawable.on)
            }
        }
//        floatingbtn.setOnClickListener {
//            val phoneNumber = phone.text.toString()
//            if (phoneNumber.isNotEmpty()) {
//                Toast.makeText(this, "Phone Number: $phoneNumber", Toast.LENGTH_SHORT).show()
//            } else {
//                Toast.makeText(this, "Please enter a phone number", Toast.LENGTH_SHORT).show()
//            }
//        }

        var ch1 : CheckBox = findViewById(R.id.checkBox)
        var ch2 : CheckBox = findViewById(R.id.checkBox1)
        var ch3 : CheckBox = findViewById(R.id.checkBox2)
        var str : String
        var textview : TextView = findViewById(R.id.textView2)


        ch1.setOnClickListener {
            str = "Java : ${ch1.isChecked}\n Kotlin : ${ch2.isChecked}\nAndroid : ${ch3.isChecked}"
            textview.setText(str)
        }
        ch2.setOnClickListener {
            str = "Java : ${ch1.isChecked}\n Kotlin : ${ch2.isChecked}\nAndroid : ${ch3.isChecked}"
            textview.setText(str)
        }
        ch3.setOnClickListener {
            str = "Java : ${ch1.isChecked}\n Kotlin : ${ch2.isChecked}\nAndroid : ${ch3.isChecked}"
            textview.setText(str)
        }

        var rg : RadioGroup = findViewById(R.id.ReadioGroup)
        var tv2 : TextView = findViewById(R.id.textView3)
        var resetBtn : Button = findViewById(R.id.resetbtn)

        rg.setOnCheckedChangeListener { radioGroup, i ->
            var rb = findViewById<RadioButton>(i)
            if(rb!=null){
                tv2.setText(rb.text)
            }
        }

        resetBtn.setOnClickListener {
            rg.clearCheck()
            tv2.setText("Select options")
        }
    }
}
