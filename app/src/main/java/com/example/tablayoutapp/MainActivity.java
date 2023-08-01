package com.example.tablayoutapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;


import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
TabLayout tabs;
ViewPager2 viewPager;
pagerAdapter adapter;
    private String[] titles = {"Chat", "Status", "Call"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabs = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.viewPager);
        adapter = new pagerAdapter(this);
        viewPager.setAdapter(adapter);
        new TabLayoutMediator(tabs, viewPager, (tab, position) -> tab.setText(titles[position])).attach();
    }
}