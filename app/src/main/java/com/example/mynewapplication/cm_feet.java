package com.example.mynewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class cm_feet extends AppCompatActivity {
    EditText string;
    TextView Text;
    Button B;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmtofeet);
        inintcomponent1();
        settingup_listner1();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Centimenter to Feet");

    }

    void settingup_listner1(){
        B.setOnClickListener(view -> {
            float num=Float.parseFloat(string.getText().toString());
            double result=num*(0.0328);
            result=Math.round(result*1000.0)/1000.0;
            Text.setText("Feet: "+result);
        });
    }
    void inintcomponent1(){
        string=findViewById(R.id.string);
        Text=findViewById(R.id.view);
        B=findViewById(R.id.convert);

    }
}