package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.Toast
import androidx.activity.ComponentActivity

import androidx.activity.enableEdgeToEdge


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var pb : ProgressBar = findViewById(R.id.progressBar)

        Thread(Runnable {
            var count = 0
            while (count <=100){
                Thread.sleep(10)
                count ++
                pb.setProgress(count)
                pb.secondaryProgress = count + 10

                if(count >=100){
                    try {
                        val i = Intent(this, HomeActivity::class.java)
                        startActivity(i)
                    } catch (e: Exception) {
                        e.printStackTrace()
                        Toast.makeText(this, "Failed to start HomeActivity", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }).start()
//        setContent {
//            MyAppTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }
    }
}
