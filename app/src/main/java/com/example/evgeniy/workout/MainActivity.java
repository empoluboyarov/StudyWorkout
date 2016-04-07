package com.example.evgeniy.workout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WorkoutDetailFragment workoutDetailFragment = (WorkoutDetailFragment)getFragmentManager().findFragmentById(R.id.detail_frag);
        workoutDetailFragment.setWorkoutID(1);
    }
}
