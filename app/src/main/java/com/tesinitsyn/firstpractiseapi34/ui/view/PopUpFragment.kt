package com.tesinitsyn.firstpractiseapi34.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider
import com.tesinitsyn.firstpractiseapi34.R
import com.tesinitsyn.firstpractiseapi34.data.item.Item
import com.tesinitsyn.firstpractiseapi34.databinding.FragmentPopUpBinding
import com.tesinitsyn.firstpractiseapi34.databinding.FragmentSecondBinding
import com.tesinitsyn.firstpractiseapi34.ui.viewModel.ItemViewModel

class PopUpFragment : DialogFragment() {

    private lateinit var binding: FragmentPopUpBinding
    private lateinit var mItemVM: ItemViewModel;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPopUpBinding.inflate(inflater, container, false)
        mItemVM = ViewModelProvider(this)[ItemViewModel::class.java]
        binding.addButtonInPopUp.setOnClickListener {
            val tempName = binding.inputItem.text.toString()
            if(tempName.isEmpty()){
                Toast.makeText(requireContext(), "Write smth man", Toast.LENGTH_LONG).show()
            }else{
                val item = Item(0, tempName)
                mItemVM.addItem(item)
            }
            dismiss()
        }
        return binding.root
    }
}