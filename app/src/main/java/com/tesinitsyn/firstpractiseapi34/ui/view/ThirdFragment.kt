package com.tesinitsyn.firstpractiseapi34.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tesinitsyn.firstpractiseapi34.R

class ThirdFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ThirdFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}