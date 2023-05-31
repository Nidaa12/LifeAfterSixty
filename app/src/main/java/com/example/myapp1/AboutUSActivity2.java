package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutUSActivity2 extends AppCompatActivity {
    Button Button_menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_usactivity2);

        Button_menu= findViewById(R.id.btn_aboutativity2_submit);

        Button_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AboutUSActivity2.this,MenuActivity2.class);
                startActivity(intent);
            }
        });
    }
}