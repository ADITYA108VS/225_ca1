package com.example.ca1

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.util.Log

class AlarmManagerBroadcast : BroadcastReceiver(){
    override fun onReceive(p0: Context?, p1: Intent?) {
        val mp=MediaPlayer.create(p0,R.raw.cheer)
        Log.d("hello","repeating alarm")
        mp.start()
    }
}