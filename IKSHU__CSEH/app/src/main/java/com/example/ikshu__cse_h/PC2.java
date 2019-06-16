package com.example.ikshu__cse_h;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PC2 extends AppCompatActivity {
    ImageButton myImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pc2);
        myImageButton = (ImageButton) findViewById(R.id.imageButton7);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(PC2.this, PC2a.class);
                startActivity(intentLoadNewActivity);
            }
        });


        myImageButton = (ImageButton) findViewById(R.id.imageButton13);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(PC2.this, PC2de.class);
                startActivity(intentLoadNewActivity);
            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton12);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(PC2.this, PC.class);
                startActivity(intentLoadNewActivity);
            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton11);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(PC2.this, Cart.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
