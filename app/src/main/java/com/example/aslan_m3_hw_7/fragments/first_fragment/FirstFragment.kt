package com.example.aslan_m3_hw_7.fragments.first_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.aslan_m3_hw_7.R
import com.example.aslan_m3_hw_7.databinding.FragmentFirstBinding
import com.example.aslan_m3_hw_7.module.Heroes


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private var heroesList = arrayListOf<Heroes>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = HeroesAdapter(heroesList, this::onClick)
        binding.rvHeroes.adapter = adapter
        loadData()
    }

    private fun loadData() {
        heroesList.apply {
            add(Heroes("Alive","Rick Sanchez","https://static.tvtropes.org/pmwiki/pub/images/abcb6534_7913_4eb1_a7a5_62b081ebc628.png"))
            add(Heroes("Alive","Morty","https://m.media-amazon.com/images/S/aplus-media-library-service-media/365e5edb-7b7f-415a-81c7-a848936e9e38.__CR0,0,300,300_PT0_SX300_V1___.jpg"))
            add(Heroes("Alive","Rick Sanchez","https://static.tvtropes.org/pmwiki/pub/images/abcb6534_7913_4eb1_a7a5_62b081ebc628.png"))
            add(Heroes("Alive","Rick Sanchez","https://static.tvtropes.org/pmwiki/pub/images/abcb6534_7913_4eb1_a7a5_62b081ebc628.png"))
            add(Heroes("Alive","Rick Sanchez","https://static.tvtropes.org/pmwiki/pub/images/abcb6534_7913_4eb1_a7a5_62b081ebc628.png"))
        }
    }

    private fun onClick(position: Int) {
        findNavController().navigate(R.id.secondFragment,
            bundleOf("Key" to heroesList[position]))

    }




}