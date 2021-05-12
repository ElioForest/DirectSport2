package com.example.directsport.ui.foot

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.directsport.R

class EquipeResultatFragment : Fragment() {

    //private lateinit var footEquipeViewModel: FootViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View?{
        //footEquipeViewModel = ViewModelProvider(this).get(FootViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_resultat_equipe_foot, container, false)

        val textView1: TextView = root.findViewById(R.id.textViewEquipeInfo)
        textView1.text = "Page de resultat"
        val textViewResult1: TextView = root.findViewById(R.id.textViewresultat1)
        textViewResult1.text = "Résultats"
        val textViewCalendrier1: TextView = root.findViewById(R.id.textViewcalendrier1)
        textViewCalendrier1.text = "Calendrier"
        val textViewClassement1: TextView = root.findViewById(R.id.textViewclassement1)
        textViewClassement1.text = "Classement"

        textViewCalendrier1.setOnClickListener {
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_host_fragment, EquipeCalendrierFragment())
            transaction?.commit()
        }

        textViewClassement1.setOnClickListener {
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_host_fragment, EquipeClassementFragment())
            transaction?.commit()
        }


        return root
    }

}