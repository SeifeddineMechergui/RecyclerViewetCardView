package com.dev.recyclerviewetcardview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val gouvernorat = intent.getSerializableExtra("gouvernorat") as? Gouvernorat
        if (gouvernorat != null) {
            val nameTextView = findViewById<TextView>(R.id.detailName)
            val imageView = findViewById<ImageView>(R.id.detailImage)

            nameTextView.text = gouvernorat.name
            imageView.setImageResource(gouvernorat.imageResourceId)
        } else {
            val errorTextView = findViewById<TextView>(com.google.android.material.R.id.textinput_error)
            errorTextView.text = "Gouvernorat data not available"        }
    }
}






