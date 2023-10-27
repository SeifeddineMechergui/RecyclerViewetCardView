package com.dev.recyclerviewetcardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView



class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val gouvernorat = intent.getSerializableExtra("gouvernorat") as Gouvernorat

        val imageView: ImageView = findViewById(R.id.detailImageView)
        val nomTextView: TextView = findViewById(R.id.detailNomTextView)

        imageView.setImageResource(gouvernorat.imageResourceId)
        nomTextView.text = gouvernorat.nom

        supportActionBar?.title = gouvernorat.nom
    }
}


