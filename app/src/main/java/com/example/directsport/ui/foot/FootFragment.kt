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

class FootFragment : Fragment() {

    private lateinit var footViewModel: FootViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        footViewModel =
                ViewModelProvider(this).get(FootViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_foot, container, false)

        val textView: TextView = root.findViewById(R.id.text_foot)
        footViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}