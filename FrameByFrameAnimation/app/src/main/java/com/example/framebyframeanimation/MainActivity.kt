package com.example.framebyframeanimation

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ad = AnimationDrawable()

        var frame1 = resources.getDrawable(R.drawable.img1,null)
        var frame2 = resources.getDrawable(R.drawable.img2,null)
        var frame3 = resources.getDrawable(R.drawable.img3,null)
        var frame4 = resources.getDrawable(R.drawable.img4,null)
        var frame5 = resources.getDrawable(R.drawable.img5,null)
        var frame6 = resources.getDrawable(R.drawable.img6,null)
        var frame7 = resources.getDrawable(R.drawable.img7,null)
        var frame8 = resources.getDrawable(R.drawable.img8,null)

        ad.addFrame(frame1,100)
        ad.addFrame(frame2,100)
        ad.addFrame(frame3,100)
        ad.addFrame(frame4,100)
        ad.addFrame(frame5,100)
        ad.addFrame(frame6,100)
        ad.addFrame(frame7,100)
        ad.addFrame(frame8,100)

        var iv = findViewById<ImageView>(R.id.framebyframeimg)
        iv.background = ad
        ad.start()

    }
}