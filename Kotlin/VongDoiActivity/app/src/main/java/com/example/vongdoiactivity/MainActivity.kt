package com.example.vongdoiactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "On created", Toast.LENGTH_SHORT).show()

        btnGo_Screen2.setOnClickListener {
            val intentScr2 = Intent(this, Screen_2::class.java)
            startActivity(intentScr2)
        }

        btnGo_Screen3.setOnClickListener {
            val intentScr3 = Intent(this, Screen_3::class.java)
            startActivity(intentScr3)
        }
    }

override fun onStart() {
    super.onStart()
    Toast.makeText(this, "On start", Toast.LENGTH_SHORT).show()
}

override fun onRestart() {
    super.onRestart()
    Toast.makeText(this, "On restart", Toast.LENGTH_SHORT).show()
}

override fun onResume() {
    super.onResume()
    Toast.makeText(this, "On resume", Toast.LENGTH_SHORT).show()
}

override fun onPause() {
    super.onPause()
    Toast.makeText(this, "On pause", Toast.LENGTH_SHORT).show()
}

override fun onStop() {
    super.onStop()
    Toast.makeText(this, "On stop", Toast.LENGTH_SHORT).show()
}

override fun onDestroy() {
    super.onDestroy()
    Toast.makeText(this, "On destroy", Toast.LENGTH_SHORT).show()
}
}