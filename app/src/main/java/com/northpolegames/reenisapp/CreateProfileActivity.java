package com.northpolegames.reenisapp;
import java.util.ArrayList;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class CreateProfileActivity extends AppCompatActivity {
    private ArrayList<Profile> profileList;
    private Button registerButton;
    private Profile profiili;
    private ImageButton backBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);
        this.profileList = new ArrayList<>();
        //Nappi joka vie käyttäjän edelliseen näkymään
        findViewById(R.id.backBtn).setOnClickListener(view -> {
            finish();
        });

        findViewById(R.id.registerButton).setOnClickListener(view -> {
            profileList.add(new Profile("Ville",184,83)); //example profile
            Toast.makeText(CreateProfileActivity.this, "Profiili luoto onnistuneesti", Toast.LENGTH_LONG).show();
        });

    }
}