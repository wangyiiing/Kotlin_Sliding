package com.example.switching

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)

        // 图片资源列表
        val images = listOf(R.drawable.image1, R.drawable.image2, R.drawable.image3)
        viewPager.adapter = ImagePagerAdapter(images)

        // 关联 TabLayout 和 ViewPager2
        TabLayoutMediator(tabLayout, viewPager) { _, _ -> }.attach()
    }
}