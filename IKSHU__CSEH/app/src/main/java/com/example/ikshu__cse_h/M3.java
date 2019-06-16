package com.example.ikshu__cse_h;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class M3 extends AppCompatActivity {
    ImageButton myImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m3);

        myImageButton = (ImageButton) findViewById(R.id.imageButton7);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(M3.this, M3a.class);
                startActivity(intentLoadNewActivity);
            }
        });


        myImageButton = (ImageButton) findViewById(R.id.imageButton13);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(M3.this, M3de.class);
                startActivity(intentLoadNewActivity);
            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton12);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(M3.this, m.class);
                startActivity(intentLoadNewActivity);
            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton11);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(M3.this, Cart.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
