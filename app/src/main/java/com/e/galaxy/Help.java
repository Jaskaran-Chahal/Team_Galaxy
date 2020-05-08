package com.e.galaxy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import info.jakelee.spacewars.R;

public class Help extends AppCompatActivity {
    private Button button4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openHelp(view);
            }
        });
    }
    public void openHelp(View v){
        Intent intent = new Intent(Help.this, Intro.class);
        startActivity(intent);
    }
}
