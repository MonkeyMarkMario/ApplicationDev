package com.example.mark.marksapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Random rand = new Random();
    //int Die = rand.nextInt(6);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view) {

        Random rand = new Random();
        int Die = rand.nextInt(6) + 1;

        TextView counter = (TextView) findViewById(R.id.Number);
        counter.setText(String.valueOf(Die));

        TextView tv = (TextView) findViewById(R.id.Roll);
        tv.setText("Roll Again");

    }
}