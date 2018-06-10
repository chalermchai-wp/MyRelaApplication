package com.example.realz.myrelaapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class LoveActivity extends AppCompatActivity {

    private TextView TvResult;
    private LinearLayout Line2;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);


        back = (Button) findViewById(R.id.back);
        TvResult = (TextView) findViewById(R.id.result);
        Line2 = (LinearLayout) findViewById(R.id.Line2);

        Intent intent = getIntent();


        Line2.setOnClickListener(OnClickLoveListener);
        back.setOnClickListener(Back);

    }

    private View.OnClickListener OnClickLoveListener = new View.OnClickListener() {


        @Override
        public void onClick(View view) {

            Random myRandom = new Random();

            switch(myRandom.nextInt() %3) {
                case 0:
                    TvResult.setText("D");
                    break;
                case 1:
                    TvResult.setText("C");
                    break;
                case 2:
                    TvResult.setText("B");
                    break;
                case 3:
                    TvResult.setText("A");
                    break;
                default:
                    break;
            }

        }
    };

   private View.OnClickListener Back = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            TvResult.setText("เจอป๋าเพชรจะบอกว่า .....");
        }
    };


}
