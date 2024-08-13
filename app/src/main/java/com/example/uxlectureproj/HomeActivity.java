package com.example.uxlectureproj;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import com.example.uxlectureproj.databinding.ActivityHomeBinding;
import com.example.uxlectureproj.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;

public class HomeActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager;
    VPadapter adapter;

    ActivityHomeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        replaceFragment(new ExploreFragment());


        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.BottomNavigationView.setOnItemSelectedListener(item -> {

            int itemId = item.getItemId();

            if (itemId == R.id.explore) {
                replaceFragment(new ExploreFragment());
            } else if (itemId == R.id.find) {
                replaceFragment(new FindFragment());
            } else if (itemId == R.id.friends) {
                replaceFragment(new FriendsFragment());
            } else if (itemId == R.id.events) {
                replaceFragment(new EventFragment());
            } else if (itemId == R.id.me) {
                replaceFragment(new MeFragment());
            }

            return true;
        });
    }
    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();
    }

}