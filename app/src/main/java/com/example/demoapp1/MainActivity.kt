package com.example.demoapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Binder
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        // TODO: Write some okay code
        // TODO: Fix issues with previous xml file

    }
}