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
        final Button button = (Button) findViewById(R.id.bin7);
        final Main3Activity this_ = this;
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.bin7:
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
        final Button button2 = (Button) findViewById(R.id.bin9);
        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.bin9:
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
        final Button button3 = (Button) findViewById(R.id.bin10);
        View.OnClickListener listener3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.bin10:
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
        final Button button4 = (Button) findViewById(R.id.bin8);
        View.OnClickListener listener4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.bin8:
                        Intent intent1 = new Intent(this_, Main2Activity.class);
                        intent1.putExtra("lol", button4.getText().toString());
                        setResult(RESULT_OK, intent1);
                        finish();
                        break;
                    default:
                        break;
                }
            }
        };
        button4.setOnClickListener(listener4);
        final Button button5 = (Button) findViewById(R.id.bin12);
        View.OnClickListener listener5 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.bin12:
                        Intent intent1 = new Intent(this_, Main2Activity.class);
                        intent1.putExtra("lol", button5.getText().toString());
                        setResult(RESULT_OK, intent1);
                        finish();
                        break;
                    default:
                        break;
                }
            }
        };
        button5.setOnClickListener(listener5);
        final Button button6 = (Button) findViewById(R.id.bin11);
        View.OnClickListener listener6 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.bin11:
                        Intent intent1 = new Intent(this_, Main2Activity.class);
                        intent1.putExtra("lol", button6.getText().toString());
                        setResult(RESULT_OK, intent1);
                        finish();
                        break;
                    default:
                        break;
                }
            }
        };
        button6.setOnClickListener(listener6);
        final Button button7 = (Button) findViewById(R.id.bin14);
        View.OnClickListener listener7 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.bin14:
                        Intent intent1 = new Intent(this_, Main2Activity.class);
                        intent1.putExtra("lol", button7.getText().toString());
                        setResult(RESULT_OK, intent1);
                        finish();
                        break;
                    default:
                        break;
                }
            }
        };
        button7.setOnClickListener(listener7);
        final Button button8 = (Button) findViewById(R.id.bin13);
        View.OnClickListener listener8 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.bin13:
                        Intent intent1 = new Intent(this_, Main2Activity.class);
                        intent1.putExtra("lol", button8.getText().toString());
                        setResult(RESULT_OK, intent1);
                        finish();
                        break;
                    default:
                        break;
                }
            }
        };
        button8.setOnClickListener(listener8);
        final Button button9 = (Button) findViewById(R.id.bin15);
        View.OnClickListener listener9 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.bin15:
                        Intent intent1 = new Intent(this_, Main2Activity.class);
                        intent1.putExtra("lol", button9.getText().toString());
                        setResult(RESULT_OK, intent1);
                        finish();
                        break;
                    default:
                        break;
                }
            }
        };
        button9.setOnClickListener(listener9);
        final Button button10 = (Button) findViewById(R.id.bin5);
        View.OnClickListener listener10 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.bin5:
                        Intent intent1 = new Intent(this_, Main2Activity.class);
                        intent1.putExtra("lol", button10.getText().toString());
                        setResult(RESULT_OK, intent1);
                        finish();
                        break;
                    default:
                        break;
                }
            }
        };
        button10.setOnClickListener(listener10);
        final Button button11 = (Button) findViewById(R.id.bin16);
        View.OnClickListener listener11 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.bin16:
                        Intent intent1 = new Intent(this_, Main2Activity.class);
                        intent1.putExtra("lol", button10.getText().toString());
                        setResult(RESULT_OK, intent1);
                        finish();
                        break;
                    default:
                        break;
                }
            }
        };
        button11.setOnClickListener(listener11);
    }
}