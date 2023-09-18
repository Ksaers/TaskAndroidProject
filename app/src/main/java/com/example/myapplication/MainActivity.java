package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboba);

        btnStart = findViewById(R.id.btnStart);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Здесь можно добавить код для перехода на экран списка задач
                Intent intent = new Intent(MainActivity.this, ScrollActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP); // Устанавливаем флаг
                startActivity(intent);
            }
        });
    }
}