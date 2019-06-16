package com.example.ikshu__cse_h;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class m extends AppCompatActivity {
    private Button button;
    ImageButton myImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m);


        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(m.this, l.class);
                startActivity(intentLoadNewActivity);
            }
        });

        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(m.this, PC.class);
                startActivity(intentLoadNewActivity);
            }
        });
        /*BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB*/

        myImageButton = (ImageButton) findViewById(R.id.imageButton4);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(m.this, M1.class);
                startActivity(intentLoadNewActivity);
            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton5);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(m.this, M2.class);
                startActivity(intentLoadNewActivity);
            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton6);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(m.this, M3.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
