package com.learningpackage.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val tvMytextView = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        btnClickMe.setOnClickListener {

            timesClicked = timesClicked + 1
            tvMytextView.text = timesClicked.toString()

        }
    }
}