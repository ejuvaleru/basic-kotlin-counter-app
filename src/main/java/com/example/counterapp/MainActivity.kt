package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var counterTxt: TextView
    private lateinit var addBtn: Button
    private  lateinit var resetBtn : Button
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counterTxt = findViewById(R.id.counterTxt)
        addBtn = findViewById(R.id.addBtn)
        resetBtn = findViewById(R.id.resetBtn)

        addBtn.setOnClickListener{
            counter++
            counterTxt.text = counter.toString()
        }

        resetBtn.setOnClickListener{
            counter = 0
            counterTxt.text = counter.toString()
        }
    }
}