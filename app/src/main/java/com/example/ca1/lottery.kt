package com.example.ca1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar

class lottery : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lottery)
        val progressbar=findViewById<ProgressBar>(R.id.progressBar2)
        val button=findViewById<Button>(R.id.button)
        var i=progressbar.progress.toString().toInt()
        button.setOnClickListener {
            if(i<=10){
                i++
                progressbar.progress=i
            }
            else{
               val  intent=Intent(this,finalactivity::class.java)
                startActivity(intent)
                finish()
            }

        }
    }
}