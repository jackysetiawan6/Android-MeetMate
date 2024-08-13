package com.example.uxlectureproj;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class EventFragment extends Fragment {
    ImageButton buttoncreator;
    ImageButton buttonjoining;
    ImageButton buttonmyeventer;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_event, container, false);

        buttoncreator = view.findViewById(R.id.buttoncreator);
        buttoncreator.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), CreateEventActivity1.class);
            startActivity(intent);
        });
        buttonjoining = view.findViewById(R.id.buttonjoining);
        buttonjoining.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), JoinEventActivity.class);
            startActivity(intent);
        });

        buttonmyeventer = view.findViewById(R.id.buttonmyeventer);
        buttonmyeventer.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), MyEventActivity.class);
            startActivity(intent);
        });
        return view;

    }

}