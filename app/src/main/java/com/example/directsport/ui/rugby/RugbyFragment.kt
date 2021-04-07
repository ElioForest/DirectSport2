package com.example.directsport.ui.rugby

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.directsport.R

class RugbyFragment : Fragment() {

    private lateinit var rugbyViewModel: RugbyViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        rugbyViewModel =
                ViewModelProvider(this).get(RugbyViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_rugby, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        rugbyViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}