package com.example.ikshu__cse_h;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class M2e extends AppCompatActivity {
    ImageButton myImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m2e);

        myImageButton = (ImageButton) findViewById(R.id.imageButton8);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(M2e.this, M2f.class);
                startActivity(intentLoadNewActivity);
            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton9);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(M2e.this, M2d.class);
                startActivity(intentLoadNewActivity);
            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton10);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(M2e.this, M2.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
