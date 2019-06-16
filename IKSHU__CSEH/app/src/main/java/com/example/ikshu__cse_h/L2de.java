package com.example.ikshu__cse_h;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class L2de extends AppCompatActivity {
    ImageButton myImageButton;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lde);

        myImageButton = (ImageButton) findViewById(R.id.imageButton14);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(L2de.this, L2.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}