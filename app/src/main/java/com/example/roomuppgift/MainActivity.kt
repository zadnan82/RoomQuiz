package com.example.roomuppgift

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var startButton : Button
    lateinit var etName : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        startButton = findViewById(R.id.startButton)
        etName = findViewById(R.id.etName)

        startButton.setOnClickListener {
            if (etName.text.toString().isEmpty()) {

                Toast.makeText(this, "Please enter your name!", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, ChoiceActivity::class.java)
                intent.putExtra(Constants.NAME, etName.text.toString())
                startActivity(intent)
                finish()

            }
        }
    }
}