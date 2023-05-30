package com.example.tugasanimasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {

    TextView mTextView;
    LottieAnimationView mLottie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        mTextView =findViewById(R.id.name);
        mLottie = findViewById(R.id.lottie);

        mTextView.animate().translationY(-1400).setDuration(2700).setStartDelay(0);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i);
            }
        }, 5000);
    }
}