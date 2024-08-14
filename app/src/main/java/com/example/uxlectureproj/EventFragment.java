package com.example.uxlectureproj;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.google.android.flexbox.FlexboxLayout;


public class EventFragment extends Fragment {
    FlexboxLayout layoutbuttoncreator;
    ImageButton buttoncreator;

    FlexboxLayout layoutbuttonjoining;
    ImageButton buttonjoining;

    FlexboxLayout layoutbuttoneventer;
    ImageButton buttonmyeventer;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_event, container, false);

        layoutbuttoncreator = view.findViewById(R.id.layoutbuttoncreate);
        layoutbuttoncreator.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), CreateEventActivity1.class);
            startActivity(intent);
        });
        buttoncreator = view.findViewById(R.id.buttoncreator);
        buttoncreator.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), CreateEventActivity1.class);
            startActivity(intent);
        });

        layoutbuttonjoining = view.findViewById(R.id.layoutbuttonjoining);
        layoutbuttonjoining.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), JoinEventActivity.class);
            startActivity(intent);
        });

        buttonjoining = view.findViewById(R.id.buttonjoining);
        buttonjoining.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), JoinEventActivity.class);
            startActivity(intent);
        });

        layoutbuttoneventer = view.findViewById(R.id.layoutbuttoneventer);
        layoutbuttoneventer.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), TabLayoutAct.class);
            startActivity(intent);
        });

        buttonmyeventer = view.findViewById(R.id.buttonmyeventer);
        buttonmyeventer.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), TabLayoutAct.class);
            startActivity(intent);
        });
        return view;

    }

}