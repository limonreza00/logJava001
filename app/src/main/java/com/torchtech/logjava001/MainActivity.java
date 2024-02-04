package com.torchtech.logjava001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView6;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView6 = findViewById(R.id.textView6);
        button = findViewById(R.id.button);


        textView6.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,SignUp.class);
            startActivity(intent);

        });
        button.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Sign In", Toast.LENGTH_SHORT).show());


    }
}