//    package com.example.uxlectureproj;
//
//import android.os.Bundle;
//import android.widget.ImageButton;
//
//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
//import androidx.viewpager2.widget.ViewPager2;
//
//import com.google.android.material.tabs.TabLayout;
//
//    public class tab_layout_friends extends AppCompatActivity {
//
//
//        TabLayout tabLayout;
//        ViewPager2 viewPager;
//        VPadapterfriend adapter;
//        ImageButton back;
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.fragment_friends);
//
//            tabLayout = findViewById(R.id.top_layout_friends);
//            viewPager = findViewById(R.id.view_pager_friends);
//            adapter = new VPadapterfriend(this);
//            viewPager.setAdapter(adapter);
//
//            tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//                @Override
//                public void onTabSelected(TabLayout.Tab tab) {
//                    viewPager.setCurrentItem(tab.getPosition());
//                }
//
//                @Override
//                public void onTabUnselected(TabLayout.Tab tab) {
//
//                }
//
//                @Override
//                public void onTabReselected(TabLayout.Tab tab) {
//
//                }
//            });
//
//            viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
//                @Override
//                public void onPageSelected(int position) {
//                    super.onPageSelected(position);
//                    tabLayout.getTabAt(position).select();
//                }
//            });
//
//            back = findViewById(R.id.imgbuttonbackevdet);
//            back.setOnClickListener(v -> {
//                finish();
//            });
//    }
//}