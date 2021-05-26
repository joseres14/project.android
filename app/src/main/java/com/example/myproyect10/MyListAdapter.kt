package com.example.myproyect10

import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import android.view.LayoutInflater
import android.widget.Toast

class MyListAdapter(val myDatasetTask:ArrayList<String>):RecyclerView.Adapter<MyListAdapter.MyViewHolder> (){

    class MyViewHolder(val layout:View):RecyclerView.ViewHolder(layout)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout=LayoutInflater.from(parent.context).inflate(R.layout.layout_list_items,parent,false)
        return MyViewHolder(layout)
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var txtVwItemTask=holder.layout.findViewById<TextView>(R.id.txtVwlistItemTask)
        txtVwItemTask.text=myDatasetTask[position]

        holder.layout.setOnClickListener { Toast.makeText(holder.itemView.context,txtVwItemTask.text,Toast.LENGTH_LONG).show() }
    }

    override fun getItemCount()=myDatasetTask.size

    }




