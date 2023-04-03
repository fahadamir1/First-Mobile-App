package com.example.mynewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cash_er extends AppCompatActivity {

    TextView T,T1,T2,T3,T4;
    Button B;
    EditText X;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cash_er);
        init_components();
        settingup_listner3();
    }

    private void settingup_listner3() {
        B.setOnClickListener(view -> {
            int x;
            x=Integer.parseInt(X.getText().toString());
            int hun_count=0;
            int fif_count = 0;
            int ten_count = 0;
            int one_count = 0;
            while (x != 0) {
                if (x >= 100) {
                    x = x - 100;
                    hun_count++;
                    continue;
                } else if (x < 100 && x>=50) {
                    x = x - 50;
                    fif_count++;

                    continue;
                } else if (x < 50 && x>=10) {
                    x = x - 10;
                    ten_count++;
                    continue;
                } else if (x < 10 && x >= 1) {
                    x = x - 1;
                    one_count++;
                    continue;
                } else if (x == 0) {
                    break;
                }

            }
            int total=hun_count+fif_count+ten_count+one_count;
T.setText("Note of 100: "+hun_count);
T1.setText("Note of 50: "+fif_count);
T2.setText("Note of 10: "+ten_count);
T3.setText("Note of 1: "+one_count);
T4.setText("Total No.of Notes"+total);
        });
    }

    private void init_components() {
        X=findViewById(R.id.string);
        B=findViewById(R.id.convert);
        T=findViewById(R.id.view);
        T1=findViewById(R.id.view1);
        T2=findViewById(R.id.view2);
        T3=findViewById(R.id.view3);
        T4=findViewById(R.id.view4);

    }
}