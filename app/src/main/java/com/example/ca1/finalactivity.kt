package com.example.ca1

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.media.Rating
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.RatingBar
import android.widget.Toast

class finalactivity : AppCompatActivity() {
    private lateinit var rb:RatingBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finalactivity)
        rb=findViewById(R.id.ratingBar)
        val house=findViewById<ImageButton>(R.id.house)
        val mobile=findViewById<ImageButton>(R.id.mobile)
        val money=findViewById<ImageButton>(R.id.money)
        val holiday=findViewById<ImageButton>(R.id.holiday)
        val car=findViewById<ImageButton>(R.id.car)
        val intent = Intent(this,AlarmManagerBroadcast::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this,234, intent, 0)
        house.setOnClickListener{check(pendingIntent)}
        car.setOnClickListener{check(pendingIntent)}
        holiday.setOnClickListener{check(pendingIntent)}
        money.setOnClickListener{check(pendingIntent)}
        mobile.setOnClickListener{check(pendingIntent)}

    }
    private fun check(pendingIntent:PendingIntent){
        if(rb.rating.toInt()>0) {
            Toast.makeText(this,"CONGRATS YOU HAVE WON A LOTTERY",Toast.LENGTH_LONG).show()
            val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
            alarmManager.set(
                AlarmManager.RTC_WAKEUP,
                System.currentTimeMillis(),
                pendingIntent
            )
        }else
        {
            Toast.makeText(this,"Please provide rating first",Toast.LENGTH_SHORT).show()
        }
    }

}