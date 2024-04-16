package com.example.exerciceandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val participantName = findViewById<EditText>(R.id.participantName);
        val participantJob = findViewById<EditText>(R.id.participantJob);
        val participantSociety = findViewById<EditText>(R.id.participantSociety);
        val addParticipant = findViewById<Button>(R.id.addParticipant);

        addParticipant.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("name", participantName.getText().toString());
            intent.putExtra("job", participantJob.getText().toString());
            intent.putExtra("society", participantSociety.getText().toString());
            startActivity(intent);
        }
    }
}