package com.example.gridview

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomGridView(val activity: Activity, val list: List<OutData>) : ArrayAdapter<OutData>(activity, R.layout.layout_item) {
    override fun getCount(): Int {
        return list.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val context = activity.layoutInflater
        val rowView = context.inflate(R.layout.layout_item, parent, false)

        val image = rowView.findViewById<ImageView>(R.id.imgView)
        val tenPhim = rowView.findViewById<TextView>(R.id.txtTenPhim)

        image.setImageResource(list[position].image)
        tenPhim.text = list[position].tenPhim

        return rowView
    }
}