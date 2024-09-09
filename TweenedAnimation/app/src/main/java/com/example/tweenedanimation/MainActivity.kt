package com.example.tweenedanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var iv = findViewById<ImageView>(R.id.imageView2)

        var b = findViewById<Button>(R.id.button)
        b.setOnClickListener {
            var an = AnimationUtils.loadAnimation(this,R.anim.spin)
            iv.startAnimation(an)
        }

        var b2 = findViewById<Button>(R.id.button2)
        b2.setOnClickListener {
            var an = AnimationUtils.loadAnimation(this,R.anim.zoom)
            iv.startAnimation(an)
        }

        var b3 = findViewById<Button>(R.id.button3)
        b3.setOnClickListener {
            var an = AnimationUtils.loadAnimation(this,R.anim.move)
            iv.startAnimation(an)
        }
        var b4 = findViewById<Button>(R.id.button4)
        b4.setOnClickListener {
            var an = AnimationUtils.loadAnimation(this,R.anim.blink)
            iv.startAnimation(an)
        }

    }
}