package com.example.directsport

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapterFoot: RecyclerView.Adapter<RecyclerAdapterFoot.ViewHolder>() {

    private var titles = arrayOf("Saint-Etienne", "Chapter Two", "Chapter Three", "Chapter Four", "Chapter Five", "Chapter Six"," Chapter Seven", "Chapter Eight")

    private var images = intArrayOf(R.drawable.asse, R.drawable.lille, R.drawable.monaco, R.drawable.montpellier, R.drawable.ol, R.drawable.om, R.drawable.psg,R.drawable.rennes)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapterFoot.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layoutfoot, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapterFoot.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]

        holder.itemImage.setImageResource(images[position])
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView


        init{
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)


            itemView.setOnClickListener {
                val position: Int = adapterPosition

                Toast.makeText(itemView.context, "you clicked on ${titles[position]}", Toast.LENGTH_LONG).show()
            }
        }
    }
}