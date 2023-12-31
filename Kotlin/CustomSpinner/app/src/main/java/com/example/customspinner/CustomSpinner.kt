package com.example.customspinner

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomSpinner(val activity: Activity, val list2: List<OutData>): ArrayAdapter<OutData>(activity,R.layout.list_monan) {
    // Tái định nghĩa:
    override fun getCount(): Int {
        return list2.size   // Vẽ bao nhiêu dòng lên Spinner
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        // position: vị trí của món ăn trong danh sách list.
        // convertView: chế độ xem cho từng mục trong Spinner.
        // parent (ViewGroup):  ViewGround cha đang chứa Spinner.
        return initView(position, convertView, parent)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }

    // Hàm xử lý view:
    private fun initView(position: Int, convertView: View?, parent: ViewGroup): View {
        // Chuyển đổi .xml thành View:
        val context = activity.layoutInflater
        // Biến .xml layout thành View:
        val rowView = context.inflate(R.layout.list_monan, parent, false)

        val images = rowView.findViewById<ImageView>(R.id.image)
        val tenMonAn = rowView.findViewById<TextView>(R.id.title)

        images.setImageResource(list2[position].image)
        tenMonAn.text = list2[position].description
        return rowView;
    }
}