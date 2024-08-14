package com.example.uxlectureproj;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

public class FriendsFragment extends Fragment {

    TabLayout tabLayout;
    ViewPager2 viewPager;
    VPadapterfriend adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_friends, container, false);

        // Initialize the TabLayout and ViewPager2
        tabLayout = view.findViewById(R.id.top_layout_friends);
        viewPager = view.findViewById(R.id.view_pager_friends);

        // Set up the ViewPager2 with the adapter
        adapter = new VPadapterfriend(getChildFragmentManager(), getLifecycle());
        viewPager.setAdapter(adapter);

        // Set up the TabLayout with ViewPager2
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.getTabAt(position).select();
            }
        });

        return view;
    }
}
