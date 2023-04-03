package com.example.mynewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView T;
    Button B;
    EditText X;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initcomponents();
        settingup_listners();
    }
     void initcomponents() {
        T=findViewById(R.id.view);
        B=findViewById(R.id.convert);
        X=findViewById(R.id.string);
    }

     void settingup_listners() {
        B.setOnClickListener(view -> {
            int x=Integer.parseInt(X.getText().toString());
            double result;
            result=(x*(1.8));
            result+=32;
            T.setText("Temperature in F: "+(result));
        });
    }


}