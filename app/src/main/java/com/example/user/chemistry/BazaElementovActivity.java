package com.example.user.chemistry;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.Button;

import com.example.user.myapplication.R;

      public class BazaElementovActivity extends AppCompatActivity {
          SharedPreferences Pref1;
          @Override
          protected void onCreate(Bundle savedInstanceState) {
              super.onCreate(savedInstanceState);
              setContentView(R.layout.bazaelementov);
              Pref1 = PreferenceManager.getDefaultSharedPreferences(this);
              Button button14 = (Button) findViewById(R.id.button29);
              String a1 = button14.getText().toString();
              String text1= Pref1.getString("H2O" , "");
              if (a1.equals("Locked")) {
                  if (!text1.equals("")){
                      button14.setText("H2O");
                  }
              }
              Button button15 = (Button) findViewById(R.id.button30);
              String a2 = button15.getText().toString();
              String text2= Pref1.getString("SO2" , "");
              if (a2.equals("Locked")) {
                  if (!text2.equals("")){
                      button15.setText("SO2");
                  }
              }
              Button button16 = (Button) findViewById(R.id.button31);
              String a3 = button16.getText().toString();
              String text3= Pref1.getString("HCl" , "");
              if (a3.equals("Locked")) {
                  if (!text3.equals("")){
                      button16.setText("HCl");
                  }
              }
              Button button17 = (Button) findViewById(R.id.button32);
              String a4 = button17.getText().toString();
              String text4= Pref1.getString("MgO" , "");
              if (a4.equals("Locked")) {
                  if (!text4.equals("")){
                      button17.setText("MgO");
                  }
              }
              Button button18 = (Button) findViewById(R.id.button33);
              String a5 = button18.getText().toString();
              String text5 = Pref1.getString("CO2" , "");
              if (a5.equals("Locked")) {
                  if (!text5.equals("")){
                      button18.setText("CO2");
                  }
              }
              Button button19 = (Button) findViewById(R.id.button34);
              String a6 = button19.getText().toString();
              String text6= Pref1.getString("CuO" , "");
              if (a6.equals("Locked")) {
                  if (!text6.equals("")){
                      button19.setText("CuO");
                  }
              }
              Button button20 = (Button) findViewById(R.id.button35);
              String a7 = button20.getText().toString();
              String text7= Pref1.getString("Na2O2" , "");
              if (a7.equals("Locked")) {
                  if (!text7.equals("")){
                      button20.setText("Na2O2");
                  }
              }
              Button button21 = (Button) findViewById(R.id.button36);
              String a8 = button21.getText().toString();
              String text8= Pref1.getString("Na2O" , "");
              if (a8.equals("Locked")) {
                  if (!text8.equals("")){
                      button21.setText("Na2O");
                  }
              }
              Button button22 = (Button) findViewById(R.id.button37);
              String a9 = button22.getText().toString();
              String text9= Pref1.getString("Na2S" , "");
              if (a9.equals("Locked")) {
                  if (!text9.equals("")){
                      button22.setText("Na2S");
                  }
              }
              Button button23 = (Button) findViewById(R.id.button38);
              String a10 = button23.getText().toString();
              String text10 = Pref1.getString("CuCl2" , "");
              if (a10.equals("Locked")) {
                  if (!text10.equals("")){
                      button23.setText("CuCl2");
                  }
              }
              Button button24 = (Button) findViewById(R.id.button39);
              String a11 = button24.getText().toString();
              String text11= Pref1.getString("FeCl" , "");
              if (a11.equals("Locked")) {
                  if (!text11.equals("")){
                      button24.setText("FeCl");
                  }
              }
              Button button25 = (Button) findViewById(R.id.button40);
              String a12 = button25.getText().toString();
              String text12= Pref1.getString("NaOH" , "");
              if (a12.equals("Locked")) {
                  if (!text12.equals("")){
                      button25.setText("NaOH");
                  }
              }
              Button button26 = (Button) findViewById(R.id.button41);
              String a13 = button26.getText().toString();
              String text13 = Pref1.getString("MgCl2" , "");
              if (a13.equals("Locked")) {
                  if (!text13.equals("")){
                      button26.setText("MgCl2");
                  }
              }
              Button button27 = (Button) findViewById(R.id.button42);
              String a14 = button27.getText().toString();
              String text14= Pref1.getString("FeS" , "");
              if (a14.equals("Locked")) {
                  if (!text14.equals("")){
                      button27.setText("FeS");
                  }
              }
              Button button28 = (Button) findViewById(R.id.button43);
              String a15 = button28.getText().toString();
              String text15= Pref1.getString("SO2" , "");
              if (a15.equals("Locked")) {
                  if (!text15.equals("")){
                      button28.setText("SO2");
                  }
              }
              Button button29 = (Button) findViewById(R.id.button44);
              String a16 = button29.getText().toString();
              String text16= Pref1.getString("H2CO3" , "");
              if (a16.equals("Locked")) {
                  if (!text16.equals("")){
                      button29.setText("H2CO3");
                  }
              }
              Button button30 = (Button) findViewById(R.id.button45);
              String a17 = button30.getText().toString();
              String text17= Pref1.getString("ZnCl2" , "");
              if (a17.equals("Locked")) {
                  if (!text17.equals("")){
                      button30.setText("ZnCl2");
                  }
              }
              Button button31 = (Button) findViewById(R.id.button46);
              String a18 = button31.getText().toString();
              String text18 = Pref1.getString("CaO" , "");
              if (a18.equals("Locked")) {
                  if (!text18.equals("")){
                      button31.setText("CaO");
                  }
              }
              Button button32 = (Button) findViewById(R.id.button47);
              String a19 = button32.getText().toString();
              String text19 = Pref1.getString("Al2S3" , "");
              if (a19.equals("Locked")) {
                  if (!text19.equals("")){
                      button32.setText("Al2S3");
                  }
              }
              Button button = (Button) findViewById(R.id.button17);
              button.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      showElementInfo(getString(R.string.C), R.drawable.coal_anthracite);
                  }
              });

              Button button1 = (Button) findViewById(R.id.button18);
              button1.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      showElementInfo(getString(R.string.S), R.drawable.sera);

                  }
              });

              Button button2 = (Button) findViewById(R.id.button19);
              button2.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      showElementInfo(getString(R.string.О2), R.drawable.kislorod);

                  }
              });

              Button button3 = (Button) findViewById(R.id.button20);
              button3.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      showElementInfo(getString(R.string.Na), R.drawable.natrium2);

                  }
              });


              Button button4 = (Button) findViewById(R.id.button21);
              button4.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      showElementInfo(getString(R.string.Cl), R.drawable.clor);

                  }
              });

              Button button5 = (Button) findViewById(R.id.button22);
              button5.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      showElementInfo(getString(R.string.H), R.drawable.vodorod);

                  }
              });

              Button button6 = (Button) findViewById(R.id.button23);
              button6.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      showElementInfo(getString(R.string.Mg), R.drawable.magnij);

                  }
              });

              Button button7 = (Button) findViewById(R.id.button24);
              button7.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      showElementInfo(getString(R.string.Аl), R.drawable.aluminium);

                  }
              });

              Button button8 = (Button) findViewById(R.id.button25);
              button8.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      showElementInfo(getString(R.string.Cu), R.drawable.med2);

                  }
              });

              Button button9 = (Button) findViewById(R.id.button26);
              button9.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      showElementInfo(getString(R.string.Cа), R.drawable.calz);

                  }
              });

              Button button10 = (Button) findViewById(R.id.button27);
              button10.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      showElementInfo(getString(R.string.Zn), R.drawable.zink2);

                  }
              });

              Button button11 = (Button) findViewById(R.id.button28);
              button11.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      showElementInfo(getString(R.string.Fe), R.drawable.ferum);

                  }
              });
              Button button100 = (Button) findViewById(R.id.button29);
              if (!button100.getText().equals("Locked")) {
                  button100.setOnClickListener(new View.OnClickListener() {

                      @Override
                      public void onClick(View v) {
                          showElementInfo(getString(R.string.H2O), R.drawable.ferum);

                      }
                  });
              }
              Button button101 = (Button) findViewById(R.id.button30);
              if (!button101.getText().equals("Locked")) {
                  button101.setOnClickListener(new View.OnClickListener() {

                      @Override
                      public void onClick(View v) {
                          showElementInfo(getString(R.string.SO2), R.drawable.ferum);

                      }
                  });
              }
              Button button102 = (Button) findViewById(R.id.button31);
              if (!button102.getText().equals("Locked")) {
                  button102.setOnClickListener(new View.OnClickListener() {

                      @Override
                      public void onClick(View v) {
                          showElementInfo(getString(R.string.HCl), R.drawable.ferum);

                      }


                  });
              }
              Button button103 = (Button) findViewById(R.id.button32);
              if (!button103.getText().equals("Locked")) {
                  button103.setOnClickListener(new View.OnClickListener() {

                      @Override
                      public void onClick(View v) {
                          showElementInfo(getString(R.string.MgO), R.drawable.ferum);

                      }
                  });
              }
              Button button104 = (Button) findViewById(R.id.button33);
              if (!button104.getText().equals("Locked")) {
                  button104.setOnClickListener(new View.OnClickListener() {

                      @Override
                      public void onClick(View v) {
                          showElementInfo(getString(R.string.CO2), R.drawable.ferum);

                      }
                  });
              }
              Button button105 = (Button) findViewById(R.id.button34);
              if (!button105.getText().equals("Locked")) {
                  button105.setOnClickListener(new View.OnClickListener() {

                      @Override
                      public void onClick(View v) {
                          showElementInfo(getString(R.string.CuO), R.drawable.ferum);

                      }
                  });
              }
              Button button106 = (Button) findViewById(R.id.button35);
              if (!button106.getText().equals("Locked")) {
                  button106.setOnClickListener(new View.OnClickListener() {

                      @Override
                      public void onClick(View v) {
                          showElementInfo(getString(R.string.Na2O2), R.drawable.ferum);

                      }
                  });
              }
              Button button107 = (Button) findViewById(R.id.button36);
              if (!button107.getText().equals("Locked")) {
                  button107.setOnClickListener(new View.OnClickListener() {

                      @Override
                      public void onClick(View v) {
                          showElementInfo(getString(R.string.Na2O), R.drawable.ferum);

                      }


                  });
              }
              Button button108 = (Button) findViewById(R.id.button37);
              if (!button108.getText().equals("Locked")) {
                  button108.setOnClickListener(new View.OnClickListener() {

                      @Override
                      public void onClick(View v) {
                          showElementInfo(getString(R.string.Na2S), R.drawable.ferum);

                      }
                  });
              }
              Button button109 = (Button) findViewById(R.id.button38);
              if (!button109.getText().equals("Locked")) {
                  button109.setOnClickListener(new View.OnClickListener() {

                      @Override
                      public void onClick(View v) {
                          showElementInfo(getString(R.string.CuCl2), R.drawable.ferum);

                      }
                  });
              }
              Button button110 = (Button) findViewById(R.id.button39);
              if (!button110.getText().equals("Locked")) {
                  button110.setOnClickListener(new View.OnClickListener() {

                      @Override
                      public void onClick(View v) {
                          showElementInfo(getString(R.string.FeCl), R.drawable.ferum);

                      }
                  });
              }
              Button button111 = (Button) findViewById(R.id.button40);
              if (!button111.getText().equals("Locked")) {
                  button111.setOnClickListener(new View.OnClickListener() {

                      @Override
                      public void onClick(View v) {
                          showElementInfo(getString(R.string.NaOH), R.drawable.ferum);

                      }
                  });
              }
              Button button112 = (Button) findViewById(R.id.button41);
              if (!button112.getText().equals("Locked")) {
                  button112.setOnClickListener(new View.OnClickListener() {

                      @Override
                      public void onClick(View v) {
                          showElementInfo(getString(R.string.MgCl2), R.drawable.ferum);

                      }


                  });
              }
              Button button113 = (Button) findViewById(R.id.button42);
              if (!button113.getText().equals("Locked")) {
                  button113.setOnClickListener(new View.OnClickListener() {

                      @Override
                      public void onClick(View v) {
                          showElementInfo(getString(R.string.FeS), R.drawable.ferum);

                      }
                  });
              }
              Button button114 = (Button) findViewById(R.id.button43);
              if (!button114.getText().equals("Locked")) {
                  button114.setOnClickListener(new View.OnClickListener() {

                      @Override
                      public void onClick(View v) {
                          showElementInfo(getString(R.string.FeS), R.drawable.ferum);

                      }
                  });
              }
              Button button115 = (Button) findViewById(R.id.button44);
              if (!button115.getText().equals("Locked")) {
                  button115.setOnClickListener(new View.OnClickListener() {

                      @Override
                      public void onClick(View v) {
                          showElementInfo(getString(R.string.H2CO3), R.drawable.ferum);

                      }
                  });
              }
              Button button116 = (Button) findViewById(R.id.button45);
              if (!button116.getText().equals("Locked")) {
                  button116.setOnClickListener(new View.OnClickListener() {

                      @Override
                      public void onClick(View v) {
                          showElementInfo(getString(R.string.ZnCl2), R.drawable.ferum);

                      }
                  });
              }
              Button button117 = (Button) findViewById(R.id.button46);
              if (!button117.getText().equals("Locked")) {
                  button117.setOnClickListener(new View.OnClickListener() {

                      @Override
                      public void onClick(View v) {
                          showElementInfo(getString(R.string.CaO), R.drawable.ferum);

                      }


                  });
              }
              Button button118 = (Button) findViewById(R.id.button47);
              if (!button118.getText().equals("Locked")) {
                  button118.setOnClickListener(new View.OnClickListener() {

                      @Override
                      public void onClick(View v) {
                          showElementInfo(getString(R.string.Al2S3), R.drawable.ferum);

                      }
                  });
              }
          }

          private Toast oldToast = null;

          private void showElementInfo(String name, int image) {

              if (oldToast != null) {
                  oldToast.cancel();
              }

              oldToast = Toast.makeText(BazaElementovActivity.this, name, Toast.LENGTH_LONG);
              oldToast.setGravity(Gravity.CENTER, 0, 160);
              LinearLayout toastContainer = (LinearLayout) oldToast.getView();
              ImageView C1 = new ImageView(getApplicationContext());
              C1.setImageResource(image);
              toastContainer.addView(C1, 0);
              oldToast.show();
          }
      };