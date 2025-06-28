package com.example.financetracker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class homepageactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.homepage)
         val name=intent.getStringExtra("name")
        val nameWrite=findViewById<TextView>(R.id.nameView)

        nameWrite.append(name)
        val btn =findViewById<Button>(R.id.category)
        btn.setOnClickListener(){
            val tr=Intent(this@homepageactivity,categorypage::class.java)
            startActivity(tr)
        }
        val hisbtn =findViewById<Button>(R.id.history1)
        hisbtn.setOnClickListener(){
            val tr=Intent(this@homepageactivity,history::class.java)
            startActivity(tr)
        }
    }
}