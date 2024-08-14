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
              return new OngoingFragment();
          case 1:
              return new HistoryFragment();
          case 2:
              return new UpcomingFragment();
          default:
              return new OngoingFragment();
      }
    }
    @Override
    public int getItemCount() {
        return 3;
    }
}
