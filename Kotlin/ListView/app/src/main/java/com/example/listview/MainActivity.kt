package com.example.listview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.example.listview_nc.CustomAdapter
import com.example.listview_nc.OutData

class MainActivity : AppCompatActivity() {
    lateinit var customAdapter: CustomAdapter
    /*
    * lateinit là khởi tạo muộn.
    * Thông thường ta khai báo biến kotlin sẽ yêu cầu khởi tạo (gán giá trị cho biên)
    * Ta có thể dùng lateinit để gán giá trị sau.
    * Ví dụ: lateinit var chuoi:String.
    * */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Danh sách các item list:
        var list = mutableListOf<OutData>()
        list.add(OutData(R.drawable.pic_1, "Doraemon", "Chú mèo máy đến từ tương lai"))
        list.add(OutData(R.drawable.pic_2, "Pacific Rim", "Đại chiến Thái Bình Dương"))
        list.add(OutData(R.drawable.pic_3, "Tom & Jerry", "Mèo và chuột"))
        list.add(OutData(R.drawable.pic_4, "Iron man 3", "Tony Stark"))
        list.add(OutData(R.drawable.pic_5, "Avenger 3", "Infinity war"))
        list.add(OutData(R.drawable.pic_1, "Doraemon", "Chú mèo máy đến từ tương lai"))
        list.add(OutData(R.drawable.pic_2, "Pacific Rim", "Đại chiến Thái Bình Dương"))
        list.add(OutData(R.drawable.pic_3, "Tom & Jerry", "Mèo và chuột"))
        list.add(OutData(R.drawable.pic_4, "Iron man 3", "Tony Stark"))
        list.add(OutData(R.drawable.pic_5, "Avenger 3", "Infinity war"))

        customAdapter = CustomAdapter(this, list)

        // Khai báo 1 biến link đến listPhim (activity_main.xml)
        val listPhim = findViewById<ListView>(R.id.listPhim)

        listPhim.adapter = customAdapter

        // Listview item click:
        listPhim.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "Bạn chọn phim " + list[i].title, Toast.LENGTH_SHORT).show()
        }
    }
}