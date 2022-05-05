package com.example.alphabetconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText input;
    TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button);
        input=(EditText) findViewById(R.id.input);
        output = (TextView) findViewById(R.id.output);
    }

    public void convertAlphabet(View view) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char ch = input.getText().toString().charAt(0);
        String s = Character.toString(ch);
        boolean res = str.contains(s);
        if (res)
            output.setText("Result : " + s.toLowerCase());
        else {
            output.setText("Result : " + s.toUpperCase());
        }


    }
}