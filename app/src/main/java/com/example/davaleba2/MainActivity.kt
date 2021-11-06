package com.example.davaleba2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var click = findViewById<TextView>(R.id.button)
        click.setOnClickListener {
            Toast.makeText(this,"2500$",Toast.LENGTH_LONG).show()
        }
    }
}
