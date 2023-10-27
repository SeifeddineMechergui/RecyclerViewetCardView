package com.dev.recyclerviewetcardview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class GouvernoratAdapter(private val gouvernorats: List<Gouvernorat>) : RecyclerView.Adapter<GouvernoratAdapter.ViewHolder>() {

    private var onItemClickListener: ((Gouvernorat) -> Unit)? = null

    fun setOnItemClickListener(listener: (Gouvernorat) -> Unit) {
        onItemClickListener = listener
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.gouvernoratName)
        val imageView: ImageView = itemView.findViewById(R.id.gouvernoratImage)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    onItemClickListener?.invoke(gouvernorats[position])
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.gouvernorat_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val gouvernorat = gouvernorats[position]
        holder.nameTextView.text = gouvernorat.name
        holder.imageView.setImageResource(gouvernorat.imageResourceId)
    }

    override fun getItemCount(): Int {
        return gouvernorats.size
    }
}
