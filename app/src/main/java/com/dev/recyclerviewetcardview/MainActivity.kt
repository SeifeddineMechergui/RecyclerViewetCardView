package com.dev.recyclerviewetcardview

import android.content.Intent
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
        adapter = GouvernoratAdapter(gouvernorats)
        recyclerView.adapter = adapter

        val gouvernoratts = listOf(
            "Tunis", "Ariana", "Ben Arous", "Manouba", "Nabeul", "Zaghouan",
            "Bizerte", "Béja", "Jendouba", "Le Kef", "Siliana", "Kairouan",
            "Kasserine", "Sidi Bouzid", "Sousse", "Monastir", "Mahdia", "Sfax",
            "Gafsa", "Tozeur", "Kébili", "Tataouine", "Medenine"
        )

        for(i in 0 .. 22)
            gouvernorats.add(Gouvernorat(gouvernoratts[i], R.drawable.flag))

        adapter.setOnItemClickListener { gouvernorat ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("gouvernorat", gouvernorat)
            startActivity(intent)
        }
    }
}



