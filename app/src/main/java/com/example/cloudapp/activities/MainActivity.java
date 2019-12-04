package com.example.cloudapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cloudapp.R;

public class MainActivity extends AppCompatActivity {
    private Button add, update, delete, list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.add);
        update = findViewById(R.id.update);
        delete = findViewById(R.id.delete);
        list = findViewById(R.id.retreive);
        add.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, add.class);
            startActivity(intent);
        });
        update.setOnClickListener((v) -> {
            Intent intent = new Intent(MainActivity.this, update.class);
            startActivity(intent);
        });
        delete.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, delete.class);
            startActivity(intent);
        });
        list.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, list.class);
            startActivity(intent);
        });
    }
}
