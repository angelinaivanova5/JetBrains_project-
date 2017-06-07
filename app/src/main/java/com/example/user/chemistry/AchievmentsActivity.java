package com.example.user.chemistry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;


public class AchievmentsActivity extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.achievments);
        Intent intent = getIntent();
        int k = intent.getIntExtra("AAAAAAA", -1);
        if (k > 1) {
            ImageButton button1 = (ImageButton) findViewById(R.id.imageButton1);
            button1.setImageResource(android.R.drawable.checkbox_on_background);
            Button button2 = (Button) findViewById(R.id.button1);
            button2.setText("Юный Химик");
        }
    }
}