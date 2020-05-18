package com.e.galaxy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import info.jakelee.spacewars.R;

public class Demo extends AppCompatActivity {
    private Button button3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDemo(view);
            }
        });
    }
    public void openDemo(View v){
        Intent intent = new Intent(Demo.this, Intro.class);
        startActivity(intent);
    }
}
