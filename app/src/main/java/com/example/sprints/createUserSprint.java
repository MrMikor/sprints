package com.example.sprints;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class createUserSprint extends AppCompatActivity {

    public TextView bacc,confidench;
    public Button rest;
    public EditText names,email,passwords;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_create_user_sprint);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        bacc = findViewById(R.id.back);
        bacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(createUserSprint.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
        confidench = findViewById(R.id.politica_conf);
        confidench.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(createUserSprint.this, politika.class);
                startActivity(intent);
                finish();

            }
        });
        rest = findViewById(R.id.btnInter);
        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                names = findViewById(R.id.nameuser);
                email = findViewById(R.id.passwordStroke);
                passwords = findViewById(R.id.emaistwo);
                String text = names.getText().toString();
                String sew = email.getText().toString();
                String qwex = passwords.getText().toString();

                if (!text.isEmpty() && !sew.isEmpty() && !qwex.isEmpty())
                {  Intent intent = new Intent(createUserSprint.this, MainActivity.class);
                    startActivity(intent);
                    finish();}
            }
        });



    }
}