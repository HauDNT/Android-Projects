package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = mutableListOf<OutData>()
        list.add(OutData(R.drawable.pic_1, "Doraemon"))
        list.add(OutData(R.drawable.pic_2, "Pacific Rim"))
        list.add(OutData(R.drawable.pic_3, "Tom and Jerry"))
        list.add(OutData(R.drawable.pic_4, "Iron man 3"))
        list.add(OutData(R.drawable.pic_5, "Avenger 3"))
        list.add(OutData(R.drawable.pic_1, "Doraemon"))
        list.add(OutData(R.drawable.pic_2, "Pacific Rim"))
        list.add(OutData(R.drawable.pic_3, "Tom and Jerry"))
        list.add(OutData(R.drawable.pic_4, "Iron man 3"))
        list.add(OutData(R.drawable.pic_5, "Avenger 3"))

        val customGridView = CustomGridView(this@MainActivity, list)
        gvPhim.adapter = customGridView

        // Click event:
        gvPhim.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Bạn chọn phim " + list[position].tenPhim, Toast.LENGTH_SHORT).show()
        }
    }
}