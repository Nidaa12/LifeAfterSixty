package com.example.myapp1;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExercisesActivity2 extends AppCompatActivity {
    Button Button_exercise_one;
    Button Button_exercise_onee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises2);

        Button_exercise_one= findViewById(R.id.Button_exercise_one);
        Button_exercise_onee =findViewById(R.id.Button_exercise_onee);

        Button_exercise_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ExercisesActivity2.this,MenuActivity2.class);
                startActivity(intent);
            }
        });

        Button_exercise_onee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ExercisesActivity2.this,ExerciseTwoActivity2.class);
                startActivity(intent);
            }
        });
    }
}