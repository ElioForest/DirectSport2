package com.example.directsport.ui.foot

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.directsport.R

class RecyclerAdapterFootCalendrier: RecyclerView.Adapter<RecyclerAdapterFootCalendrier.ViewHolder>() {

    //private var list = listOf<ItemFoot>(ItemFoot("Saint-Etienne","Les verts","1"),ItemFoot("Lille","Lille","0"))
    private var titles1 = arrayOf("12.05", "17.06")

    private var images = intArrayOf(R.drawable.download_removebg_preview__1_,R.drawable.download_removebg_preview__1_)
    private var images2 = intArrayOf(R.drawable.psg, R.drawable.rennes)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapterFootCalendrier.ViewHolder {
        val v2 = LayoutInflater.from(parent.context).inflate(R.layout.card_layoutfoot_calendrier, parent, false)
        return ViewHolder(v2)
    }

    override fun getItemCount(): Int {
        return titles1.size

    }

    override fun onBindViewHolder(holder: RecyclerAdapterFootCalendrier.ViewHolder, position: Int) {
        holder.itemTitle.text = titles1[position]


        holder.itemImage.setImageResource(images[position])
        holder.itemImage2.setImageResource(images2[position])



    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var itemImage: ImageView
        var itemImage2: ImageView

        var itemTitle: TextView



        init{

            itemImage = itemView.findViewById(R.id.item_imageC)
            itemImage2 = itemView.findViewById(R.id.item_image2C)

            itemTitle = itemView.findViewById(R.id.textViewC)



            itemView.setOnClickListener {
                val position: Int = adapterPosition
                Toast.makeText(itemView.context, "you clicked on ${titles1[position]}", Toast.LENGTH_LONG).show()

            }

        }
    }


}