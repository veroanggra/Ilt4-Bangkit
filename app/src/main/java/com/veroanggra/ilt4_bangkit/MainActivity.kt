package com.veroanggra.ilt4_bangkit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.veroanggra.ilt4_bangkit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var foodAdapter: FoodAdapter = FoodAdapter()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvMain.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        binding.rvMain.adapter = foodAdapter
        foodAdapter.addAll(foodDummyData)
    }
}