package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final  ImageView  img_ball_img = findViewById(R.id.img_ball_img);
        Button btn_ask = findViewById(R.id.btn_ask);
        final int[] ballsArray =  new int[]{R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};

        btn_ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomImgBall = new Random();
                int selectedImg =  randomImgBall.nextInt(4);
                img_ball_img.setImageResource(ballsArray[selectedImg]);

            }
        });
    }
}
