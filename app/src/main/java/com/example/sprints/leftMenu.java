package com.example.sprints;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class leftMenu extends AppCompatActivity {

    public FrameLayout first,second,thert,fort,fift,yvedoml,exittex;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_left_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        first = findViewById(R.id.prof);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(leftMenu.this, Profail.class);
                startActivity(intent);
                finish();
            }
        });


        second = findViewById(R.id.trash);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(leftMenu.this, trashHole.class);
                startActivity(intent);
                finish();
            }
        });


        thert = findViewById(R.id.heatr);
        thert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(leftMenu.this, favorite.class);
                startActivity(intent);
                finish();
            }
        });


        fort = findViewById(R.id.deliv);
        fort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(leftMenu.this, Profail.class);
                startActivity(intent);
                finish();
            }
        });

       fift = findViewById(R.id.sett);
       fift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(leftMenu.this, mall.class);
                startActivity(intent);
                finish();
            }
        });


        yvedoml = findViewById(R.id.mess);
        yvedoml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(leftMenu.this, filters.class);
                startActivity(intent);
                finish();
            }
        });

        exittex = findViewById(R.id.exit);
        exittex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(leftMenu.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });




    }
}