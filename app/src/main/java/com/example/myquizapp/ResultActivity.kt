package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName=findViewById<TextView>(R.id.tvName)
        val tvScore=findViewById<TextView>(R.id.tvScore)
        val btnFinish=findViewById<TextView>(R.id.btnFinish)

        tvName.text=intent.getStringExtra(Constants.USER_NAME)
        val totalQuestions=intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswers=intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        tvScore.text="Your score is $correctAnswers out of $totalQuestions"

        btnFinish.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}