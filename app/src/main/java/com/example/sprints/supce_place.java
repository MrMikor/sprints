package com.example.sprints;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class supce_place extends AppCompatActivity {

public ImageButton sett,huntt,hert,homebtn,firstkr,secondkr;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_supce_place);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        sett = findViewById(R.id.settingi);
        sett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(supce_place.this, filters.class);
                startActivity(intent);
                finish();
            }
        });

        huntt = findViewById(R.id.hamburg);
        huntt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(supce_place.this, filters.class);
                startActivity(intent);
                finish();
            }
        });

        hert = findViewById(R.id.favorite);
        hert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(supce_place.this, favorite.class);
                startActivity(intent);
                finish();
            }
        });

        homebtn = findViewById(R.id.homesw);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(supce_place.this, trashHole.class);
                startActivity(intent);
                finish();
            }
        });


        secondkr = findViewById(R.id.second_cros);
        secondkr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(supce_place.this, galary_kros.class);
                startActivity(intent);
                finish();
            }
        });


        firstkr = findViewById(R.id.first_kros);
        firstkr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(supce_place.this, galary_kros.class);
                startActivity(intent);
                finish();
            }
        });

    }
}