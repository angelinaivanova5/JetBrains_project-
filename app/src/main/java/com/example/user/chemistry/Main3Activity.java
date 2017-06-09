package com.example.user.chemistry;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import com.example.user.myapplication.R;
public class Main3Activity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final Button button = (Button) findViewById(R.id.bin5);
        final Main3Activity this_ = this;
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.bin5:
                        Intent intent = new Intent(this_, Main2Activity.class);
                        intent.putExtra("lol", button.getText().toString());

                        setResult(RESULT_OK, intent);
                        finish();
                        break;
                    default:
                        break;
                }
            }
        };
        button.setOnClickListener(listener);
        final Button button1 = (Button) findViewById(R.id.bin6);
        View.OnClickListener listener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.bin6:
                        Intent intent = new Intent(this_, Main2Activity.class);
                        intent.putExtra("lol", button1.getText().toString());
                        setResult(RESULT_OK, intent);
                        finish();
                        break;
                    default:
                        break;
                }
            }
        };
        button1.setOnClickListener(listener1);
        final Button button2 = (Button) findViewById(R.id.bin7);
        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.bin7:
                        Intent intent = new Intent(this_, Main2Activity.class);
                        intent.putExtra("lol", button2.getText().toString());
                        setResult(RESULT_OK, intent);
                        finish();
                        break;
                    default:
                        break;
                }
            }
        };
        button2.setOnClickListener(listener2);
        final Button button3 = (Button) findViewById(R.id.bin8);
        View.OnClickListener listener3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.bin8:
                        Intent intent1 = new Intent(this_, Main2Activity.class);
                        intent1.putExtra("lol", button3.getText().toString());
                        setResult(RESULT_OK, intent1);
                        finish();
                        break;
                    default:
                        break;
                }
            }
        };
        button3.setOnClickListener(listener3);
    }
}