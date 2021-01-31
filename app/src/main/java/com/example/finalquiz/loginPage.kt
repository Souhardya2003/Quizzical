package com.example.finalquiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class loginPage : AppCompatActivity() {

    internal lateinit var login:Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        login = findViewById(R.id.login)

        login.setOnClickListener {
            val intent1 = Intent(this, instructions_page::class.java)
            startActivity(intent1)
        }
    }
}