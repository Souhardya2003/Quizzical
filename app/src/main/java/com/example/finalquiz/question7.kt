package com.example.finalquiz

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class question7 : AppCompatActivity() {

    internal lateinit var next7 : Button
    private lateinit var quiz7Options: RadioGroup
    private lateinit var mHandler: Handler
    private lateinit var mRunnable: Runnable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question7)

        next7 = findViewById(R.id.next7)
        quiz7Options = findViewById(R.id.q7option)

        startMainActivity()
        next7.setOnClickListener{
            var id: Int = quiz7Options.checkedRadioButtonId
            if (id != -1){
                val radio: RadioButton = findViewById(id)
                if (id == R.id.option4q7) {
                    Toast.makeText(applicationContext, "Correct!", Toast.LENGTH_SHORT).show()
                }
                else {
                    Toast.makeText(applicationContext, "Wrong!", Toast.LENGTH_SHORT).show()}
            }
            else{
                Toast.makeText(applicationContext, "No answer selected!", Toast.LENGTH_SHORT).show()
            }
            val intent2 = Intent(this, question8::class.java)
            startActivity(intent2)

        }

    }
    private fun startMainActivity(){
        mRunnable = Runnable { startActivity(Intent(this, question8::class.java))
            finish()
        }
        mHandler = Handler()
        mHandler.postDelayed(mRunnable,7000)
    }

    override fun onStop() {
        super.onStop()
        mHandler.removeCallbacks(mRunnable)
    }

    }
