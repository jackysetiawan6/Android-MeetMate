package com.example.uxlectureproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.flexbox.FlexboxLayout;

import java.util.Arrays;
import java.util.List;

public class Register7Activity extends AppCompatActivity {
    private Button registertonext;
    private Button registertoback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register7);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.register7), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        registertonext=findViewById(R.id.buttonnext);
        registertonext.setOnClickListener(v -> {
            Intent intent=new Intent(Register7Activity.this, Register8Activity.class);
            startActivity(intent);
        });

        registertoback=findViewById(R.id.buttonback);
        registertoback.setOnClickListener(v -> {
            Intent intent=new Intent(Register7Activity.this, Register6Activity.class);
            startActivity(intent);
        });
    }
}
