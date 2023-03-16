package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class calendar extends AppCompatActivity {
    private ImageButton homeButton;
    private ImageButton my_interests;
    private ImageButton interest_finder;
    private ImageButton messages;
    private ImageButton my_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);

        homeButton = (ImageButton) findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openHomePage();
            }
        });

        my_interests = (ImageButton) findViewById(R.id.my_interests_button);
        my_interests.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMyInterests();
            }
        });

        interest_finder = (ImageButton) findViewById(R.id.interest_button);
        interest_finder.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openInterestFinder();
            }
        });

        messages = (ImageButton) findViewById(R.id.messages_button);
        messages.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMessages();
            }
        });

        my_profile = (ImageButton) findViewById(R.id.my_account_button);
        my_profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMyProfile();
            }
        });
    }
    public void openHomePage(){
        Intent intent = new Intent(this, homepage.class);
        startActivity(intent);
    }
    public void openMyInterests(){
        Intent intent = new Intent(this, my_interests.class);
        startActivity(intent);
    }

    public void openInterestFinder(){
        Intent intent = new Intent(this, interest_finder.class);
        startActivity(intent);
    }

    public void openMessages(){
        Intent intent = new Intent(this, messages_main.class);
        startActivity(intent);
    }

    public void openMyProfile(){
        Intent intent = new Intent(this, my_profile.class);
        startActivity(intent);
    }
}