package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdviceActivity2 extends AppCompatActivity {
    Button Button_advice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advice2);

        Button_advice= findViewById(R.id.Button_advice);

        Button_advice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AdviceActivity2.this,MenuActivity2.class);
                startActivity(intent);
            }
        });
    }
}