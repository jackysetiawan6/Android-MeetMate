package com.example.uxlectureproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginPage extends AppCompatActivity {

    Button loginbuttonreal;
    TextView buttonreg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.loginmain), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        loginbuttonreal=findViewById(R.id.buttonloginreal);
        loginbuttonreal.setOnClickListener(v -> {
            Intent intent=new Intent(LoginPage.this, HomeActivity.class);
            startActivity(intent);
        });

        buttonreg=findViewById(R.id.registerbuttonreal);
        buttonreg.setOnClickListener(v -> {
            Intent intent=new Intent(LoginPage.this, Register1Activity.class);
            startActivity(intent);
        });
    }
}