package com.example.finalquiz

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class question1 : AppCompatActivity() {

    internal lateinit var next1 :Button
    private lateinit var quiz1Options: RadioGroup
    private lateinit var mHandler: Handler
    private lateinit var mRunnable: Runnable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question1)

        next1 = findViewById(R.id.next1)
        quiz1Options = findViewById(R.id.q1option)

        startMainActivity()
        next1.setOnClickListener{
            var id: Int = quiz1Options.checkedRadioButtonId
            if (id != -1){
                val radio: RadioButton = findViewById(id)
                if (id == R.id.option1q1) {
                    Toast.makeText(applicationContext, "Correct!", Toast.LENGTH_SHORT).show()
                }
                else {
                    Toast.makeText(applicationContext, "Wrong!", Toast.LENGTH_SHORT).show()}
            }
            else{
                Toast.makeText(applicationContext, "No answer selected!", Toast.LENGTH_SHORT).show()
            }
            val intent2 = Intent(this, question2::class.java)
            startActivity(intent2)

        }

    }
    private fun startMainActivity(){
        mRunnable = Runnable { startActivity(Intent(this, question2::class.java))
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