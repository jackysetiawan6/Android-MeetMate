package com.example.uxlectureproj;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class VPadapterfriend extends FragmentStateAdapter{

    public VPadapterfriend(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
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
                return new GeneralFragment();
        }
    }
    @Override
    public int getItemCount() {
        return 3;
    }
}
