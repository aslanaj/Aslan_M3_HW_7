package com.example.aslan_m3_hw_7.fragments.second_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aslan_m3_hw_7.R
import com.example.aslan_m3_hw_7.databinding.FragmentSecondBinding
import com.example.aslan_m3_hw_7.loadImage
import com.example.aslan_m3_hw_7.module.Heroes

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val result = arguments?.getSerializable("Key") as Heroes
        with(binding) {
            tvName.text = result.heroesName.toString()
            tvStatus.text = result.heroesStatus.toString()
            imgFirst.loadImage(result.heroesImage)
        }

    }

}