package com.example.quizapp

import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ListAdapter
import com.example.quizapp.R.string.dialogMessage

class FeedbackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)
        var tvFeedback = findViewById<TextView>(R.id.tvFeedback)
        var rbStars = findViewById<RatingBar>(R.id.rbStars)
        var btnStart = findViewById<Button>(R.id.btnStart)
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
        btnStart.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            //set title for alert dialog
            builder.setTitle(R.string.dialogTitle)
            //set message for alert dialog
            builder.setMessage(dialogMessage)
            builder.setIcon(R.drawable.feedback)

            //performing positive action
            builder.setPositiveButton("Yes") { dialogInterface, which ->
                Toast.makeText(applicationContext, "Thank you", Toast.LENGTH_LONG).show()
            }
            //performing cancel action
            builder.setNeutralButton("Cancel") { dialogInterface, which ->
                Toast.makeText(
                    applicationContext,
                    "clicked cancel\n operation cancel",
                    Toast.LENGTH_LONG
                ).show()
            }
            val dialog = builder.create()
            dialog.show()
        }
    }
}