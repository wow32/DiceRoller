package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.roll_button).setOnClickListener{
            //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()


            val resultText = findViewById<TextView>(R.id.result_text)
            //resultText.text = "Dice Rolled!"
            val randomInt = (1..6).random()
            resultText.text = randomInt.toString()

        }

    }
}