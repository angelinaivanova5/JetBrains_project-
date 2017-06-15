
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

    SharedPreferences Pref1;

    public static final int SELECT_ELEMENT_TASK = 1;



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
        int amm = 100;
        final String[][] res = new String[amm][amm];
        final Boolean[][] boolres = new Boolean[amm][amm];
        for (int i=0;i<amm;i++){
            for (int j=0;j<amm;j++){
                boolres[i][j]=false;
            }
        }
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
        res[1][11]="CO2";
        res[11][1]="CO2";
        boolres[1][11]=true;
        boolres[11][1]=true;
        res[8][17]="CaCO3";
        res[17][8]="CaCO3";
        boolres[8][17]=true;
        boolres[17][8]=true;
        res[14][19]="CuCl2";
        res[19][14]="CuCl2";
        boolres[14][19]=true;
        boolres[19][14]=true;
        res[12][17]="H2CO3";
        res[17][12]="H2CO3";
        boolres[12][17]=true;
        boolres[17][12]=true;
        res[5][1]="Na2O2";
        res[1][5]="Na2O2";
        boolres[5][1]=true;
        boolres[1][5]=true;
        res[5][20]="Na2O";
        res[20][5]="Na2O";
        boolres[5][20]=true;
        boolres[20][5]=true;
        res[12][21]="NaOH";
        res[21][12]="NaOH";
        boolres[12][21]=true;
        boolres[21][12]=true;
        res[16][2]="FeS";
        res[2][16]="FeS";
        boolres[2][16]=true;
        boolres[16][2]=true;
        res[7][14]="MgCl2";
        res[14][7]="MgCl2";
        boolres[7][14]=true;
        boolres[14][7]=true;
        res[5][2]="Na2S";
        res[2][5]="Na2S";
        boolres[2][5]=true;
        boolres[5][2]=true;
        res[4][2]="H2S";
        res[2][4]="H2S";
        boolres[2][4]=true;
        boolres[4][2]=true;
        res[4][2]="H2S";
        res[2][4]="H2S";
        boolres[2][4]=true;
        boolres[4][2]=true;
        res[16][24]="FeCl";
        res[24][16]="FeCl";
        boolres[16][24]=true;
        boolres[24][16]=true;
        final Map <String, Integer> elements= new HashMap<>();
        elements.put("O2",1);
        elements.put("S",2);
        elements.put("Cl2",3);
        elements.put("H2",4);
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
        elements.put("Fe",16);
        elements.put("CO2",17);
        elements.put("Ra", 18);
        elements.put("CuO", 19);
        elements.put("Na2O2", 20);
        elements.put("Na2O", 21);
        elements.put("Na2S", 22);
        elements.put("CuCl2", 24);
        elements.put("FeCl", 25);
        elements.put("NaOH", 26);
        elements.put("MgCl2", 27);
        elements.put("FeS", 28);
        elements.put("H2CO3", 29);
        elements.put("ZnCl2", 30);
        elements.put("CaO", 31);
        elements.put("Al2S3", 32);
        final Button button1 = (Button) findViewById(R.id.bin22);
        View.OnClickListener listener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button11 = (Button) findViewById(R.id.bin20);
                Button button12 = (Button) findViewById(R.id.bin21);
                String a = button11.getText().toString();
                String b = button12.getText().toString();
               if ((a.equals("Ra"))||(b.equals("Ra"))) {
                   editor.putString("Ra1", "1001");
                   editor.commit();
             }
                if ((!a.equals(""))&&(!b.equals(""))){
                    int number1 = elements.get(a);
                    int number2 = elements.get(b);
                    if (boolres[number1][number2]) {
                        button1.setText(res[number1][number2]);
                        button11.setText("");
                        button12.setText("");
                        editor.putString(button1.getText().toString(), button1.getText().toString());
                        editor.commit();
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