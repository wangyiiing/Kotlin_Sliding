package com.example.switching

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImagePagerAdapter(private val images: List<Int>) : RecyclerView.Adapter<ImagePagerAdapter.ViewHolder>() {

    // ViewHolder内部类，用于保存视图引用
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    // 创建ViewHolder时调用
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.image_item, parent, false)
        return ViewHolder(view)
    }

    // 将数据绑定到ViewHolder中
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(images[position])
    }

    // 返回数据项的数量
    override fun getItemCount(): Int = images.size
}