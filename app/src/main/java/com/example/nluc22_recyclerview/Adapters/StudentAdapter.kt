package com.example.nluc22_recyclerview.Adapters

import android.app.Activity
import android.view.ViewGroup
import androidx.core.os.persistableBundleOf
import androidx.recyclerview.widget.RecyclerView
import com.example.nluc22_recyclerview.databinding.StudentItemBinding
import com.example.nluc22_recyclerview.model.Student

class StudentAdapter(var activity:Activity , var data:ArrayList<Student>): RecyclerView.Adapter<StudentAdapter.MyViewHolder>() {
    class MyViewHolder(var binding:StudentItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = StudentItemBinding.inflate(activity.layoutInflater , parent , false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.txtName.text = data[position].name
        holder.binding.txtId.text = data[position].id
        holder.binding.txtAvg.text = data[position].avg.toString()
        holder.binding.imgStudent.setImageResource(data[position].img)

    }

    override fun getItemCount(): Int {
        return data.size
    }
}