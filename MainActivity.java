package com.module7.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ImageView imageView;
    Button button;
    String[] listItems = {"CST 300 - Major ProSeminar", "CST 338 - Software Design", "CST 438 - Software Engineering", "CST 334 - Operating Systems", "CST 336 - Internet Programming", "CST 462S - Race, Gender, Class in the Digital World", "CST 370 - Design and Analysis of Algorithms", "CST 383 - Introduction to Data Science", "CST 499 - Directed Group Capstone"};
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        imageView = findViewById(R.id.imageView);
        imageView.setImageLevel(0);
        adapter = new ArrayAdapter<>(this, R.layout.list_item, R.id.listText,listItems);
        listView.setAdapter(adapter);
        button = findViewById(R.id.videoButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), VideoActivity.class);
                startActivity(intent);
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), CourseActivity.class);
                intent.putExtra("position", position);
                intent.putExtra("title", listItems[position]);
                startActivity(intent);
            }
        });



    }
}