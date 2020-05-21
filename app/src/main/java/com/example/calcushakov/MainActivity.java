package com.example.calcushakov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;
    private Button buttonFour;
    private Button buttonFive;
    private Button buttonSix;
    private Button buttonSeven;
    private Button buttonEight;
    private Button buttonNine;
    private Button buttonNull;
    private Button buttonDot;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        buttonOne = findViewById(R.id.buttonOne);
        buttonOne.setOnClickListener(this);
        buttonTwo = findViewById(R.id.buttonTwo);
        buttonTwo.setOnClickListener(this);
        buttonThree = findViewById(R.id.buttonThree);
        buttonThree.setOnClickListener(this);
        buttonFour = findViewById(R.id.buttonFour);
        buttonFour.setOnClickListener(this);
        buttonFive = findViewById(R.id.buttonFive);
        buttonFive.setOnClickListener(this);
        buttonSix = findViewById(R.id.buttonSix);
        buttonSix.setOnClickListener(this);
        buttonSeven = findViewById(R.id.buttonSeven);
        buttonSeven.setOnClickListener(this);
        buttonEight = findViewById(R.id.buttonEight);
        buttonEight.setOnClickListener(this);
        buttonNine = findViewById(R.id.buttonNine);
        buttonNine.setOnClickListener(this);
        buttonDot = findViewById(R.id.buttonDot);
        buttonDot.setOnClickListener(this);
        buttonNull = findViewById(R.id.buttonNull);
        buttonNull.setOnClickListener(this);
        textView = findViewById(R.id.textView);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonOne:
                textView.append("1");
                break;
            case R.id.buttonTwo:
                textView.append("2");
                break;
            case R.id.buttonThree:
                textView.append("3");
                break;
            case R.id.buttonFour:
                textView.append("4");
                break;
            case R.id.buttonFive:
                textView.append("5");
                break;
            case R.id.buttonSix:
                textView.append("6");
                break;
            case R.id.buttonSeven:
                textView.append("7");
                break;
            case R.id.buttonEight:
                textView.append("8");
                break;
            case R.id.buttonNine:
                textView.append("9");
                break;
            case R.id.buttonDot:
                textView.append(",");
                break;
            case R.id.buttonNull:
                textView.append("0");
                break;


        }
    }
}
