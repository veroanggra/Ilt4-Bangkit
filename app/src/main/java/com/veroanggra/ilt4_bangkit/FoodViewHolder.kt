package com.veroanggra.ilt4_bangkit

import androidx.recyclerview.widget.RecyclerView
import com.veroanggra.ilt4_bangkit.databinding.ItemFoodBinding


class FoodViewHolder(private val item: ItemFoodBinding) : RecyclerView.ViewHolder(item.root) {
    fun bind(food: Foods) {
        item.tvTitle.text = food.title
        item.tvDescription.text = food.description
        item.tvCalories.text = food.calories
        item.tvRate.text = food.rate
        item.ivFood.setImageResource(food.imgId)
    }
}