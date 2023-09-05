package com.example.recyclerview_3

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerview_3.models.Task

class TaskDetailsActivity:AppCompatActivity() {

    private lateinit var task : Task

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        task = intent.getSerializableExtra("task") as Task
    }
}