package com.example.directsport.ui.foot

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.directsport.R
import com.example.directsport.RecyclerAdapterFoot
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.directsport.FootOnClickeListener


class FootFragment : Fragment(), FootOnClickeListener {


    private var layoutManager : RecyclerView.LayoutManager?=null
    private var adapter : RecyclerView.Adapter<RecyclerAdapterFoot.ViewHolder>?=null


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_foot, container, false)


        val textViewequipe: TextView = root.findViewById(R.id.textViewEquipe1)

        textViewequipe.setOnClickListener {
            findNavController().navigate(R.id.action_nav_foot_to_equipeResultatFragment)
        }

        val recyclerfoot: RecyclerView = root.findViewById(R.id.recyclerViewfooot)
        layoutManager = LinearLayoutManager(requireContext())
        recyclerfoot.layoutManager = layoutManager
        adapter = RecyclerAdapterFoot(this)
        recyclerfoot.adapter = adapter



        return root
    }

    override fun onClick() {
        findNavController().navigate(R.id.action_nav_foot_to_equipeResultatFragment)
    }
}