package com.northpolegames.reenisapp;
import java.util.ArrayList;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {
    private ArrayList<Profile> profileList;
    private Button registerButton;
    private Profile profiili;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        registerButton = findViewById(R.id.registerButton); //Hakee id:n perusteella napin
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            profiili = new Profile("Ville",183,84);
            profileList.add(profiili);
            Log.d("testi",profiili.toString());

            }
        });


    }
}