package com.example.exerciceandroid

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        val participantName = findViewById<TextView>(R.id.name);
        val participantJob = findViewById<TextView>(R.id.job);
        val participantSociety = findViewById<TextView>(R.id.society);
        val name = intent.getStringExtra("name")
        val job = intent.getStringExtra("job")
        val society = intent.getStringExtra("society")

        participantName.text = name
        participantJob.text = job
        participantSociety.text = society
    }
}