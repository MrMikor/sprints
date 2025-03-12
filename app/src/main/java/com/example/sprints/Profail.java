package com.example.sprints;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Profail extends AppCompatActivity {

    public ImageButton gohome,male,fav,glith,hamp;

    public FrameLayout qrco;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        gohome = findViewById(R.id.btn_go_home);
        gohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profail.this, supce_place.class);
                startActivity(intent);
                finish();
            }
        });

        qrco = findViewById(R.id.frameBtn);
        qrco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profail.this, supce_place.class);
                startActivity(intent);
                finish();
            }
        });

        male = findViewById(R.id.malls);
        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profail.this, mall.class);
                startActivity(intent);
                finish();
            }
        });

        fav = findViewById(R.id.favorite);
        fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profail.this, favorite.class);
                startActivity(intent);
                finish();
            }
        });

        glith = findViewById(R.id.homesw);
        glith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profail.this, trashHole.class);
                startActivity(intent);
                finish();
            }
        });

        hamp = findViewById(R.id.hamburg);
        hamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profail.this, leftMenu.class);
                startActivity(intent);
                finish();
            }
        });

    }
}