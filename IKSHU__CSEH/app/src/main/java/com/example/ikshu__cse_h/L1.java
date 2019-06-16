package com.example.ikshu__cse_h;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class L1 extends AppCompatActivity {
    ImageButton myImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l1);

        myImageButton = (ImageButton) findViewById(R.id.imageButton7);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(L1.this, L1a.class);
                startActivity(intentLoadNewActivity);
            }
        });


        myImageButton = (ImageButton) findViewById(R.id.imageButton13);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(L1.this, Lde.class);
                startActivity(intentLoadNewActivity);
            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton12);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(L1.this, l.class);
                startActivity(intentLoadNewActivity);
            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton11);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(L1.this, Cart.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
