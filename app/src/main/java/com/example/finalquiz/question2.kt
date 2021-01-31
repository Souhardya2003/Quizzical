package com.example.finalquiz

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class question2 : AppCompatActivity() {

    internal lateinit var next2 : Button
    private lateinit var quiz2Options: RadioGroup
    private lateinit var mHandler: Handler
    private lateinit var mRunnable: Runnable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)

        next2 = findViewById(R.id.next2)
        quiz2Options = findViewById(R.id.q2option)

        startMainActivity()
        next2.setOnClickListener{
            var id: Int = quiz2Options.checkedRadioButtonId
            if (id != -1){
                val radio: RadioButton = findViewById(id)
                if (id == R.id.option3q2) {
                    Toast.makeText(applicationContext, "Correct!", Toast.LENGTH_SHORT).show()
                }
                else {
                    Toast.makeText(applicationContext, "Wrong!", Toast.LENGTH_SHORT).show()}
            }
            else{
                Toast.makeText(applicationContext, "No answer selected!", Toast.LENGTH_SHORT).show()
            }
            val intent2 = Intent(this, question3::class.java)
            startActivity(intent2)

        }

    }
    private fun startMainActivity(){
        mRunnable = Runnable { startActivity(Intent(this, question3::class.java))
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
