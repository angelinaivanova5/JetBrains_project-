package com.example.user.myapplication;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Main3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final Button button = (Button) findViewById(R.id.bin5);
        final Main3Activity this_ = this;
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btnText = button.getText().toString();
                Button button1 = (Button) findViewById(R.id.bin20);
                String btnText1 = button1.getText().toString();
                if (btnText1.equals("")) {
                    button1 = (Button) findViewById(R.id.bin20);
                } else {
                    button1 = (Button) findViewById(R.id.bin21);
                }
                button1.setText(btnText);
                Intent intent = new Intent(this_, Main2Activity.class);
                intent.putExtra("name",name.getText().toString());
                startActivity(intent);
            }
        };
        button.setOnClickListener(listener);
    }
}