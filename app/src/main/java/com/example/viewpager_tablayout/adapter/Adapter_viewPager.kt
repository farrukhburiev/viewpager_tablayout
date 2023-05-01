package com.example.viewpager_tablayout.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bumptech.glide.Glide
import com.example.viewpager_tablayout.R
import com.example.viewpager_tablayout.Walkthrough_1Fragment

class Adapter_viewPager(var list:MutableList<Int>,var context:Context): RecyclerView.Adapter<Adapter_viewPager.MyHolder>() {
    class MyHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var img = itemView.findViewById<ImageView>(R.id.img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.view_item, parent, false)
        return MyHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        var item = list.get(position)

        holder.img.setImageResource(item)

//        Glide.with(context).load(item).into(holder.img);

    }
}