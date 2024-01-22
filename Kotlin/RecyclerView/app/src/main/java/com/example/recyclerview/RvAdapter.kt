package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_item.view.*

class RvAdapter(val danhSach:List<OutData>, val onPhimClick:RvInterface):RecyclerView.Adapter<RvAdapter.PhimViewHolder>() {
    // Class viewholder
    inner class PhimViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhimViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_item, parent, false)
        return PhimViewHolder(view);
    }

    override fun onBindViewHolder(holder: PhimViewHolder, position: Int) {
        holder.itemView.apply {
            txtContent.text = danhSach[position].mieuTa
            txtTitle.text = danhSach[position].tenPhim
            imgPhim.setImageResource(danhSach[position].image)

            // Lắng nghe item click chọn:
            holder.itemView.setOnClickListener {
                onPhimClick.OnClickFilm(position)
            }
        }
    }

    override fun getItemCount(): Int {
        return danhSach.size
    }
}