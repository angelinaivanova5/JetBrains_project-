
package com.example.user.chemistry;

import java.util.HashMap;
import java.util.Map;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.user.myapplication.R;

public class GameScreen extends AppCompatActivity {
    /*boolean k1=false,k2=false,k3=false,k4=false,k5=false;*/
    SharedPreferences Pref1;

    public static final int SELECT_ELEMENT_TASK = 1;

    /*private int[] buttonIds = {R.id.bin1, R.id.bin2};*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Pref1 = PreferenceManager.getDefaultSharedPreferences(this);

        Pref1.edit().clear().apply();

        final SharedPreferences.Editor editor = Pref1.edit();
        final Button button = (Button) findViewById(R.id.bin4);
        final GameScreen this_ = this;
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
        res[1][4]="H2O";
        res[4][1]="H2O";
        boolres[1][4]=true;
        boolres[4][1]=true;
        res[1][11]="CO2";
        res[11][1]="CO2";
        boolres[1][11]=true;
        boolres[11][1]=true;
        res[3][5]="NaCl";
        res[5][3]="NaCl";
        boolres[3][5]=true;
        boolres[5][3]=true;
        res[2][6]="Al2S3";
        res[6][2]="Al2S3";
        boolres[2][6]=true;
        boolres[6][2]=true;
        res[1][7]="MgO";
        res[7][1]="MgO";
        boolres[1][7]=true;
        boolres[7][1]=true;
        res[8][1]="CaO";
        res[1][8]="CaO";
        boolres[8][1]=true;
        boolres[1][8]=true;
        res[1][9]="CuO";
        res[9][1]="CuO";
        boolres[1][9]=true;
        boolres[9][1]=true;
        res[10][14]="ZnCl2";
        res[14][10]="ZnCl2";
        boolres[10][14]=true;
        boolres[14][10]=true;
        final Map <String, Integer> elements= new HashMap<>();
        elements.put("O2",1);
        elements.put("S",2);
        elements.put("Cl",3);
        elements.put("H",4);
        elements.put("Na",5);
        elements.put("Al",6);
        elements.put("Mg",7);
        elements.put("Ca",8);
        elements.put("Cu",9);
        elements.put("Zn",10);
        elements.put("C",11);
        elements.put("H2O",12);
        elements.put("SO2",13);
        elements.put("HCl",14);
        elements.put("MgO",15);

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
                    if (boolres[number1][number2]) {
                        button1.setText(res[number1][number2]);
                        button11.setText("");
                        button12.setText("");

                        /*if (res[number1][number2].equals("HCl")) {
                            k1 = true;
                        }*/
                            editor.putString(button1.getText().toString(), button1.getText().toString());
                            editor.commit();
                        /*Button buttontest = (Button) findViewById(R.id.bin22);
                        View.OnClickListener listenertest = new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(GameScreen.this, Main3Activity.class);
                                intent.putExtra("Ar", k1);
                                startActivity(intent);
                            }
                        };
                            buttontest.setOnClickListener(listenertest);*/
                    }else {
                        button1.setText("Реакция не идет");
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