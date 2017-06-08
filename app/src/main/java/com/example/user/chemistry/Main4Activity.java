package com.example.user.chemistry;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import com.example.user.myapplication.R;
public class Main4Activity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final Button button1 = (Button) findViewById(R.id.bin5);
        final Main4Activity this_ = this;
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.bin5:
                        Intent intent = new Intent(this_, Main2Activity.class);
                        Button button1 = (Button) findViewById(R.id.bin5);
                        intent.putExtra("kek", button1.getText().toString());
                        startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        };
        button1.setOnClickListener(listener);
    }
}
