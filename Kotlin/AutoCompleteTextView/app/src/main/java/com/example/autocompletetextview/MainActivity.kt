package com.example.autocompletetextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Khai báo list tỉnh & adapter:
        val listTinh = resources.getStringArray(R.array.tinhthanh)
        val adt = ArrayAdapter(this, android.R.layout.simple_list_item_1, listTinh)

        autoTinhThanh.setAdapter(adt)

        // Gợi ý với 0 tỉnh thành:
        autoTinhThanh.setOnFocusChangeListener({ view, b -> if (b == true) autoTinhThanh.showDropDown()})

        // Kiểm tra & lắng nghe item nào được chọn:
        autoTinhThanh.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this@MainActivity, "Click item " + autoTinhThanh.text.toString(), Toast.LENGTH_SHORT).show()
        })
    }
}