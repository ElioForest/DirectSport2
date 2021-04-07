package com.example.directsport.ui.tennis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.directsport.R

class TennisFragment : Fragment() {

    private lateinit var tennisViewModel: TennisViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        tennisViewModel =
                ViewModelProvider(this).get(TennisViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_tennis, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        tennisViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}