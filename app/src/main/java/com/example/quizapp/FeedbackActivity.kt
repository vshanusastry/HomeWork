package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView

class FeedbackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)
        var tvFeedback = findViewById<TextView>(R.id.tvFeedback)
        var rbStars = findViewById<RatingBar>(R.id.rbStars)
        rbStars.setOnRatingBarChangeListener(RatingBar.OnRatingBarChangeListener { ratingBar, rating, fromUser ->
            var feedback = tvFeedback.text.toString().trim()
            if (rating == 0f) {
                feedback = "Very Dissatisfied"
            } else if (rating == 1f) {
                feedback = "Dissatisfied"
            } else if (rating == 2f || rating == 3f) {
                feedback = "OK"
            } else if (rating == 4f) {
                feedback = "Satisfied"
            } else if (rating == 5f) {
                feedback = "Very Satisfied"
            } else {
            }
        })
    }
}