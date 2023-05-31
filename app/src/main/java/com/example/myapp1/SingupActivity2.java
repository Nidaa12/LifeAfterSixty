package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;

public class SingupActivity2 extends AppCompatActivity {
    private EditText mUsernameEditText;
    private EditText mPasswordEditText;
    private EditText mEmailText;
    private Button msingupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup2);

        mUsernameEditText = findViewById(R.id.username1);
        mPasswordEditText = findViewById(R.id.password1);
        mEmailText = findViewById(R.id.email1);
        msingupButton = findViewById(R.id.singupButton);

        msingupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = mUsernameEditText.getText().toString();
                String password = mPasswordEditText.getText().toString();
                String email = mEmailText.getText().toString();

                // Check if username and password are correct
                if (username.equals("admin") && password.equals("12345")  && email.equals("admin@gmail")) {
                    Intent intent = new Intent
                            (SingupActivity2.this, MainActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(SingupActivity2.this,"Login failed",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
