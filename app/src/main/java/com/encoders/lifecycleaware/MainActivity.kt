package com.encoders.lifecycleaware

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(Observer())

        Log.d("Activity","ON CREATE is Call")

    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity","ON RESUME is Call")
    }
}