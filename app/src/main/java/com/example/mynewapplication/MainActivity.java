package com.example.mynewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num;
    Button btn;
    TextView result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initcomponents();
        SettingUp_listner();

        getSupportActionBar().setTitle("Binary to Decimal");

    }

    @SuppressLint("SetTextI18n")
    void SettingUp_listner() {
        btn.setOnClickListener(view -> {
            int res;
            int decimal = Integer.parseInt(num.getText().toString());
            res = Integer.parseInt(Integer.toBinaryString(decimal));
            result2.setText("Result is :" + res);
        });

    }

    private void initcomponents() {
        num = findViewById(R.id.string);
        btn = findViewById(R.id.convert);
        result2 = findViewById(R.id.view);

    }


    public void openmain1(View view) {
        startActivity(new Intent(this, cm_feet.class));
    }


    public void cashier(View view) {
        startActivity(new Intent(this, Cash_er.class));
    }

    public void Celsius1(View view) {
        startActivity(new Intent(this,MainActivity2.class));
    }

    public void Game(View view) {
        startActivity(new Intent(this,practicing.class));
    }
}

