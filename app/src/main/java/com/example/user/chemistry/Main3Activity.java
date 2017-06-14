package com.example.user.chemistry;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import com.example.user.myapplication.R;
public class Main3Activity extends AppCompatActivity {
    SharedPreferences Pref1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button button11 = (Button) findViewById(R.id.bin16);
        String a1 = button11.getText().toString();
        Pref1 = PreferenceManager.getDefaultSharedPreferences(this);
        String text1= Pref1.getString("H2O" , "");
        if (a1.equals("Locked")) {
            if (!text1.equals("")){
                button11.setText("H2O");
            }
        }
        Button button12 = (Button) findViewById(R.id.bin17);
        String a2 = button12.getText().toString();
        String text2= Pref1.getString("SO2" , "");
        if (a2.equals("Locked")) {
            if (!text2.equals("")){
                button12.setText("SO2");
            }
        }
        Button button13 = (Button) findViewById(R.id.bin18);
        String a3 = button13.getText().toString();
        String text3= Pref1.getString("HCl" , "");
        if (a3.equals("Locked")) {
            if (!text3.equals("")){
                button13.setText("HCl");
            }
        }
        Button button14 = (Button) findViewById(R.id.bin19);
        String a4 = button14.getText().toString();
        String text4= Pref1.getString("MgO" , "");
        if (a4.equals("Locked")) {
            if (!text4.equals("")){
                button14.setText("MgO");
            }
        }
        final Button button = (Button) findViewById(R.id.bin5);
        final Main3Activity this_ = this;
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(this_, GameScreen.class);
                intent.putExtra("lol", button.getText().toString());

                setResult(RESULT_OK, intent);
                finish();
            }
        };
        button.setOnClickListener(listener);
        final Button button1 = (Button) findViewById(R.id.bin6);
        View.OnClickListener listener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent intent = new Intent(this_, GameScreen.class);
                        intent.putExtra("lol", button1.getText().toString());
                        setResult(RESULT_OK, intent);
                        finish();
            }
        };
        button1.setOnClickListener(listener1);
        final Button button2 = (Button) findViewById(R.id.bin7);
        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent intent = new Intent(this_, GameScreen.class);
                        intent.putExtra("lol", button2.getText().toString());
                        setResult(RESULT_OK, intent);
                        finish();
            }
        };
        button2.setOnClickListener(listener2);
        final Button button3 = (Button) findViewById(R.id.bin8);
        View.OnClickListener listener3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent intent1 = new Intent(this_, GameScreen.class);
                        intent1.putExtra("lol", button3.getText().toString());
                        setResult(RESULT_OK, intent1);
                        finish();
            }
        };
        button3.setOnClickListener(listener3);
        final Button button4 = (Button) findViewById(R.id.bin9);
        View.OnClickListener listener4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent intent1 = new Intent(this_, GameScreen.class);
                        intent1.putExtra("lol", button4.getText().toString());
                        setResult(RESULT_OK, intent1);
                        finish();
            }
        };
        button4.setOnClickListener(listener4);
        final Button button5 = (Button) findViewById(R.id.bin10);
        View.OnClickListener listener5 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent intent1 = new Intent(this_, GameScreen.class);
                        intent1.putExtra("lol", button5.getText().toString());
                        setResult(RESULT_OK, intent1);
                        finish();
            }
        };
        button5.setOnClickListener(listener5);
        final Button button6 = (Button) findViewById(R.id.bin11);
        View.OnClickListener listener6 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent intent1 = new Intent(this_, GameScreen.class);
                        intent1.putExtra("lol", button6.getText().toString());
                        setResult(RESULT_OK, intent1);
                        finish();
            }
        };
        button6.setOnClickListener(listener6);
        final Button button7 = (Button) findViewById(R.id.bin12);
        View.OnClickListener listener7 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent intent1 = new Intent(this_, GameScreen.class);
                        intent1.putExtra("lol", button7.getText().toString());
                        setResult(RESULT_OK, intent1);
                        finish();
            }
        };
        button7.setOnClickListener(listener7);
        final Button button8 = (Button) findViewById(R.id.bin13);
        View.OnClickListener listener8 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent intent1 = new Intent(this_, GameScreen.class);
                        intent1.putExtra("lol", button8.getText().toString());
                        setResult(RESULT_OK, intent1);
                        finish();
            }
        };
        button8.setOnClickListener(listener8);
        final Button button9 = (Button) findViewById(R.id.bin14);
        View.OnClickListener listener9 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent intent1 = new Intent(this_, GameScreen.class);
                        intent1.putExtra("lol", button9.getText().toString());
                        setResult(RESULT_OK, intent1);
                        finish();
            }
        };
        button9.setOnClickListener(listener9);
        final Button button10 = (Button) findViewById(R.id.bin15);
        View.OnClickListener listener10 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent intent1 = new Intent(this_, GameScreen.class);
                        intent1.putExtra("lol", button10.getText().toString());
                        setResult(RESULT_OK, intent1);
                        finish();
            }
        };
        button10.setOnClickListener(listener10);
        final Button button111 = (Button) findViewById(R.id.bin18);
        View.OnClickListener listener111 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        String b = button111.getText().toString();
                        if (!b.equals("Locked")) {
                            Intent intent1 = new Intent(this_, GameScreen.class);
                            intent1.putExtra("lol", button111.getText().toString());
                            setResult(RESULT_OK, intent1);
                            finish();
                }
            }
        };
        button111.setOnClickListener(listener111);

    }
}