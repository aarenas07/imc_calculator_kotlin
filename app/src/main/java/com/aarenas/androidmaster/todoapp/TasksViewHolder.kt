package com.aarenas.androidmaster.todoapp

import android.graphics.Paint
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aarenas.androidmaster.R

class TasksViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val tvTask: TextView = view.findViewById(R.id.tvTask)
    private val cbTask: TextView = view.findViewById(R.id.cbTask)
    fun render(task: Task) {

        if (task.isSelected){

        } else {
            tvTask.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG.inv()
        }

        tvTask.text = task.name
    }

}