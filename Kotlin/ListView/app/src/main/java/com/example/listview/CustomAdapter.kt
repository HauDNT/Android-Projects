package com.example.listview_nc

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.listview.R

class CustomAdapter(val activity: Activity, val list: List<OutData>) : ArrayAdapter<OutData>(activity, R.layout.list_item) {
    override fun getCount(): Int {
        return list.size    // Vẽ lên view hết tất cả các dòng.
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val context = activity.layoutInflater
        // layoutInflater là một component để chuyển layout .xml thành view trong Android.

        val rowView = context.inflate(R.layout.list_item, parent, false)

        val images = rowView.findViewById<ImageView>(R.id.images)
        val title = rowView.findViewById<TextView>(R.id.title)
        val desc = rowView.findViewById<TextView>(R.id.desc)

        title.text = list[position].title
        desc.text = list[position].desc
        images.setImageResource(list[position].image)

        return rowView
    }
}












