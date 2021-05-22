package com.example.directsport.ui.foot

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.directsport.R
import com.example.directsport.RecyclerAdapterFoot
import com.example.directsport.ui.foot.EquipeResultatFragment

class RecyclerAdapterFootResultat: RecyclerView.Adapter<RecyclerAdapterFootResultat.ViewHolder>() {

    //private var list = listOf<ItemFoot>(ItemFoot("Saint-Etienne","Les verts","1"),ItemFoot("Lille","Lille","0"))
    private var titles1 = arrayOf("11.01", "17.01", "01.02", "07.02","17.02","23.02")

    private var images = intArrayOf(R.drawable.download_removebg_preview__1_, R.drawable.download_removebg_preview__1_, R.drawable.download_removebg_preview__1_,R.drawable.download_removebg_preview__1_, R.drawable.download_removebg_preview__1_, R.drawable.download_removebg_preview__1_)
    private var images2 = intArrayOf(R.drawable.ol, R.drawable.om, R.drawable.psg, R.drawable.rennes, R.drawable.angers, R.drawable.dijon)
    private var images3 = intArrayOf(R.drawable.bon_removebg_preview, R.drawable.bon_removebg_preview, R.drawable.faux_removebg_preview, R.drawable.bon_removebg_preview, R.drawable.bon_removebg_preview, R.drawable.faux_removebg_preview)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapterFootResultat.ViewHolder {
        val v2 = LayoutInflater.from(parent.context).inflate(R.layout.card_layoutfoot_resultat, parent, false)
        return ViewHolder(v2)
    }

    override fun getItemCount(): Int {
        return titles1.size

    }

    override fun onBindViewHolder(holder: RecyclerAdapterFootResultat.ViewHolder, position: Int) {
        holder.itemTitle.text = titles1[position]


        holder.itemImage.setImageResource(images[position])
        holder.itemImage2.setImageResource(images2[position])
        holder.itemImage3.setImageResource(images3[position])


    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var itemImage: ImageView
        var itemImage2: ImageView
        var itemImage3: ImageView
        var itemTitle: TextView



        init{

            itemImage = itemView.findViewById(R.id.item_imageR)
            itemImage2 = itemView.findViewById(R.id.item_image2R)
            itemImage3 = itemView.findViewById(R.id.imageView5R)
            itemTitle = itemView.findViewById(R.id.textView7)



            itemView.setOnClickListener {
                val position: Int = adapterPosition
                Toast.makeText(itemView.context, "you clicked on ${titles1[position]}", Toast.LENGTH_LONG).show()

            }

        }
    }


}