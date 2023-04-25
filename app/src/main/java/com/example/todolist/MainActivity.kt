package com.example.todolist

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var task_list: MutableList<taskentered>
    lateinit var Recyclerview : RecyclerView
    lateinit var myAdapter:MyAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Recyclerview = findViewById(R.id.Recyclerview)

        val submit: TextView= findViewById(R.id.button)
        val enter_task: EditText= findViewById(R.id.task_to_be_entered)


        task_list = mutableListOf(taskentered("wedfwefwef"))

        myAdapter=MyAdapter(task_list)
        Recyclerview.adapter=myAdapter
        Recyclerview.layoutManager=LinearLayoutManager(this)
        submit.setOnClickListener {
            val tt=taskentered(enter_task.text.toString())
            myAdapter.updateDetails(tt)
        }




    }
}