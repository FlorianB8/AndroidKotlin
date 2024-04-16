package com.example.exerciceandroid

import android.R.attr.defaultValue
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        val participantName = findViewById<TextView>(R.id.name);
        val participantJob = findViewById<TextView>(R.id.job);
        val participantSociety = findViewById<TextView>(R.id.society);

        val name = intent.getStringExtra("name")
        val job = intent.getStringExtra("job")
        val society = intent.getStringExtra("society")

        participantName.text = name
        participantJob.text = job
        participantSociety.text = society

        val buttonConfirm = findViewById<Button>(R.id.buttonConfirm)
        buttonConfirm.setOnClickListener{
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("name", participantName.getText().toString());
            intent.putExtra("job", participantJob.getText().toString());
            intent.putExtra("society", participantSociety.getText().toString());
            startActivity(intent);
        }
    }
}