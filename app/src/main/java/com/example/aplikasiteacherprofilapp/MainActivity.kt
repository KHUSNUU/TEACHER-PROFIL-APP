package com.example.aplikasiteacherprofilapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.buttonrequestguru)
        val btn2 = findViewById<Button>(R.id.buttonrequestsekolah)

        btn1.setOnClickListener {
            val marom = Intent(this, MainActivity2::class.java)
            startActivity(marom)
        }
        btn2.setOnClickListener {
            val marom2 = Intent(this, MainActivity3::class.java)
            startActivity(marom2)
        }
    }
}