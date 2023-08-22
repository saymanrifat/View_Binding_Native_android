package com.bd.saymanrifat.viewbinding_native

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bd.saymanrifat.viewbinding_native.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)


        mainBinding.btn.setOnClickListener {
            mainBinding.helloText.text = "Hi, Kotlin"
        }
    }
}