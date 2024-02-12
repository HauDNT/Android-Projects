package com.example.recyclerview_staggered

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_item.view.*


class RvAdapter(private var danhSach: List<Int>, val onClickItem: RvInterface) :
    RecyclerView.Adapter<RvAdapter.itemViewHolder>() {
    class itemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_item, parent, false)
        return itemViewHolder(view);
    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        holder.itemView.apply {
            imgAnh.setImageResource(danhSach[position])

            holder.itemView.setOnClickListener {
                onClickItem.onClickItem(position)
            }
        }
    }

    override fun getItemCount(): Int {
        return danhSach.size
    }
}