
package com.example.user.chemistry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.user.myapplication.R;

public class Main2Activity extends AppCompatActivity {

    public static final int SELECT_ELEMENT_TASK = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Button button = (Button) findViewById(R.id.bin4);
        final Main2Activity this_ = this;
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(this_, Main3Activity.class);
                startActivityForResult(intent, SELECT_ELEMENT_TASK);
            }
        };
        button.setOnClickListener(listener);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case SELECT_ELEMENT_TASK:
                if (resultCode == RESULT_OK) {
                    Bundle extras = data.getExtras();
                    String elementName = extras.getString("lol");
                    Button button2 = (Button) findViewById(R.id.bin20);
                    String a = button2.getText().toString();
                    if (a.equals("")) {
                        button2 = (Button) findViewById(R.id.bin20);
                    } else {
                        button2 = (Button) findViewById(R.id.bin21);
                    }
                    button2.setText(elementName);
                }
                break;
        }
    }
}