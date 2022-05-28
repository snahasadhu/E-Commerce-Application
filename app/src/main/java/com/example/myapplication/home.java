package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.myapplication.prevalent.prevalent.currentOnlineUser;

public class home extends AppCompatActivity {
    private Button Settingsbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Settingsbtn = (Button) findViewById(R.id.settings_btn);

        Settingsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(home.this, user_settings.class);
                startActivity(intent);
            }
        });
    }
}