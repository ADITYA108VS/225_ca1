package com.example.ca1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Timer().schedule(2000){
           launch()

        }
    }
    private fun launch(){
        val intent=Intent(this,lottery::class.java)
        startActivity(intent)
        finish()
    }

}