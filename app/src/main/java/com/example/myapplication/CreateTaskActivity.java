package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CreateTaskActivity extends AppCompatActivity {

    private EditText editTextTitle;
    private EditText editTextDescription;
    private Button buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_task);

        editTextTitle = findViewById(R.id.editTextTitle);
        editTextDescription = findViewById(R.id.editTextDescription);
        buttonSave = findViewById(R.id.buttonSave);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveTask();
            }
        });
    }

    private void saveTask() {
        String title = editTextTitle.getText().toString().trim();
        String description = editTextDescription.getText().toString().trim();

        if (!title.isEmpty()) {
            // Здесь вы можете добавить код для сохранения задачи, например, в базе данных или другом хранилище
            // В данном примере мы просто выводим данные задачи в виде Toast-сообщения

            String taskDetails = "Название: " + title + "\nОписание: " + description;
            Toast.makeText(this, taskDetails, Toast.LENGTH_SHORT).show();

            // После сохранения задачи, вы можете закрыть эту активность
            finish();
        } else {
            editTextTitle.setError("Введите название задачи");
        }
    }
}