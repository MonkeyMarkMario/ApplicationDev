package com.example.mark.marksapp;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class stopwatch extends AppCompatActivity {
    private int seconds = 0;
    private boolean running;
    private boolean wasRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stopwatch);
        runTimer();
        if (savedInstanceState != null){
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean ("running");
            wasRunning = savedInstanceState.getBoolean ("wasRunning");
        }
    }

    @Override
    public void onSaveInstanceState (Bundle savedInstanceState) {
        savedInstanceState.putInt("seconds", seconds);
        savedInstanceState.putBoolean ("running", running);

        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onStop(){
        super.onStop();
        running = false;
    }

    @Override
    protected void onStart(){
        super.onStart();
        if (wasRunning){
            running = true;
        }
    }

    public void startClick (View view) {
        running = true;
    }

    public void stopClick (View view){
        running = false;
    }

    public void resetClick (View view){
        running = false;
        seconds = 0;
    }

    private void runTimer() {
        final TextView timeView = (TextView)findViewById(R.id.Timer);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/3600;
                int minutes = (seconds%3600)/60;
                int secs = seconds%60;
                String time = String.format(Locale.getDefault(),
                        "%d:%02d:%02d", hours, minutes, secs);
                timeView.setText(time);
                if (running) {
                    seconds++;
                }
                handler.postDelayed(this, 1000);
            }
        });
    }

}