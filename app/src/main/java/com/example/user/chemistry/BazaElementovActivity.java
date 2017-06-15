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
              button101.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      showElementInfo(getString(R.string.SO2), R.drawable.ferum);

                  }
              });

              Button button102 = (Button) findViewById(R.id.button31);
              button102.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      showElementInfo(getString(R.string.HCl), R.drawable.ferum);

                  }


              });

              Button button103 = (Button) findViewById(R.id.button32);
              button103.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      showElementInfo(getString(R.string.MgO), R.drawable.ferum);

                  }
              });

              Button button104 = (Button) findViewById(R.id.button33);
              button104.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      showElementInfo(getString(R.string.CO2), R.drawable.ferum);

                  }
              });


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