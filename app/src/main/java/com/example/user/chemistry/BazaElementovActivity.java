package com.example.user.chemistry;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;
import android.content.Intent;
import com.example.user.myapplication.R;

      public class BazaElementovActivity extends AppCompatActivity {

          @Override
          protected void onCreate(Bundle savedInstanceState) {
              super.onCreate(savedInstanceState);

              setContentView(R.layout.bazaelementov);
              Button button = (Button) findViewById(R.id.button17);
              button.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      Toast toast =  Toast.makeText(BazaElementovActivity.this, getString(R.string.C), Toast.LENGTH_LONG);
                      toast.setGravity(Gravity.CENTER, 0,160);
                      toast.show();

                  }
              });

              Button button1 = (Button) findViewById(R.id.button18);
              button1.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      Toast toast =  Toast.makeText(BazaElementovActivity.this, getString(R.string.S), Toast.LENGTH_LONG);
                      toast.setGravity(Gravity.CENTER, 0,160);
                      toast.show();

                  }
              });

              Button button2 = (Button) findViewById(R.id.button19);
              button2.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      Toast toast =  Toast.makeText(BazaElementovActivity.this, getString(R.string.О2), Toast.LENGTH_LONG);
                      toast.setGravity(Gravity.CENTER, 0,160);
                      toast.show();

                  }
              });

              Button button3 = (Button) findViewById(R.id.button20);
              button3.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      Toast toast =  Toast.makeText(BazaElementovActivity.this, getString(R.string.Na), Toast.LENGTH_LONG);
                      toast.setGravity(Gravity.CENTER, 0,160);
                      toast.show();

                  }
              });


              Button button4 = (Button) findViewById(R.id.button21);
              button4.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      Toast toast =  Toast.makeText(BazaElementovActivity.this, getString(R.string.Cl), Toast.LENGTH_LONG);
                      toast.setGravity(Gravity.CENTER, 0,160);
                      toast.show();

                  }
              });

              Button button5 = (Button) findViewById(R.id.button22);
              button5.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      Toast toast =  Toast.makeText(BazaElementovActivity.this, getString(R.string.H), Toast.LENGTH_LONG);
                      toast.setGravity(Gravity.CENTER, 0,160);
                      toast.show();

                  }
              });

              Button button6 = (Button) findViewById(R.id.button23);
              button6.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      Toast toast =  Toast.makeText(BazaElementovActivity.this, getString(R.string.Mg), Toast.LENGTH_LONG);
                      toast.setGravity(Gravity.CENTER, 0,160);
                      toast.show();

                  }
              });

              Button button7 = (Button) findViewById(R.id.button24);
              button7.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      Toast toast =  Toast.makeText(BazaElementovActivity.this, getString(R.string.Аl), Toast.LENGTH_LONG);
                      toast.setGravity(Gravity.CENTER, 0,160);
                      toast.show();

                  }
              });

              Button button8 = (Button) findViewById(R.id.button25);
              button8.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      Toast toast =  Toast.makeText(BazaElementovActivity.this, getString(R.string.Cu), Toast.LENGTH_LONG);
                      toast.setGravity(Gravity.CENTER, 0,160);
                      toast.show();

                  }
              });

              Button button9 = (Button) findViewById(R.id.button26);
              button9.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      Toast toast =  Toast.makeText(BazaElementovActivity.this, getString(R.string.Cа), Toast.LENGTH_LONG);
                      toast.setGravity(Gravity.CENTER, 0,160);
                      toast.show();

                  }
              });

              Button button10 = (Button) findViewById(R.id.button27);
              button10.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      Toast toast =  Toast.makeText(BazaElementovActivity.this, getString(R.string.Zn), Toast.LENGTH_LONG);
                      toast.setGravity(Gravity.CENTER, 0,160);
                      toast.show();

                  }
              });

              Button button11 = (Button) findViewById(R.id.button28);
              button11.setOnClickListener(new View.OnClickListener(){

                  @Override
                  public void onClick(View v) {
                      Toast toast =  Toast.makeText(BazaElementovActivity.this, getString(R.string.Fe), Toast.LENGTH_LONG);
                      toast.setGravity(Gravity.CENTER, 0,160);
                      toast.show();

                  }
              });


          }
      };