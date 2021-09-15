package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //add behavior to button
        val button = findViewById<Button>(R.id.button)
        val message = findViewById<TextView>(R.id.greetingText)
        button.setOnClickListener { message.text = "You clicked the button" }
    }
}