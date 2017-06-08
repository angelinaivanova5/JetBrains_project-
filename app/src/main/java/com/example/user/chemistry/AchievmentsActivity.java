package com.example.user.chemistry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.user.myapplication.R;


public class AchievmentsActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState)

    {
        Intent intent = getIntent();
        int k = intent.getIntExtra("ml", -1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.achievments);
        if (k > 0) {
        ImageButton button1 = (ImageButton) findViewById(R.id.imageButton1);
            button1.setImageResource(android.R.drawable.checkbox_on_background);
        }
    }
}