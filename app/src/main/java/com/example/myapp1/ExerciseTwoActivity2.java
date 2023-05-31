package com.example.myapp1;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExerciseTwoActivity2 extends AppCompatActivity {
    Button Button_advice_two;
    Button Button_advice_twoo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_two2);

        Button_advice_two = findViewById(R.id.Button_exercise_two);
        Button_advice_twoo =findViewById(R.id.Button_exercise_twoo);

        Button_advice_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ExerciseTwoActivity2.this,ExercisesActivity2.class);
                startActivity(intent);
            }
        });

        Button_advice_twoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ExerciseTwoActivity2.this,ExerciseThreeActivity2.class);
                startActivity(intent);
            }
        });
    }
}