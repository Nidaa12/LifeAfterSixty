package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ImproveSleepActivity2 extends AppCompatActivity {
    Button Button_sleep;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_improve_sleep2);

        Button_sleep= findViewById(R.id.Button_sleep);

        Button_sleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ImproveSleepActivity2.this,MenuActivity2.class);
                startActivity(intent);
            }
        });
    }
}