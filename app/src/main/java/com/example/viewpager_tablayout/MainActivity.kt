package com.example.viewpager_tablayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.viewpager_tablayout.adapter.Adapter_viewPager
import com.example.viewpager_tablayout.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = com.example.viewpager_tablayout.databinding.ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var list = mutableListOf<String>()
        list.add("https://kun.uz/news/2023/04/30/ozbekistonda-referendum-kuni-fuqarolar-va-amaldorlar-saylov-uchastkalarida")
        list.add("https://kun.uz/news/2023/04/30/ozbekistonda-referendum-kuni-fuqarolar-va-amaldorlar-saylov-uchastkalarida")
        list.add("https://kun.uz/news/2023/04/30/ozbekistonda-referendum-kuni-fuqarolar-va-amaldorlar-saylov-uchastkalarida")


        var list_it = mutableListOf<Int>()
        list_it.add(R.drawable.img)
        list_it.add(R.drawable.img_1)
        list_it.add(R.drawable.img_2)
        val adapter = Adapter_viewPager(list_it, this)

        binding.viewPager2.adapter = adapter

        TabLayoutMediator(
            binding.tableLayout,
            binding.viewPager2
        ) { tab, position ->
//            tab.text = "Tab" +
        }.attach()


    }
}