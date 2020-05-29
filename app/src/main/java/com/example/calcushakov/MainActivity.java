package com.example.calcushakov;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
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
    private Button clearField;
    private Button changeAction;
    private Button percent;
    private Button division;
    private Button multiplication;
    private Button plus;
    private Button minus;
    private Button equal;
    private TextView textView;
    private Button switchMode;
    private FrameLayout basicMode;
    private FrameLayout engMode;



    private Float Value1;
    private Float Value2;

    boolean percentBool, divisionBool, multiplicationBool, plusBool, minusBool;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        setContentView(R.layout.activity_main);



        init();
    }

    private void init() {
        buttonOne = findViewById(R.id.engButtonOne);
        buttonOne.setOnClickListener(this);
        buttonTwo = findViewById(R.id.engButtonTwo);
        buttonTwo.setOnClickListener(this);
        buttonThree = findViewById(R.id.engButtonThree);
        buttonThree.setOnClickListener(this);
        buttonFour = findViewById(R.id.engButtonFour);
        buttonFour.setOnClickListener(this);
        buttonFive = findViewById(R.id.engButtonFive);
        buttonFive.setOnClickListener(this);
        buttonSix = findViewById(R.id.engButtonSix);
        buttonSix.setOnClickListener(this);
        buttonSeven = findViewById(R.id.engButtonSeven);
        buttonSeven.setOnClickListener(this);
        buttonEight = findViewById(R.id.engButtonEight);
        buttonEight.setOnClickListener(this);
        buttonNine = findViewById(R.id.engButtonNine);
        buttonNine.setOnClickListener(this);
        buttonDot = findViewById(R.id.engButtonDot);
        buttonDot.setOnClickListener(this);
        buttonNull = findViewById(R.id.engButtonNull);
        buttonNull.setOnClickListener(this);
        clearField = findViewById(R.id.engClearField);
        clearField.setOnClickListener(this);
        percent = findViewById(R.id.percent);
        division = findViewById(R.id.division);
        multiplication = findViewById(R.id.multiplication);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        equal = findViewById(R.id.equal);
        textView = findViewById(R.id.textView);
        basicMode = findViewById(R.id.basicMode);
        engMode = findViewById(R.id.engineeringMode);
        switchMode = findViewById(R.id.switchMode);


    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonOne:
                textView.setText(textView.getText() + "1");
                break;
            case R.id.buttonTwo:
                textView.setText(textView.getText() + "2");
                break;
            case R.id.buttonThree:
                textView.setText(textView.getText() + "3");
                break;
            case R.id.buttonFour:
                textView.setText(textView.getText() + "4");
                break;
            case R.id.buttonFive:
                textView.setText(textView.getText() + "5");
                break;
            case R.id.buttonSix:
                textView.setText(textView.getText() + "6");
                break;
            case R.id.buttonSeven:
                textView.setText(textView.getText() + "7");
                break;
            case R.id.buttonEight:
                textView.setText(textView.getText() + "8");
                break;
            case R.id.buttonNine:
                textView.setText(textView.getText() + "9");
                break;
            case R.id.buttonDot:
                textView.setText(textView.getText() + ",");
                break;
            case R.id.buttonNull:
                textView.setText(textView.getText() + "0");
                break;
            case R.id.clearField:
                textView.setText("");
                Value1 = 0.0f;
                Value2 = 0.0f;
                break;

        }
    }


}
