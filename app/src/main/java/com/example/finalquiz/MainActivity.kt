package com.example.finalquiz

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mHandler: Handler
    private lateinit var mRunnable: Runnable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startMainActivity()
    }

    private fun startMainActivity() {
        mRunnable = Runnable {
            startActivity(Intent(this, loginPage::class.java))
            finish()
        }
        mHandler = Handler()
        mHandler.postDelayed(mRunnable, 4000)
    }

    override fun onStop() {
        super.onStop()
        mHandler.removeCallbacks(mRunnable)
    }
}