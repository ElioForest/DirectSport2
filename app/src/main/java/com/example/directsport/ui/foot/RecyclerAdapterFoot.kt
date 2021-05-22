package com.example.directsport


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView





interface FootOnClickeListener{
    fun onClick()
}
class RecyclerAdapterFoot(val listener: FootOnClickeListener): RecyclerView.Adapter<RecyclerAdapterFoot.ViewHolder>() {



    private var titles1 = arrayOf("Saint-Etienne", "Lille", "Monaco", "Montpellier","Nice","Nime")
    private var titles2 = arrayOf("Lyon", "Marseille", "Paris", "Rennes","Angers","Dijon")




    fun fncscore (): MutableList<String> {
        val ScoreMatchlist = mutableListOf<String>()
        for (i in 1..6) {
            val rnds1 = (0..5).random()
            val rnds2 = (0..5).random()
            val rnds11 = rnds1.toString()
            val rnds12 = rnds2.toString()
            val scoreMath = rnds11 + '-' +rnds12
            ScoreMatchlist.add(scoreMath)
        }
        return ScoreMatchlist
    }


    val titles3 = fncscore()



    private var images = intArrayOf(R.drawable.asse, R.drawable.lille, R.drawable.monaco, R.drawable.montpellier, R.drawable.nice, R.drawable.nimes)
    private var images2 = intArrayOf(R.drawable.ol, R.drawable.om, R.drawable.psg, R.drawable.rennes, R.drawable.angers, R.drawable.dijon)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapterFoot.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layoutfoot, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return this.titles1.size
        return this.titles2.size
        return this.titles3.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapterFoot.ViewHolder, position: Int) {
        holder.itemTitle.text = this.titles1[position]
        holder.itemTitle2.text = this.titles2[position]
        holder.itemTitle3.text = this.titles3.get(position)

        holder.itemImage.setImageResource(images[position])
        holder.itemImage2.setImageResource(images2[position])


    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemImage2: ImageView
        var itemTitle: TextView
        var itemTitle2: TextView
        var itemTitle3: TextView


        init{
            itemImage = itemView.findViewById(R.id.item_image)
            itemImage2 = itemView.findViewById(R.id.item_image2)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemTitle2 = itemView.findViewById(R.id.textView4)
            itemTitle3 = itemView.findViewById(R.id.textView3)



            itemImage.setOnClickListener {


                listener.onClick()

            }
            
        }
    }
}