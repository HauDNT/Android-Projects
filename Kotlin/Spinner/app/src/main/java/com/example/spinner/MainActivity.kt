package com.example.spinner

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

        // Hàm test spinner cơ bản - cố định:
        // setUpSpinnerBasic_NotChange();

        // Hàm test spinner cơ bản - thay đổi:
        setUpSpinnerBasic_CanChange();
    }

    private fun setUpSpinnerBasic_CanChange() {
        val list = mutableListOf<String>()
        list.add("English")
        list.add("Vietnamese")
        list.add("Spanish")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, list)  // Hiển thị 1 dòng
        spNgonNgu.adapter = adapter

        // On item selected listener:
        spNgonNgu.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@MainActivity, "Bạn chọn " + list[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
    }

    private fun setUpSpinnerBasic_NotChange() {
        // Tạo list ngôn ngữ:
        val list = resources.getStringArray(R.array.ngonngu)

        // Khai báo bộ điều hướng:
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, list)  // Hiển thị 1 dòng

        // Gọi spinner:
        spNgonNgu.adapter = adapter
    }
}
