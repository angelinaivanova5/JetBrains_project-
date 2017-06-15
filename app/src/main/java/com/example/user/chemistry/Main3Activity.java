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
        Button button11 = (Button) findViewById(R.id.bin200);
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
        Button button15 = (Button) findViewById(R.id.bin210);
        String a5 = button15.getText().toString();
        String text5 = Pref1.getString("CO2" , "");
        if (a5.equals("Locked")) {
            if (!text5.equals("")){
                button15.setText("CO2");
            }
        }
        Button button16 = (Button) findViewById(R.id.bin220);
        String a6 = button16.getText().toString();
        String text6 = Pref1.getString("CuO" , "");
        if (a6.equals("Locked")) {
            if (!text6.equals("")){
                button16.setText("CuO");
            }
        }
        Button button17 = (Button) findViewById(R.id.bin23);
        String a7 = button17.getText().toString();
        String text7 = Pref1.getString("Na2O2" , "");
        if (a7.equals("Locked")) {
            if (!text7.equals("")){
                button17.setText("Na2O2");
            }
        }
        Button button18 = (Button) findViewById(R.id.bin24);
        String a8 = button18.getText().toString();
        String text8 = Pref1.getString("Na2O" , "");
        if (a8.equals("Locked")) {
            if (!text8.equals("")){
                button18.setText("Na2O");
            }
        }
        Button button19 = (Button) findViewById(R.id.bin25);
        String a9 = button19.getText().toString();
        String text9 = Pref1.getString("Na2S" , "");
        if (a9.equals("Locked")) {
            if (!text9.equals("")){
                button19.setText("Na2S");
            }
        }
        Button button20 = (Button) findViewById(R.id.bin26);
        String a10 = button20.getText().toString();
        String text10 = Pref1.getString("CuCl2" , "");
        if (a10.equals("Locked")) {
            if (!text10.equals("")){
                button20.setText("CuCl2");
            }
        }
        Button button21 = (Button) findViewById(R.id.bin27);
        String a11 = button21.getText().toString();
        String text11 = Pref1.getString("FeCl" , "");
        if (a11.equals("Locked")) {
            if (!text11.equals("")){
                button21.setText("FeCl");
            }
        }
        Button button22 = (Button) findViewById(R.id.bin28);
        String a12 = button22.getText().toString();
        String text12 = Pref1.getString("NaOH" , "");
        if (a12.equals("Locked")) {
            if (!text12.equals("")){
                button22.setText("NaOH");
            }
        }
        Button button23 = (Button) findViewById(R.id.bin29);
        String a13 = button23.getText().toString();
        String text13 = Pref1.getString("MgCl2" , "");
        if (a13.equals("Locked")) {
            if (!text13.equals("")){
                button23.setText("MgCl2");
            }
        }
        Button button24 = (Button) findViewById(R.id.bin30);
        String a14 = button24.getText().toString();
        String text14 = Pref1.getString("FeS" , "");
        if (a14.equals("Locked")) {
            if (!text14.equals("")){
                button24.setText("FeS");
            }
        }
        Button button25 = (Button) findViewById(R.id.bin31);
        String a15 = button25.getText().toString();
        String text15 = Pref1.getString("H2CO3" , "");
        if (a15.equals("Locked")) {
            if (!text15.equals("")){
                button25.setText("H2CO3");
            }
        }
        Button button26 = (Button) findViewById(R.id.bin32);
        String a16 = button26.getText().toString();
        String text16 = Pref1.getString("ZnCl2" , "");
        if (a16.equals("Locked")) {
            if (!text16.equals("")){
                button26.setText("ZnCl2");
            }
        }
        Button button27 = (Button) findViewById(R.id.bin33);
        String a17 = button27.getText().toString();
        String text17 = Pref1.getString("CaO" , "");
        if (a17.equals("Locked")) {
            if (!text17.equals("")){
                button27.setText("CaO");
            }
        }
        Button button28 = (Button) findViewById(R.id.bin34);
        String a18 = button28.getText().toString();
        String text18 = Pref1.getString("Al2S3" , "");
        if (a9.equals("Locked")) {
            if (!text18.equals("")){
                button28.setText("Al2S3");
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
        final Button button111 = (Button) findViewById(R.id.bin16);
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

        final Button button112 = (Button) findViewById(R.id.bin17);
        View.OnClickListener listener112 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = button112.getText().toString();
                if (!b.equals("Locked")) {
                    Intent intent1 = new Intent(this_, GameScreen.class);
                    intent1.putExtra("lol", button112.getText().toString());
                    setResult(RESULT_OK, intent1);
                    finish();
                }
            }
        };
        button112.setOnClickListener(listener112);

        final Button button113 = (Button) findViewById(R.id.bin18);
        View.OnClickListener listener113 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = button113.getText().toString();
                if (!b.equals("Locked")) {
                    Intent intent1 = new Intent(this_, GameScreen.class);
                    intent1.putExtra("lol", button113.getText().toString());
                    setResult(RESULT_OK, intent1);
                    finish();
                }
            }
        };
        button113.setOnClickListener(listener113);

        final Button button114 = (Button) findViewById(R.id.bin19);
        View.OnClickListener listener114 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = button114.getText().toString();
                if (!b.equals("Locked")) {
                    Intent intent1 = new Intent(this_, GameScreen.class);
                    intent1.putExtra("lol", button114.getText().toString());
                    setResult(RESULT_OK, intent1);
                    finish();
                }
            }
        };
        button114.setOnClickListener(listener114);
        final Button button115 = (Button) findViewById(R.id.bin200);
        View.OnClickListener listener115 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = button115.getText().toString();
                if (!b.equals("Locked")) {
                    Intent intent1 = new Intent(this_, GameScreen.class);
                    intent1.putExtra("lol", button115.getText().toString());
                    setResult(RESULT_OK, intent1);
                    finish();
                }
            }
        };
        button115.setOnClickListener(listener115);
        final Button button116 = (Button) findViewById(R.id.bin210);
        View.OnClickListener listener116 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = button116.getText().toString();
                if (!b.equals("Locked")) {
                    Intent intent1 = new Intent(this_, GameScreen.class);
                    intent1.putExtra("lol", button116.getText().toString());
                    setResult(RESULT_OK, intent1);
                    finish();
                }
            }
        };
        button116.setOnClickListener(listener116);

        final Button button117 = (Button) findViewById(R.id.bin220);
        View.OnClickListener listener117 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = button117.getText().toString();
                if (!b.equals("Locked")) {
                    Intent intent1 = new Intent(this_, GameScreen.class);
                    intent1.putExtra("lol", button117.getText().toString());
                    setResult(RESULT_OK, intent1);
                    finish();
                }
            }
        };
        button117.setOnClickListener(listener117);

        final Button button118 = (Button) findViewById(R.id.bin23);
        View.OnClickListener listener118 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = button118.getText().toString();
                if (!b.equals("Locked")) {
                    Intent intent1 = new Intent(this_, GameScreen.class);
                    intent1.putExtra("lol", button118.getText().toString());
                    setResult(RESULT_OK, intent1);
                    finish();
                }
            }
        };
        button118.setOnClickListener(listener118);

        final Button button119 = (Button) findViewById(R.id.bin24);
        View.OnClickListener listener119 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = button119.getText().toString();
                if (!b.equals("Locked")) {
                    Intent intent1 = new Intent(this_, GameScreen.class);
                    intent1.putExtra("lol", button119.getText().toString());
                    setResult(RESULT_OK, intent1);
                    finish();
                }
            }
        };
        button119.setOnClickListener(listener119);

        final Button button120 = (Button) findViewById(R.id.bin25);
        View.OnClickListener listener120 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = button120.getText().toString();
                if (!b.equals("Locked")) {
                    Intent intent1 = new Intent(this_, GameScreen.class);
                    intent1.putExtra("lol", button120.getText().toString());
                    setResult(RESULT_OK, intent1);
                    finish();
                }
            }
        };
        button120.setOnClickListener(listener120);

        final Button button121 = (Button) findViewById(R.id.bin26);
        View.OnClickListener listener121 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = button121.getText().toString();
                if (!b.equals("Locked")) {
                    Intent intent1 = new Intent(this_, GameScreen.class);
                    intent1.putExtra("lol", button121.getText().toString());
                    setResult(RESULT_OK, intent1);
                    finish();
                }
            }
        };
        button121.setOnClickListener(listener121);

        final Button button122 = (Button) findViewById(R.id.bin27);
        View.OnClickListener listener122 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = button122.getText().toString();
                if (!b.equals("Locked")) {
                    Intent intent1 = new Intent(this_, GameScreen.class);
                    intent1.putExtra("lol", button122.getText().toString());
                    setResult(RESULT_OK, intent1);
                    finish();
                }
            }
        };
        button122.setOnClickListener(listener122);

        final Button button123 = (Button) findViewById(R.id.bin28);
        View.OnClickListener listener123 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = button123.getText().toString();
                if (!b.equals("Locked")) {
                    Intent intent1 = new Intent(this_, GameScreen.class);
                    intent1.putExtra("lol", button123.getText().toString());
                    setResult(RESULT_OK, intent1);
                    finish();
                }
            }
        };
        button123.setOnClickListener(listener123);

        final Button button124 = (Button) findViewById(R.id.bin29);
        View.OnClickListener listener124 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = button124.getText().toString();
                if (!b.equals("Locked")) {
                    Intent intent1 = new Intent(this_, GameScreen.class);
                    intent1.putExtra("lol", button124.getText().toString());
                    setResult(RESULT_OK, intent1);
                    finish();
                }
            }
        };
        button124.setOnClickListener(listener124);

        final Button button125 = (Button) findViewById(R.id.bin30);
        View.OnClickListener listener125 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = button125.getText().toString();
                if (!b.equals("Locked")) {
                    Intent intent1 = new Intent(this_, GameScreen.class);
                    intent1.putExtra("lol", button125.getText().toString());
                    setResult(RESULT_OK, intent1);
                    finish();
                }
            }
        };
        button125.setOnClickListener(listener125);

        final Button button126 = (Button) findViewById(R.id.bin31);
        View.OnClickListener listener126 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = button126.getText().toString();
                if (!b.equals("Locked")) {
                    Intent intent1 = new Intent(this_, GameScreen.class);
                    intent1.putExtra("lol", button126.getText().toString());
                    setResult(RESULT_OK, intent1);
                    finish();
                }
            }//6
        };
        button126.setOnClickListener(listener126);

        final Button button127 = (Button) findViewById(R.id.bin32);
        View.OnClickListener listener127 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = button127.getText().toString();
                if (!b.equals("Locked")) {
                    Intent intent1 = new Intent(this_, GameScreen.class);
                    intent1.putExtra("lol", button127.getText().toString());
                    setResult(RESULT_OK, intent1);
                    finish();
                }
            }
        };
        button127.setOnClickListener(listener127);

        final Button button128 = (Button) findViewById(R.id.bin33);
        View.OnClickListener listener128 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = button128.getText().toString();
                if (!b.equals("Locked")) {
                    Intent intent1 = new Intent(this_, GameScreen.class);
                    intent1.putExtra("lol", button128.getText().toString());
                    setResult(RESULT_OK, intent1);
                    finish();
                }
            }
        };
        button128.setOnClickListener(listener128);

        final Button button129 = (Button) findViewById(R.id.bin34);
        View.OnClickListener listener129 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = button129.getText().toString();
                if (!b.equals("Locked")) {
                    Intent intent1 = new Intent(this_, GameScreen.class);
                    intent1.putExtra("lol", button129.getText().toString());
                    setResult(RESULT_OK, intent1);
                    finish();
                }
            }
        };
        button129.setOnClickListener(listener129);
    }
}