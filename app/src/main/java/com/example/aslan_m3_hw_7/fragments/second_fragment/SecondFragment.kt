package com.example.aslan_m3_hw_7.fragments.second_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aslan_m3_hw_7.R
import com.example.aslan_m3_hw_7.databinding.FragmentSecondBinding
import com.example.aslan_m3_hw_7.fragments.first_fragment.FirstFragment
import com.example.aslan_m3_hw_7.loadImage
import com.example.aslan_m3_hw_7.module.Heroes

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private lateinit var navArgs: SecondFragmentArgs
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

arguments?.let {
navArgs = SecondFragmentArgs.fromBundle(it)
}


        binding.apply {
            tvName.text = navArgs.Heroes.heroesName
            tvStatus.text = navArgs.Heroes.heroesStatus
            imgFirst.loadImage(navArgs.Heroes.heroesImage)
        }

    }

}