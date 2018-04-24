package com.example.mark.marksapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class StopWatch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //if savedInstanceState !=null {

        //}
    }
    public void startClick (View view) {

    }

    public void stopClick (View view){

    }

    public void resetClick (View view){

    }

    /*private void updateTimer (float time){
            secs = (long) (time / 1000);
            mins = (long)((time/1000)/60);
            hrs = (long)(((time/1000)/60)/60);

            secs = secs %60;
            seconds = String.valueOf(secs);

    }*/

    @Override
    public void onSaveInstanceState (Bundle savedInstanceState) {


        super.onSaveInstanceState(savedInstanceState);
    }
}