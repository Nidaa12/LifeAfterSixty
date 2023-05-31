package com.example.myapp1;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogoutActivity2 extends AppCompatActivity {

        Button logoutButton;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_logout2);

            logoutButton= findViewById(R.id.logoutButton);

            logoutButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(LogoutActivity2.this,MainActivity.class);
                    startActivity(intent);
                }
            });
        }
    }