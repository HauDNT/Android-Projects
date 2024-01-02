package com.example.datepicker_timepicker

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    // Khai báo biến cal lấy thời gian hiện tại:
    val today = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lấy ngày, tháng, năm, giờ và phút hiện tại:
        val startDay = today.get(Calendar.DAY_OF_MONTH)
        val startMonth = today.get(Calendar.MONTH)
        val startYear = today.get(Calendar.YEAR)
        val startHour = today.get(Calendar.HOUR_OF_DAY)
        val startMinute = today.get(Calendar.MINUTE)

        txtTime.text = "$startHour:$startMinute"
        txtDate.text = "$startDay/${startMonth + 1}/$startYear"

        // 1. Set lại thời gian khi click vào button time:
        btnTime.setOnClickListener {
            // Time picker:
            TimePickerDialog(this@MainActivity, TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                // hourOfDay: giờ người dùng chọn
                // minute: phút người dùng chọn
                txtTime.setText("$hourOfDay:$minute")
            }, startHour, startMinute, true).show()
        }

        // 2. Set lại ngày tháng khi click vào button calendar:
        btnCalendar.setOnClickListener {
            DatePickerDialog(this@MainActivity, DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                txtDate.setText("$dayOfMonth/${month + 1}/$year")
            }, startYear, startMonth, startDay).show()
        }
    }
}