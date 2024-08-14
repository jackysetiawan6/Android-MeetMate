package com.example.uxlectureproj;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.flexbox.FlexboxLayout;

public class CreateEventActivity1 extends AppCompatActivity {

    ImageButton backbutton;
    FlexboxLayout createevent;
    Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_create_event1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        backbutton=findViewById(R.id.imagebuttonback);
        backbutton.setOnClickListener(view -> {
            finish();
        });

        createevent=findViewById(R.id.addeventt);
        createevent.setOnClickListener(view -> {
            Intent intent=new Intent(CreateEventActivity1.this, TabLayoutAct.class);
            startActivity(intent);
        });

        save=findViewById(R.id.buttonsaveev);
        save.setOnClickListener(view -> {
            Intent intent=new Intent(CreateEventActivity1.this, MyEventActivity.class);
            startActivity(intent);
        });


    }
}