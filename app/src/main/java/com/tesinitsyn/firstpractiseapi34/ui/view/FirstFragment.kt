package com.tesinitsyn.firstpractiseapi34.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tesinitsyn.firstpractiseapi34.R


class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FirstFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}