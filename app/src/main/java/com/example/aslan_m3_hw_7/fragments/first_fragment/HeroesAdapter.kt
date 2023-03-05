package com.example.aslan_m3_hw_7.fragments.first_fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.aslan_m3_hw_7.databinding.ItemHeroesBinding
import com.example.aslan_m3_hw_7.loadImage
import com.example.aslan_m3_hw_7.module.Heroes
import kotlin.reflect.KFunction0

class HeroesAdapter(
    val heroesList: ArrayList<Heroes>,
    val onClick: (heroes: Heroes)->Unit
): RecyclerView.Adapter<HeroesAdapter.HeroesViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroesViewHolder {
        return HeroesViewHolder(ItemHeroesBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ))
    }

    override fun getItemCount(): Int = heroesList.size


    override fun onBindViewHolder(holder: HeroesViewHolder, position: Int) {
        holder.bind()
    }

    inner class HeroesViewHolder(private val binding: ItemHeroesBinding):
        RecyclerView.ViewHolder(binding.root){

        fun bind() {
            val heroes = heroesList[adapterPosition]
            binding.apply {
                tvStatus.text = heroes.heroesStatus
                tvName.text = heroes.heroesName
                imgFirst.loadImage(heroes.heroesImage)
            }
            itemView.setOnClickListener {
                onClick.invoke(heroes)
            }
        }

    }
}