package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class messages_main extends AppCompatActivity {
    private ImageButton my_interests;
    private ImageButton interest_finder;
    private ImageButton homeButton;
    private ImageButton calendar;
    private ImageButton my_profile;
    private Button marty_chat;
    private Button melissa_chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.messages_main);

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

        homeButton = (ImageButton) findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openHomePage();
            }
        });

        calendar = (ImageButton) findViewById(R.id.calendar_button);
        calendar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openCalendar();
            }
        });

        my_profile = (ImageButton) findViewById(R.id.my_account_button);
        my_profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMyProfile();
            }
        });

        marty_chat = (Button) findViewById(R.id.marty_chat);
        marty_chat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMartyChat();
            }
        });
        melissa_chat = (Button) findViewById(R.id.melissa_chat);
        melissa_chat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMelissaChat();
            }
        });
    }
    public void openMyInterests(){
        Intent intent = new Intent(this, my_interests.class);
        startActivity(intent);
    }

    public void openInterestFinder(){
        Intent intent = new Intent(this, interest_finder.class);
        startActivity(intent);
    }

    public void openHomePage(){
        Intent intent = new Intent(this, homepage.class);
        startActivity(intent);
    }

    public void openCalendar(){
        Intent intent = new Intent(this, calendar.class);
        startActivity(intent);
    }

    public void openMyProfile(){
        Intent intent = new Intent(this, my_profile.class);
        startActivity(intent);
    }

    public void openMartyChat(){
        Intent intent = new Intent(this, marty_chat.class);
        startActivity(intent);
    }

    public void openMelissaChat(){
        Intent intent = new Intent(this, melissa_chat.class);
        startActivity(intent);
    }
}