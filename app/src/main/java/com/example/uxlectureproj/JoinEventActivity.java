package com.example.uxlectureproj;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class JoinEventActivity extends AppCompatActivity {

    Button joinevent;
    Button joinevent2;
    Button joinevent3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_join_event);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        joinevent=findViewById(R.id.buttonjoinevent);
        joinevent.setOnClickListener(v -> {
            Intent intent=new Intent(JoinEventActivity.this, EventDetailActivity.class);
            startActivity(intent);
        });
        joinevent2=findViewById(R.id.buttonjoineventt);
        joinevent2.setOnClickListener(v -> {
            Intent intent=new Intent(JoinEventActivity.this, EventDetailActivity.class);
            startActivity(intent);
        });
        joinevent3=findViewById(R.id.buttonjoineventtt);
        joinevent3.setOnClickListener(v -> {
            Intent intent=new Intent(JoinEventActivity.this, EventDetailActivity.class);
            startActivity(intent);
        });
    }
}