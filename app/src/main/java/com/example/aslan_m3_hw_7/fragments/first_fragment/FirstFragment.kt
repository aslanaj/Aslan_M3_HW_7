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
            add(Heroes("Alive","Naruto Uzumaki","https://avatanplus.com/files/resources/original/58dd2f10de6af15b1fffda0f.png"))
            add(Heroes("Alive","Sasuke Uchiha","https://w7.pngwing.com/pngs/17/344/png-transparent-sasuke-uchiha-itachi-uchiha-naruto-uchiha-clan-naruto-black-hair-manga-sasuke-uchiha.png"))
            add(Heroes("Dead","Minato Namikadze","https://www.pngmart.com/files/22/Minato-Namikaze-PNG-Photos.png"))
            add(Heroes("Dead","Madara Uchiha","https://i.pinimg.com/originals/75/d8/d6/75d8d67e67c813ef2a38e28e3bdcf244.jpg"))
            add(Heroes("Dead","Pain Akatsuki","https://i1.sndcdn.com/artworks-000493810884-ythxh2-t500x500.jpg"))
            add(Heroes("Dead","Itachi Uchiha","https://wiki.jcdn.ru/w/images/thumb/6/60/ItachiManga.jpg/250px-ItachiManga.jpg"))
            add(Heroes("Alive","Kakashi Hatake","https://amiel.club/uploads/posts/2022-03/1647721152_1-amiel-club-p-kartinki-kakashi-iz-naruto-1.jpg"))
        }
    }

    private fun onClick(position: Int) {
        findNavController().navigate(R.id.secondFragment,
            bundleOf("Key" to heroesList[position]))

    }




}