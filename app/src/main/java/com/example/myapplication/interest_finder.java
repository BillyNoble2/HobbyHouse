package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class interest_finder extends AppCompatActivity {
    private ImageButton calendar;
    private ImageButton homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interest_finder);

        calendar = (ImageButton) findViewById(R.id.calendar_button);
        calendar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openCalendar();
            }
        });
        homeButton = (ImageButton) findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openHomePage();
            }
        });
    }
    public void openCalendar(){
        Intent intent = new Intent(this, calendar.class);
        startActivity(intent);
    }
    public void openHomePage(){
        Intent intent = new Intent(this, homepage.class);
        startActivity(intent);
    }
}