package com.example.sprints;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class mall extends AppCompatActivity {

    public ImageButton gohome,male,fav,huntt,hmss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mall);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        gohome = findViewById(R.id.btn_go_home);
        gohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mall.this, supce_place.class);
                startActivity(intent);
                finish();
            }
        });


        male = findViewById(R.id.chillmen);
        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mall.this, Profail.class);
                startActivity(intent);
                finish();
            }
        });

        fav = findViewById(R.id.favorite);
        fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mall.this, favorite.class);
                startActivity(intent);
                finish();
            }
        });

        huntt = findViewById(R.id.hamburg);
        huntt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mall.this, leftMenu.class);
                startActivity(intent);
                finish();
            }
        });

        hmss = findViewById(R.id.homesw);
        hmss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mall.this, trashHole.class);
                startActivity(intent);
                finish();
            }
        });


    }
}