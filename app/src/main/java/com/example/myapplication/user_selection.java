package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class user_selection extends AppCompatActivity {

    private Button userButton;
    private Button ownerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_selection);

        userButton = (Button) findViewById(R.id.club_member_button);
        userButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMemberLogin();
            }
        });

        ownerButton = (Button) findViewById(R.id.club_owner_button);
        ownerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openOwnerLogin();
            }
        });
    }
    public void openOwnerLogin(){
        Intent intent = new Intent(this, login_owner.class);
        startActivity(intent);
    }

    public void openMemberLogin(){
        Intent intent = new Intent(this, login_user.class);
        startActivity(intent);
    }
}