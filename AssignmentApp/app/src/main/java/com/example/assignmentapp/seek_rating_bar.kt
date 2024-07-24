package com.example.assignmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class seek_rating_bar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek_rating_bar)

        var rb : RatingBar = findViewById(R.id.ratingBar1)
        var tv : TextView = findViewById(R.id.textView2)

        rb.setOnRatingBarChangeListener { ratingBar, fl, b ->
            tv.setText("Rating view  : $fl")
        }

        var sb : SeekBar = findViewById(R.id.seekBar)
        var tv2 : TextView = findViewById(R.id.textView3)

        sb.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                tv2.setText("Seekbar values : $p1")
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })
    }
}