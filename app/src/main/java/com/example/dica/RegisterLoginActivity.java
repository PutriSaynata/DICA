package com.example.dica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class RegisterLoginActivity extends AppCompatActivity {
    private Button button3;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_login);
        button3 = (Button)findViewById(R.id.button3);
        button2 = (Button)findViewById(R.id.button2);

        button3.setOnClickListener(v -> {
            Intent intent2 = new Intent(getApplicationContext(),LoginActivity.class);
            startActivity(intent2);
        });
        button2.setOnClickListener(v -> {
            Intent intent2 = new Intent(getApplicationContext(),RegisterActivity.class);
            startActivity(intent2);
        });
    }

}