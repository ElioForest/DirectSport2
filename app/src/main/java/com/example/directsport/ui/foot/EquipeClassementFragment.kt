package com.example.directsport.ui.foot

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.directsport.R
import com.example.directsport.RecyclerAdapterFootClassement

class EquipeClassementFragment  : Fragment()  {
    private var layoutManager4 : RecyclerView.LayoutManager?=null
    private var adapter4 : RecyclerView.Adapter<RecyclerAdapterFootClassement.ViewHolder>?=null

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?

    ): View? {
        val root = inflater.inflate(R.layout.fragment_classement_equipe_foot, container, false)


        val textViewResult1: TextView = root.findViewById(R.id.textViewresultat3)
        textViewResult1.text = "Résultats"
        val textViewCalendrier1: TextView = root.findViewById(R.id.textViewcalendrier3)
        textViewCalendrier1.text = "Calendrier"
        val textViewClassement1: TextView = root.findViewById(R.id.textViewclassement3)
        textViewClassement1.text = "Classement"

        val recyclerfoot4: RecyclerView = root.findViewById(R.id.recyclerViewfooot4)
        this.layoutManager4 = LinearLayoutManager(requireContext())
        recyclerfoot4.layoutManager = this.layoutManager4
        adapter4= RecyclerAdapterFootClassement()
        recyclerfoot4.adapter = this.adapter4

        textViewCalendrier1.setOnClickListener {
            findNavController().navigate(R.id.action_equipeClassementFragment_to_equipeCalendrierFragment)
        }

        textViewResult1.setOnClickListener {
            findNavController().navigate(R.id.action_equipeClassementFragment_to_equipeResultatFragment)
        }

        return root
    }
}