package com.example.intentbundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_screen2.*

class Screen_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        // Get dữ liệu từ Intent Main
        val getIntentData = intent
        val stringVar = getIntentData.getStringExtra("bienString")
        val doubleVar = getIntentData.getDoubleExtra("bienDouble", 0.0)
        val boolVar = getIntentData.getBooleanExtra("bienBool", false)

        edtGetIntent.setText("Data: \n->" + stringVar + "\n->" + doubleVar + "\n->" + boolVar)

        // Get dữ liệu bằng Bundle
        val i = intent
        val bundle = i.extras   // Lấy bundle ra khỏi intent
        if (bundle != null) {
            val stringVar = bundle.getString("bienString")
            val doubleVar = bundle.getDouble("bienDouble")
            val boolVar = bundle.getBoolean("bienBool")
            var intVar = bundle.getInt("bienInt")

            edtGetIntent.setText("Data: \n- " + stringVar + "\n- " + doubleVar + "\n- " + boolVar + "\n- " + intVar)
        }

        // Back to Main
        btnBack.setOnClickListener {
            val intent_Back = Intent(this, MainActivity::class.java)
            startActivity(intent_Back)
        }
    }
}
