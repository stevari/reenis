package com.northpolegames.reenisapp;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ProfileActivity extends AppCompatActivity {
    private ArrayList<Profile> profileList;
    private Profile profiili;
    private Button switchToCreateNewBtn;
    private ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //Nappi joka vie käyttäjän edelliseen näkymään
        findViewById(R.id.backBtn).setOnClickListener(view -> {
            finish();
        });


        //Nappi joka vie käyttäjän näkymään, jossa voi luoda uuden profiilin
        findViewById(R.id.switchToCreateNewBtn).setOnClickListener(view -> {
            startActivity(new Intent(ProfileActivity.this, CreateProfileActivity.class));
        });


    }
}