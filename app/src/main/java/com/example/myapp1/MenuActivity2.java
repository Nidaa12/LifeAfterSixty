package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity2 extends AppCompatActivity {
    Button Button_adviceM;
    Button Button_exerciseM;
    Button Button_sleepM;
    Button Button_logoutM;
    Button Button_backM;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        Button_adviceM= findViewById(R.id.Button_adviceM);

        Button_adviceM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity2.this,AdviceActivity2.class);
                startActivity(intent);
            }
        });
        Button_exerciseM= findViewById(R.id.Button_exerciseM);

        Button_exerciseM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity2.this,ExercisesActivity2.class);
                startActivity(intent);
            }
        });
        Button_sleepM= findViewById(R.id.Button_sleepM);

        Button_sleepM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity2.this,ImproveSleepActivity2.class);
                startActivity(intent);
            }
        });
        Button_logoutM= findViewById(R.id.Button_logoutM);

        Button_logoutM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity2.this,LogoutActivity2.class);
                startActivity(intent);
            }
        });
        Button_backM= findViewById(R.id.Button_backM);

        Button_backM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity2.this,AboutUSActivity2.class);
                startActivity(intent);
            }
        });
    }
}