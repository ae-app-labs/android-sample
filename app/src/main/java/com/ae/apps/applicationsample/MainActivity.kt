package com.ae.apps.applicationsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val personName = findViewById<EditText>(R.id.editTextTextPersonName)

        button.setOnClickListener {
            Toast.makeText(applicationContext, "Hello " + personName.text, Toast.LENGTH_SHORT).show()
        }

    }
}