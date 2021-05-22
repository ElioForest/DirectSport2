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

class EquipeCalendrierFragment : Fragment() {

    private var layoutManager3 : RecyclerView.LayoutManager?=null
    private var adapter3 : RecyclerView.Adapter<RecyclerAdapterFootCalendrier.ViewHolder>?=null

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?

    ): View? {
        val root = inflater.inflate(R.layout.fragment_calendrier_equipe_foot, container, false)


        val textViewResult1: TextView = root.findViewById(R.id.textViewResultat2)
        textViewResult1.text = "Résultats"
        val textViewCalendrier1: TextView = root.findViewById(R.id.textViewcalendrier2)
        textViewCalendrier1.text = "Calendrier"
        val textViewClassement1: TextView = root.findViewById(R.id.textViewclassement2)
        textViewClassement1.text = "Classement"

        val recyclerfoot3: RecyclerView = root.findViewById(R.id.recyclerViewfooot3)
        this.layoutManager3 = LinearLayoutManager(requireContext())
        recyclerfoot3.layoutManager = this.layoutManager3
        adapter3 = RecyclerAdapterFootCalendrier()
        recyclerfoot3.adapter = this.adapter3

        textViewClassement1.setOnClickListener {
            findNavController().navigate(R.id.action_equipeCalendrierFragment_to_equipeClassementFragment)
        }

        textViewResult1.setOnClickListener {
            findNavController().navigate(R.id.action_equipeCalendrierFragment_to_equipeResultatFragment)
        }

        return root
    }
}