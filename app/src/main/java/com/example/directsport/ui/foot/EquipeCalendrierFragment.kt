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

class EquipeCalendrierFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?

    ): View? {
        val root = inflater.inflate(R.layout.fragment_calendrier_equipe_foot, container, false)
        val textView1: TextView = root.findViewById(R.id.textViewResultatinfo)
        textView1.text = "Page calendrier"

        val textViewResult1: TextView = root.findViewById(R.id.textViewResultat2)
        textViewResult1.text = "Résultats"
        val textViewCalendrier1: TextView = root.findViewById(R.id.textViewcalendrier2)
        textViewCalendrier1.text = "Calendrier"
        val textViewClassement1: TextView = root.findViewById(R.id.textViewclassement2)
        textViewClassement1.text = "Classement"

        textViewClassement1.setOnClickListener {
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_host_fragment, EquipeClassementFragment())
            transaction?.commit()
        }

        textViewResult1.setOnClickListener {
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_host_fragment, EquipeResultatFragment())
            transaction?.commit()
        }

        return root
    }
}