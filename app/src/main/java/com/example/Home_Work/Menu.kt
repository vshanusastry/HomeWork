package com.example.Home_Work

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.R

class Menu : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var my_image_button1 = findViewById<ImageButton>(R.id.my_image_button1)
        var my_image_button = findViewById<ImageButton>(R.id.my_image_button)

        my_image_button1.setOnClickListener {
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            startActivity(intent)
            // Do something when button1 is clicked
        }

        my_image_button.setOnClickListener {
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            startActivity(intent)
            // Do something when button2 is clicked
        }


    }
}