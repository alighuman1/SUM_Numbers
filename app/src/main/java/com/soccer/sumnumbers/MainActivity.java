package com.soccer.sumnumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              EditText number1= findViewById(R.id.editTextNumber);
                EditText number2= findViewById(R.id.editTextNumber2);
                int n1=Integer.parseInt(String.valueOf(number1));
                int n2=Integer.parseInt(String.valueOf(number2));
                int sum=n1+n2;
               TextView textView= findViewById(R.id.textView);
               textView.setText(String.valueOf(sum));
            }
        });

    }
}