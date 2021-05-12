package com.example.directsport.ui.foot

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.directsport.R
import com.example.directsport.RecyclerAdapterFoot
import androidx.recyclerview.widget.LinearLayoutManager


class FootFragment : Fragment() {

    private lateinit var footViewModel: FootViewModel
    private var layoutManager : RecyclerView.LayoutManager?=null
    private var adapter : RecyclerView.Adapter<RecyclerAdapterFoot.ViewHolder>?=null

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        footViewModel =
                ViewModelProvider(this).get(FootViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_foot, container, false)

        val textView: TextView = root.findViewById(R.id.text_foot)
        textView.text = "Foot test"
        val textViewequipe: TextView = root.findViewById(R.id.textViewEquipe1)

        textViewequipe.setOnClickListener {
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_host_fragment, EquipeResultatFragment())
            transaction?.commit()
        }


        val recyclerfoot: RecyclerView = root.findViewById(R.id.recyclerViewfooot)
        layoutManager = LinearLayoutManager(requireContext())
        recyclerfoot.layoutManager = layoutManager
        adapter = RecyclerAdapterFoot()
        recyclerfoot.adapter = adapter


        return root
    }
}