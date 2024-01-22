package com.example.intentbundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Gọi lệnh click đi tới màn hình 2:
        btnGo.setOnClickListener {
            val intent_main = Intent(this, Screen_2::class.java)

            // Đưa dữ liệu vào Intent
            intent_main.putExtra("bienString", "Data got from main")
            intent_main.putExtra("bienDouble", 100000.0)
            intent_main.putExtra("bienBool", "true")

//            // Đưa dữ liệu vào Bundle
//            // 1. Nạp dữ liệu
//            val bundleStore = Bundle()
//            bundleStore.putString("bienString", "Data got from main")
//            bundleStore.putDouble("bienDouble", 100000.0)
//            bundleStore.putBoolean("bienBool", true)
//            bundleStore.putInt("bienInt", 111)
//
//            // 2. Đặt bundle vào intent:
//            intent_main.putExtras(bundleStore)

            startActivity(intent_main)
        }
    }
}