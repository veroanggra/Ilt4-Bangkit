package com.veroanggra.ilt4_bangkit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.veroanggra.ilt4_bangkit.FoodViewHolder
import com.veroanggra.ilt4_bangkit.Foods
import com.veroanggra.ilt4_bangkit.databinding.ItemFoodBinding

class FoodAdapter : RecyclerView.Adapter<FoodViewHolder>() {

    private var foodList: MutableList<Foods> = mutableListOf()
    private lateinit var itemBinding: ItemFoodBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        itemBinding = ItemFoodBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return FoodViewHolder(itemBinding)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private fun getItem(position: Int): Foods {
        return foodList[position]
    }

    fun addAll(genreList: List<Foods>) {
        this.foodList.clear()
        this.foodList.addAll(genreList)
        notifyDataSetChanged()
    }
}