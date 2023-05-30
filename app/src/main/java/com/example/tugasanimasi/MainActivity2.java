package com.example.tugasanimasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img1 = findViewById(R.id.img1);


    }
}