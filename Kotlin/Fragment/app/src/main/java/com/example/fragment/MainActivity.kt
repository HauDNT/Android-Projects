package com.example.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding:ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        val sub1 = Fragment1()
        val sub2 = Fragment2()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl1, sub1)
            commit()
        }

        binding.btnF1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fl1, sub1)
                commit()
            }
        }

        binding.btnF2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fl1, sub2)
                commit()
            }
        }
    }
}