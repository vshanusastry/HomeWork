package com.example.homework

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val btnStart = findViewById<Button>(R.id.btnStart)

        btnStart.setOnClickListener {
            val username = etName.text.toString().trim()
            if (username.isEmpty()) {
                etName.error = "Username Required"
                return@setOnClickListener
            } else {
                val text = "Validation Completed"
                val duration = Toast.LENGTH_SHORT
                val intent = Intent(this, Menu::class.java)
                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                startActivity(intent)
//                finish()
            }
        }
    }
}