package com.example.sprints;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    public Button btnEnt;
    public ImageButton passw;
    public EditText text;
    public  int w;
    public TextView create,uplad;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnEnt = findViewById(R.id.btnInter);
        btnEnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, second_sprint.class);
           setContentView(R.layout.activity_second_sprint);
            }
        });

        create = findViewById(R.id.createUser);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, createUserSprint.class);
                setContentView(R.layout.activity_create_user_sprint);
            }
        });

        //создаем вкладки на будущие спринты






        create = findViewById(R.id.createUser);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, createUserSprint.class);
                setContentView(R.layout.activity_create_user_sprint);
            }
        });

        uplad = findViewById(R.id.uploadPass);
        uplad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PasswordRestart.class);
                setContentView(R.layout.activity_password_restart);
            }
        });
    }
}