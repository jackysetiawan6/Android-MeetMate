package com.example.uxlectureproj;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class MeFragment extends Fragment {

    ImageButton editprofile;
    ImageButton settings;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_me, container, false);

        editprofile = view.findViewById(R.id.imageeditprofile);
        editprofile.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ProfileActivity1.class);
            startActivity(intent);
        });
        settings = view.findViewById(R.id.imagebuttonsettings);
        settings.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Settings.class);
            startActivity(intent);
        });

        return view;
    }
}
