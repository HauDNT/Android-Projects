package com.example.customspinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Tạo hàm custom spinner:
        setupCustomSpinner();
    }

    private fun setupCustomSpinner() {
        // Khai báo list_monan:
        var myList = mutableListOf<OutData>()
        myList.add(OutData(R.drawable.cam, "Cam tươi"))
        myList.add(OutData(R.drawable.duahau, "Dưa hấu"))
        myList.add(OutData(R.drawable.dau, "Dâu Trung Quốc"))
        myList.add(OutData(R.drawable.dua, "Dừa tươi"))
        myList.add(OutData(R.drawable.chuoi, "Bà ná nà"))

        val customSpinner = CustomSpinner(this,myList)
        spCustom.adapter = customSpinner


        // Click:
        spCustom.onItemSelectedListener = object :AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@MainActivity, "You choose: " + myList[position].description, Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
    }
}