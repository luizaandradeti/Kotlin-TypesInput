package com.fiat.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showBtn = findViewById<Button>(R.id.showBottom)

        val editText = findViewById<EditText>(R.id.showPhone)

        showBtn.setOnClickListener {
            val msgtext = editText.text
            Toast.makeText(this, msgtext, Toast.LENGTH_SHORT).show()
        }
    }
}