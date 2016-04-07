package com.example.evgeniy.workout;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailFragment extends Fragment {

    private long workoutID;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if(view != null ){
            TextView title = (TextView)view.findViewById(R.id.textTitle);
            TextView description = (TextView)view.findViewById(R.id.textDescription);
            Workout workout = Workout.workouts[(int) workoutID];

            title.setText(workout.getName());
            description.setText(workout.getDescription());

        }
    }

    public void setWorkoutID(long id){
        this.workoutID = id;
    }

}
