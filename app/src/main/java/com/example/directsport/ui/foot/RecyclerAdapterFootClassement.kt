package com.example.directsport

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView



class RecyclerAdapterFootClassement: RecyclerView.Adapter<RecyclerAdapterFootClassement.ViewHolder>() {


    private var titles1 = arrayOf("64-15","60-20","59-30","70-40","60-15","65-6","70-50")
    private var titles2 = arrayOf("80","78","76","76","73","71","4")




    private var images = intArrayOf(R.drawable.classement1,R.drawable.classement2,R.drawable.classement3,R.drawable.classement4,R.drawable.classement5,R.drawable.classement6,R.drawable.classement7)
    private var images2 = intArrayOf(R.drawable.ol,R.drawable.psg,R.drawable.lille,R.drawable.om,R.drawable.dijon,R.drawable.rennes,R.drawable.asse)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapterFootClassement.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layoutfoot_classement, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return this.titles1.size
        return this.titles2.size

    }

    override fun onBindViewHolder(holder: RecyclerAdapterFootClassement.ViewHolder, position: Int) {
        holder.itemTitle.text = this.titles1[position]
        holder.itemTitle2.text = this.titles2[position]


        holder.itemImage.setImageResource(images[position])
        holder.itemImage2.setImageResource(images2[position])


    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemImage2: ImageView
        var itemTitle: TextView
        var itemTitle2: TextView



        init{
            itemImage = itemView.findViewById(R.id.item_imageC1)
            itemImage2 = itemView.findViewById(R.id.item_imageC2)
            itemTitle = itemView.findViewById(R.id.textView8)
            itemTitle2 = itemView.findViewById(R.id.textView9)




            itemImage.setOnClickListener {
                Log.d("stpmarche","cc")


            }

        }
    }
}