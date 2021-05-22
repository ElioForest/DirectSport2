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


class EquipeResultatFragment : Fragment() {

    private var layoutManager2 : RecyclerView.LayoutManager?=null
    private var adapter2 : RecyclerView.Adapter<RecyclerAdapterFootResultat.ViewHolder>?=null

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View?{



        val root = inflater.inflate(R.layout.fragment_resultat_equipe_foot, container, false)

        val textViewResult1: TextView = root.findViewById(R.id.textViewresultat1)
        textViewResult1.text = "Résultats"
        val textViewCalendrier1: TextView = root.findViewById(R.id.textViewcalendrier1)
        textViewCalendrier1.text = "Calendrier"
        val textViewClassement1: TextView = root.findViewById(R.id.textViewclassement1)
        textViewClassement1.text = "Classement"


        val recyclerfoot2: RecyclerView = root.findViewById(R.id.RecyclerResultat)
        this.layoutManager2 = LinearLayoutManager(requireContext())
        recyclerfoot2.layoutManager = this.layoutManager2
        adapter2 = RecyclerAdapterFootResultat()
        recyclerfoot2.adapter = this.adapter2


        textViewCalendrier1.setOnClickListener {
            findNavController().navigate(R.id.action_equipeResultatFragment_to_equipeCalendrierFragment2)
        }

        textViewClassement1.setOnClickListener {
            findNavController().navigate(R.id.action_equipeResultatFragment_to_equipeClassementFragment)
        }


        return root
    }

}