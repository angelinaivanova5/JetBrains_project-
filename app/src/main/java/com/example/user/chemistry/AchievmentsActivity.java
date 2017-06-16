package com.example.user.chemistry;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.user.myapplication.R;

import org.w3c.dom.Text;


public class AchievmentsActivity extends MainActivity {
    SharedPreferences Pref1;
    final public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.achievments);
        Pref1 = PreferenceManager.getDefaultSharedPreferences(this);
        String text1= Pref1.getString("HCl" , "");
        Intent intent = getIntent();
        int j = intent.getIntExtra("dd", -1);
        int q = intent.getIntExtra("gq", -1);
        Pref1.edit().clear().apply();
        if (j >= 1) {
            ImageButton button1 = (ImageButton) findViewById(R.id.imageButton1);
            button1.setImageResource(android.R.drawable.checkbox_on_background);
            TextView button2 = (TextView) findViewById(R.id.button1);
            button2.setText("Юный Химик");
            button2.setBackgroundColor(0xFFAFF36B);
        }
        if (!text1.equals("")) {
            ImageButton button3 = (ImageButton) findViewById(R.id.imageButton2);
            button3.setImageResource(android.R.drawable.checkbox_on_background);
            TextView button4 = (TextView) findViewById(R.id.button2);
            button4.setText("Соляная!  Изи!");
            button4.setBackgroundColor(0xFFAFF36B);
        }
    }
}
