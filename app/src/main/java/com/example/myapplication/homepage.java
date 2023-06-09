package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class homepage extends AppCompatActivity {
    private ImageButton calendar;
    private ImageButton interest_finder;
    private ImageButton messages;

    private ImageButton my_profile;

    private ImageButton my_interests;
    private Button partick_button;
    private ImageButton settings_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        calendar = (ImageButton) findViewById(R.id.calendar_button);
        calendar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openCalendar();
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

        my_interests = (ImageButton) findViewById(R.id.my_interests_button);
        my_interests.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMyInterests();
            }
        });
        partick_button = (Button) findViewById(R.id.partick_button);
        partick_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openPartickPage();
            }
        });
        settings_button = (ImageButton) findViewById(R.id.settings_button);
        settings_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openSettings();
            }
        });
    }
    public void openCalendar(){
        Intent intent = new Intent(this, calendar.class);
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

    public void openMyInterests(){
        Intent intent = new Intent(this, my_interests.class);
        startActivity(intent);
    }
    public void openPartickPage(){
        Intent intent = new Intent(this, partick_page.class);
        startActivity(intent);
    }

    public void openSettings(){
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
}