package com.example.uxlectureproj;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class VPadapter extends FragmentStateAdapter {


    public VPadapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
      switch (position){
          case 0:
              return new GeneralFragment();
          case 1:
              return new RequestFragment();
          case 2:
              return new BlockedFragment();
          default:
              return new ExploreFragment();
      }
    }
    @Override
    public int getItemCount() {
        return 3;
    }
}
