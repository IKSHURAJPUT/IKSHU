package com.example.ikshu__cse_h;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {
    ImageButton myImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        myImageButton=(ImageButton) findViewById(R.id.imageButton3);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Main2Activity.this, m.class);
                startActivity(intentLoadNewActivity);
            }
        });

        myImageButton=(ImageButton) findViewById(R.id.imageButton2);

        myImageButton.setOnClickListener(new View.OnClickListener() {
                                             @SuppressLint("WrongViewCast")
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intentLoadNewActivity = new Intent(Main2Activity.this, l.class);
                                                 startActivity(intentLoadNewActivity);
                                             }
                                         });

        myImageButton=(ImageButton) findViewById(R.id.imageButton);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(Main2Activity.this, PC.class);
                startActivity(intentLoadNewActivity);




            }
        });
    }
}
