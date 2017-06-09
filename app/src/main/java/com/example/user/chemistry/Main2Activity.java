
package com.example.user.chemistry;

import java.util.HashMap;
import java.util.Map;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.user.myapplication.R;

public class Main2Activity extends AppCompatActivity {

    public static final int SELECT_ELEMENT_TASK = 1;

    private int[] buttonIds = {R.id.bin1, R.id.bin2};

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
        int amm = 15;
        final String[][] res = new String[amm][amm];
        final Boolean[][] boolres = new Boolean[amm][amm];
        for (int i=0;i<amm;i++){
            for (int j=0;j<amm;j++){
                boolres[i][j]=false;
            }
        }
        /*

        for (int id : buttonIds) {

        }

        for (int i = 0; i < buttonIds.length; i++) {
            int buttonId = buttonIds[i];
            Button btn = (Button) findViewById(buttonId);
        }*/


        res[1][2]="SO2";
        res[2][1]="SO2";
        boolres[1][2]=true;
        boolres[2][1]=true;
        res[3][4]="HCl";
        res[4][3]="HCl";
        boolres[3][4]=true;
        boolres[4][3]=true;
        final Map <String, Integer> elements= new HashMap<>();
        elements.put("O2",1);
        elements.put("S",2);
        elements.put("Cl",3);
        elements.put("H",4);
        final Button button1 = (Button) findViewById(R.id.bin22);
        View.OnClickListener listener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button11 = (Button) findViewById(R.id.bin20);
                Button button12 = (Button) findViewById(R.id.bin21);
                String a = button11.getText().toString();
                String b = button12.getText().toString();
                if ((!a.equals(""))&&(!b.equals(""))){
                    int number1 = elements.get(a);
                    int number2 = elements.get(b);
                    if (boolres[number1][number2]=true){
                        button1.setText(res[number1][number2]);
                        button11.setText("");
                        button12.setText("");
                    }
                }
            }
        };
        button1.setOnClickListener(listener1);

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