package com.example.uxlectureproj;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EventPageActivity extends AppCompatActivity {

    ImageButton buttoncreate;
    ImageButton buttonjoin;
    ImageButton buttonmyevent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_event_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        buttonmyevent=findViewById(R.id.buttonmyevent);
        buttonmyevent.setOnClickListener(v -> {
            Intent intent=new Intent(EventPageActivity.this, MyEventActivity.class);
            startActivity(intent);
        });

        buttonjoin=findViewById(R.id.buttonjoin);
        buttonjoin.setOnClickListener(v -> {
            Intent intent=new Intent(EventPageActivity.this, JoinEventActivity.class);
            startActivity(intent);
        });

        buttoncreate=findViewById(R.id.buttoncreate);
        buttoncreate.setOnClickListener(v -> {
            Intent intent=new Intent(EventPageActivity.this, CreateEventActivity1.class);
            startActivity(intent);
        });


    }
}