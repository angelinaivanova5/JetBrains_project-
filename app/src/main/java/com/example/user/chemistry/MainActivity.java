package com.example.user.chemistry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.user.myapplication.R;

public class MainActivity extends AppCompatActivity {
    int j = 0;
    private String tag = "101";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "Create1");
        final Button button = (Button) findViewById(R.id.bin1);
        final MainActivity this_ = this;
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j++;
                Intent intent = new Intent(this_, GameScreen.class);
                startActivity(intent);
            }
        };
        button.setOnClickListener(listener);
        Button button2 = (Button) findViewById(R.id.bin2);

        View.OnClickListener buttonListener = new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BazaElementovActivity.class);
                startActivity(intent);
            }
        };

        button2.setOnClickListener(buttonListener);
        Button button3 = (Button) findViewById(R.id.bin3);
        View.OnClickListener buttonListener1 = new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, AchievmentsActivity.class);
                intent.putExtra("dd", j);
                startActivity(intent);
            }
        };

        button3.setOnClickListener(buttonListener1);
    }

}