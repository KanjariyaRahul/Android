package com.example.assignmentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ProgressBar
import android.widget.Toast

class progressbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progressbar)


        var pb : ProgressBar = findViewById(R.id.progressBar)

        Thread(Runnable {
            var count = 0
            while (count <=100){
                Thread.sleep(10)
                count ++
                pb.setProgress(count)
                pb.secondaryProgress = count + 10

                if(count >=100){
                        val i = Intent(this, MainActivity::class.java)
                        startActivity(i)
                }
            }
        }).start()

        }
    }