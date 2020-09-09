package com.example.caloriecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Burger b;
    private TextView caloriesTV, sauceCalTV;
    private RadioGroup pattyG;
    private RadioButton veggie1, veggie2, veggie3;
    private CheckBox c;
    private SeekBar s;
    private double saucee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = new Burger();
        caloriesTV = (TextView) findViewById(R.id.calTV);
        pattyG = (RadioGroup) findViewById(R.id.pattyGroup);
        veggie1 = (RadioButton) findViewById(R.id.veggie1B);
        veggie2 = (RadioButton) findViewById(R.id.veggie2B);
        veggie3 = (RadioButton) findViewById(R.id.veggie3B);
        c = (CheckBox) findViewById(R.id.cheeseCB);
        s = (SeekBar) findViewById(R.id.sauceSB);
        sauceCalTV = (TextView) findViewById(R.id.sauceTV);
        saucee = 0.0;

        pattyG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.patty1B:
                        b.setPatty(Burger.PATTY1);
                        break;
                    case R.id.patty2B:
                        b.setPatty(Burger.PATTY2);
                        break;
                    case R.id.patty3B:
                        b.setPatty(Burger.PATTY3);
                        break;
                }
                displayCal();
            }
        });


        s.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                double sCal = (double) (s.getProgress() * 0.01 * 300);
                sauceCalTV.setText(String.valueOf(sCal));
                saucee = sCal;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                b.setSauce(saucee);
                displayCal();
            }
        });


    }

    public void displayCal(){
        String temp = String.valueOf("Calories: " + b.getCals());
        caloriesTV.setText(temp);
    }

    public void checkCheese(View view){
        b.yesNoCheese();
        displayCal();
    }

    public void checkVeggie1(View view){
        b.yesNoVeggie1();
        displayCal();
    }
    public void checkVeggie2(View view){
        b.yesNoVeggie2();
        displayCal();
    }
    public void checkVeggie3(View view){
        b.yesNoVeggie3();
        displayCal();
    }

}