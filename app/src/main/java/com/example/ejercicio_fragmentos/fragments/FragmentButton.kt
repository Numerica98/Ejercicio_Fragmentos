package com.example.ejercicio_fragmentos.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ejercicio_fragmentos.R
import kotlinx.android.synthetic.main.button_fragment.view.*

class FragmentButton: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view= inflater.inflate(R.layout.button_fragment, container, false)
        view.bt_previous.setOnClickListener {

        }
        view.bt_next.setOnClickListener {

        }
        return view
    }
}