package com.example.recyclerview_staggered

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Xuly();
    }

    private fun Xuly() {
        var danhSach = mutableListOf<Int>()
        danhSach.add(R.drawable.img_1)
        danhSach.add(R.drawable.img_2)
        danhSach.add(R.drawable.img_3)
        danhSach.add(R.drawable.img_4)
        danhSach.add(R.drawable.img_5)
        danhSach.add(R.drawable.img_6)
        danhSach.add(R.drawable.img_7)
        danhSach.add(R.drawable.img_1)
        danhSach.add(R.drawable.img_2)
        danhSach.add(R.drawable.img_3)
        danhSach.add(R.drawable.img_4)
        danhSach.add(R.drawable.img_5)
        danhSach.add(R.drawable.img_6)
        danhSach.add(R.drawable.img_7)

        rvview.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        val itemAdapter = RvAdapter(danhSach, object : RvInterface() {
            override fun onClickItem(pos: Int) {
                Toast.makeText(this@MainActivity, "You clicked on image ${danhSach[pos]}", Toast.LENGTH_SHORT).show()
            }
        })
        rvview.adapter = itemAdapter
    }
}