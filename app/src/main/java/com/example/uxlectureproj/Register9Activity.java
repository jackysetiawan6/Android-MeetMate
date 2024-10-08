package com.example.uxlectureproj;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Register9Activity extends AppCompatActivity {
    private Button registertonext;
    private Button registertoback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register9);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.register9), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        registertonext=findViewById(R.id.buttonmatched);
        registertonext.setOnClickListener(v -> {
            Intent intent=new Intent(Register9Activity.this, Register10Activity.class);
            startActivity(intent);
        });

        registertoback=findViewById(R.id.buttonback);
        registertoback.setOnClickListener(v -> {
            Intent intent=new Intent(Register9Activity.this, Register8Activity.class);
            startActivity(intent);
        });

    }
}