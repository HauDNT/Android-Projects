package com.example.intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Gọi màn hình 2 từ Main
        btnGo_1.setOnClickListener {
            val intent_1 = Intent(this, Screen2::class.java)
            startActivity(intent_1)
        }

        // Gọi URL từ Main
        btnGo_2.setOnClickListener {
            val intent_2 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(intent_2)
        }
    }
}