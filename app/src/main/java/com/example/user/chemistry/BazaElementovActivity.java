package com.example.user.chemistry;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.Button;

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