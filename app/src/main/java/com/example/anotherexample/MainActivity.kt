package com.example.anotherexample

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.anotherexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val bttnAction: Button = activityMainBinding.bttnAction
        bttnAction.setOnClickListener { onClick() }
    }

    private fun onClick() {
        val viewText: TextView = activityMainBinding.textView
        viewText.text = "UUUUUrrrr";
    }
}