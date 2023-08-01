package com.example.tablayoutapp;

import android.gesture.GestureLibraries;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class pagerAdapter extends FragmentStateAdapter {
    private String[] titles = {"Chat", "Status", "Call"};

    public pagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new ChatFragment();
        } else if (position == 1) {
            return new StatusFragment();
        }else {
            return new CallFragment();
        }
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
