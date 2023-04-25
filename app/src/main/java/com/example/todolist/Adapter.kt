package com.example.todolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MyAdapter(val list : MutableList<taskentered>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view, parent, false)
        return MyViewHolder(view)
    }

    fun updateDetails(taskentered: taskentered){
        list.add(taskentered)
        notifyItemInserted(list.size-1)
    }

    class MyViewHolder(itemview: View):ViewHolder(itemview){
        val enter_task: TextView=itemview.findViewById(R.id.task)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.enter_task.text=list[position].task
    }
    override fun getItemCount(): Int {
        return list.size
    }
}