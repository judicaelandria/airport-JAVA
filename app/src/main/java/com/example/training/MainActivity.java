package com.example.training;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signin = (Button) findViewById(R.id.signin_btn);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Explore.class);
                startActivity(a);
            }
        });
    }

    // go to sign up
    public void goToSignup(View view) {
        Intent intent = new Intent(this,SignUp.class);
        startActivity(intent);
    }
}