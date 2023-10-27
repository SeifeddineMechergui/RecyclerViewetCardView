package com.dev.recyclerviewetcardview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import android.content.Context
import android.content.Intent


class GouvernoratAdapter(private val context: Context, private val gouvernorats: List<Gouvernorat>) :
    RecyclerView.Adapter<GouvernoratAdapter.GouvernoratViewHolder>() {

    inner class GouvernoratViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val nomTextView: TextView = itemView.findViewById(R.id.nomTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GouvernoratViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.gouvernorat_item, parent, false)
        return GouvernoratViewHolder(view)
    }

    override fun onBindViewHolder(holder: GouvernoratViewHolder, position: Int) {
        val gouvernorat = gouvernorats[position]
        holder.imageView.setImageResource(gouvernorat.imageResourceId)
        holder.nomTextView.text = gouvernorat.nom

        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("gouvernorat", gouvernorat)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return gouvernorats.size
    }
}

