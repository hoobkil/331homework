package com.example.calcushakov;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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
    private Button clearField;
    private Button changeAction;
    private Button percent;
    private Button division;
    private Button multiplication;
    private Button plus;
    private Button minus;
    private Button equal;
    private TextView textView;


    private Float Value1;
    private Float Value2;

    boolean percentBool, divisionBool, multiplicationBool, plusBool, minusBool;


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
        clearField = findViewById(R.id.clearField);
        clearField.setOnClickListener(this);
        changeAction = findViewById(R.id.changeAction);
        changeAction.setOnClickListener(this);
        percent = findViewById(R.id.percent);
        division = findViewById(R.id.division);
        multiplication = findViewById(R.id.multiplication);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        equal = findViewById(R.id.equal);
        textView = findViewById(R.id.textView);

        equal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Value2 = Float.parseFloat(textView.getText() + "");

                if (plusBool) {
                    textView.setText(Value1 + Value2 + "");
                    plusBool = false;
                } else if (minusBool) {
                    textView.setText(Value1-Value2+"");
                    minusBool = false;
                } else if (percentBool) {
                    textView.setText(":(");
                    percentBool = false;
                } else if (divisionBool) {
                    textView.setText(Value1/Value2+"");
                    divisionBool = false;
                } else if (multiplicationBool) {
                    textView.setText(Value1*Value2+"");
                    multiplicationBool = false;
                }



            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(textView.getText() + "");
                plusBool = true;
                textView.setText("");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(textView.getText() + "");
                minusBool = true;
                textView.setText("");
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(textView.getText() + "");
                divisionBool = true;
                textView.setText("");
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(textView.getText() + "");
                multiplicationBool = true;
                textView.setText("");
            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Не работает");
            }
        });


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
