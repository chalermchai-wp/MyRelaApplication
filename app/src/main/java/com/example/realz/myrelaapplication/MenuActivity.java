package com.example.realz.myrelaapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import static com.example.realz.myrelaapplication.R.id.imgBtnHealth;
import static com.example.realz.myrelaapplication.R.id.imgBtnLove;
import static com.example.realz.myrelaapplication.R.id.imgBtnProfile;

public class MenuActivity extends AppCompatActivity {


    private ImageButton btnProfile;
    private ImageButton btnLove;
    private ImageButton btnHealth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnProfile = (ImageButton) findViewById(imgBtnProfile);
        btnProfile.setOnClickListener(Profile);

        btnLove = (ImageButton) findViewById(imgBtnLove);
        btnLove.setOnClickListener(Love);

        btnHealth = (ImageButton) findViewById(imgBtnHealth);
        btnHealth.setOnClickListener(Health);

    }

    private View.OnClickListener Profile = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener Love = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),LoveActivity.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener Health = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),HealthActivity.class);
            startActivity(intent);
        }
    };




}

