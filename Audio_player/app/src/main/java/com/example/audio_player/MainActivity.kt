package com.example.audio_player

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.net.URL

class MainActivity : AppCompatActivity() {

    lateinit var btnaudio : Button
    lateinit var btnstop : Button
    lateinit var btnaudio1 : Button
    lateinit var btnstop1 : Button
    lateinit var mp : MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnaudio = findViewById(R.id.btnaudio)
        btnstop = findViewById(R.id.btnstop)
        btnaudio1 = findViewById(R.id.btnaudio1)
        btnstop1 = findViewById(R.id.btnstop1)

        btnaudio.setOnClickListener {
            mp = MediaPlayer.create(this, R.raw.kadi)
            mp.start()
        }

        btnstop.setOnClickListener {
            mp.stop()
        }

        btnaudio1.setOnClickListener {
            mp = MediaPlayer()

            mp.setDataSource(this , Uri.parse("https://wynk.in/u/bIIU8Ia7h"))
            mp.prepare()
            mp.start()
        }

        btnstop1.setOnClickListener {
            mp.stop()
        }
    }
}