package com.example.animation_frame_by_frame

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ad = AnimationDrawable()

        var frame1 = resources.getDrawable(R.drawable.frame1,null)
        var frame2 = resources.getDrawable(R.drawable.frame2,null)
        var frame3 = resources.getDrawable(R.drawable.frame3,null)
        var frame4 = resources.getDrawable(R.drawable.frame4,null)
        var frame5  = resources.getDrawable(R.drawable.frame5,null)
        var frame6 = resources.getDrawable(R.drawable.frame6,null)
        var frame7 = resources.getDrawable(R.drawable.frame7,null)

        ad.addFrame(frame1,40)
        ad.addFrame(frame2,40)
        ad.addFrame(frame3,40)
        ad.addFrame(frame4,40)
        ad.addFrame(frame5,40)
        ad.addFrame(frame6,40)
        ad.addFrame(frame7,40)

        var iv : ImageView = findViewById(R.id.imageview)
        iv.background = ad
        ad.start()

    }
}