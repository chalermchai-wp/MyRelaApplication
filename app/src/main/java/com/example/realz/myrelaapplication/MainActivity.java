package com.example.realz.myrelaapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private  Button btnLogin;
    private Button btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(onClickSubminListener);

        btnMenu = (Button)findViewById(R.id.btnMenu);

        btnMenu.setOnClickListener(Onclick);
    }
    private View.OnClickListener onClickSubminListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),DetailActivity.class);
            startActivity(intent);
        }

    };

    private View.OnClickListener Onclick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
            startActivity(intent);
        }
    };







}