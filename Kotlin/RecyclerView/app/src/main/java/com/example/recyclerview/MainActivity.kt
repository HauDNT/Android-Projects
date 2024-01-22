package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Tạo danh sách:
        val danhSach = mutableListOf<OutData>()
        danhSach.add(OutData(R.drawable.pic_1, "Doraemon", "Hoạt hình"))
        danhSach.add(OutData(R.drawable.pic_2, "Pacific Rim", "Hành động"))
        danhSach.add(OutData(R.drawable.pic_3, "Tom & Jerry", "Hoạt hình"))
        danhSach.add(OutData(R.drawable.pic_4, "Iron man 3", "Hành động"))
        danhSach.add(OutData(R.drawable.pic_5, "Avengers 3", "Hành động"))
        danhSach.add(OutData(R.drawable.pic_1, "Doraemon", "Hoạt hình"))
        danhSach.add(OutData(R.drawable.pic_2, "Pacific Rim", "Hành động"))
        danhSach.add(OutData(R.drawable.pic_3, "Tom & Jerry", "Hoạt hình"))
        danhSach.add(OutData(R.drawable.pic_4, "Iron man 3", "Hành động"))
        danhSach.add(OutData(R.drawable.pic_5, "Avengers 3", "Hành động"))

        val adapter = RvAdapter(danhSach, object : RvInterface() {
            override fun OnClickFilm(pos: Int) {
                Toast.makeText(
                    this@MainActivity, "You clicked on ${danhSach[pos].tenPhim}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })

        rvDemo.adapter = adapter

//        Hiển thị theo chiều ngang - Linear Layout:
//        rvDemo.layoutManager = LinearLayoutManager(
//            this,
//            LinearLayoutManager.VERTICAL,
//            false
//        )

//        Hiển thị theo chiều dọc - Linear Layout:
        rvDemo.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

//      Hiển thị theo chiều dọc - Grid Layout:
//        rvDemo.layoutManager = GridLayoutManager(
//            this,
//            3,
//            GridLayoutManager.HORIZONTAL,
//            false
//        )

//      Hiển thị theo chiều ngang - Grid Layout:
//        rvDemo.layoutManager = GridLayoutManager(
//            this,
//            3,
//            GridLayoutManager.VERTICAL,
//            false
//        )
    }
}