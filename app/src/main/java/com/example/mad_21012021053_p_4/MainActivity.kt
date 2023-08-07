package com.example.mad_21012021053_p_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginBUTTON = findViewById<Button>(R.id.loginbtn)
        loginBUTTON.setOnClickListener {
            Intent(this@MainActivity,login_Activity::class.java).also { startActivity(it) }
        }
    }
}