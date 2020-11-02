package com.example.projektas3pilnas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mc, mr, ms, mplus, mminus, arrow, ce, c, plusminus, dot, root, division, procent, multiplication, minus, addition, onex, equals, Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine;

    TextView ShowOperations;

    float mValueOne, mValueTwo;
    
    boolean rootValue, divisionValue, procentValue, multiplicationValue, minusValue, additionValue, onexValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mc = (Button) findViewById(R.id.MC);
        mr = (Button) findViewById(R.id.MR);
        ms = (Button) findViewById(R.id.MS);
        mplus = (Button) findViewById(R.id.Mplus);
        mminus = (Button) findViewById(R.id.Mminus);
        arrow = (Button) findViewById(R.id.Delete);
        ce = (Button) findViewById(R.id.CE);
        c = (Button) findViewById(R.id.C);
        plusminus = (Button) findViewById(R.id.ValueChange);
        onex = (Button) findViewById(R.id.Squared);
        dot = (Button) findViewById(R.id.Dot);
        root = (Button) findViewById(R.id.SquareRoot);
        division = (Button) findViewById(R.id.Division);
        procent = (Button) findViewById(R.id.Procent);
        multiplication = (Button) findViewById(R.id.Multiplication);
        minus = (Button) findViewById(R.id.Subtraction);
        addition = (Button) findViewById(R.id.Addition);
        equals = (Button) findViewById(R.id.Equals);
        Zero = (Button) findViewById(R.id.Zero);
        One = (Button) findViewById(R.id.One);
        Two = (Button) findViewById(R.id.Two);
        Three = (Button) findViewById(R.id.Three);
        Four = (Button) findViewById(R.id.Four);
        Five = (Button) findViewById(R.id.Five);
        Six = (Button) findViewById(R.id.Six);
        Seven = (Button) findViewById(R.id.Seven);
        Eight = (Button) findViewById(R.id.Eight);
        Nine = (Button) findViewById(R.id.Nine);
        ShowOperations = (TextView) findViewById(R.id.ShowOperations);

        //Button listeners
        Zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowOperations.setText(ShowOperations.getText() + "0");
            }
        });
        One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowOperations.setText(ShowOperations.getText() + "1");
            }
        });
        Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowOperations.setText(ShowOperations.getText() + "2");
            }
        });
        Three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowOperations.setText(ShowOperations.getText() + "3");
            }
        });
        Four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowOperations.setText(ShowOperations.getText() + "4");
            }
        });
        Five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowOperations.setText(ShowOperations.getText() + "5");
            }
        });
        Six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowOperations.setText(ShowOperations.getText() + "6");
            }
        });
        Seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowOperations.setText(ShowOperations.getText() + "7");
            }
        });
        Eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowOperations.setText(ShowOperations.getText() + "8");
            }
        });
        Nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowOperations.setText(ShowOperations.getText() + "9");
            }
        });
    }
}