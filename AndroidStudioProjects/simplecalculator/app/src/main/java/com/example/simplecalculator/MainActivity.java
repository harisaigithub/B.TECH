package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);

    }

    public void addition(View view) {
        int a = Integer.parseInt(et1.getText().toString());
        int b = Integer.parseInt(et2.getText().toString());
        int c = a + b;
        tv.setText("c");
    }

    public void subtraction(View view) {
        int a = Integer.parseInt(et1.getText().toString());
        int b = Integer.parseInt(et2.getText().toString());
        int c = a - b;
        tv.setText("c");
    }

    public void multiplication(View view) {
        int a = Integer.parseInt(et1.getText().toString());
        int b = Integer.parseInt(et2.getText().toString());
        int c = a * b;
        tv.setText("c");
    }

    public void division(View view) {
        int a = Integer.parseInt(et1.getText().toString());
        int b = Integer.parseInt(et2.getText().toString());
        int c = a / b;
        tv.setText("c");
    }

    public void modulus(View view) {
        int a = Integer.parseInt(et1.getText().toString());
        int b = Integer.parseInt(et2.getText().toString());
        int c = a % b;
        tv.setText("c");
    }
}