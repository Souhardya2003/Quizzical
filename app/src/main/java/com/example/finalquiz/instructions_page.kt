package com.example.finalquiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class instructions_page : AppCompatActivity() {

    internal lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instructions_page)

        button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent2 = Intent(this, question1::class.java)
            startActivity(intent2)
        }
    }
}