package com.example.myapp1;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExerciseThreeActivity2 extends AppCompatActivity {
    Button Button_exercise_three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_three2);

        Button_exercise_three = findViewById(R.id.Button_exercise_three);
        Button_exercise_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ExerciseThreeActivity2.this,ExerciseTwoActivity2.class);
                startActivity(intent);
            }
        });

    }
}