package com.tesinitsyn.firstpractiseapi34

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tesinitsyn.firstpractiseapi34.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var biniding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}