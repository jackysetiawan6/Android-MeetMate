package com.example.uxlectureproj;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class FindFragment extends Fragment {
    ImageButton aibutton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_find, container, false);

        aibutton = view.findViewById(R.id.imageAi);
        aibutton.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), MatchingQuiz.class);
            startActivity(intent);
        });
        return view;
    }
}