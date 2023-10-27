package com.dev.recyclerviewetcardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: GouvernoratAdapter
    private val gouvernorats = mutableListOf<Gouvernorat>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        gouvernorats.add(Gouvernorat("Tunis", R.drawable.flag))
        gouvernorats.add(Gouvernorat("Sfax", R.drawable.flag))

        adapter = GouvernoratAdapter(this, gouvernorats)
        recyclerView.adapter = adapter
    }
}

