package com.northpolegames.reenisapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button workoutViewButton;
    private Button profileViewButton;  // TEMPORARY TEST BUTTON
    // private Button statisticsViewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        workoutViewButton = findViewById(R.id.workoutViewButton);
        workoutViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadWorkoutActivity = new Intent(MainActivity.this, WorkoutActivity.class);
                startActivity(intentLoadWorkoutActivity);
            }

        });

        profileViewButton = findViewById(R.id.profileViewButton);
        profileViewButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentLoadProfileActivity = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intentLoadProfileActivity);
            }
        });

    /*    statisticsViewButton = findViewById(R.id.statisticsViewButton);
        statisticsViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadStatisticsActivity = new Intent(MainActivity.this, StatisticsActivity.class);
                startActivity(intentLoadStatisticsActivity);
            }
        }); */
    }
}