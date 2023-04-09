package com.example.mynewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class practicing extends AppCompatActivity {
    private Button butn1,butn2,butn3,butn4,butn5,butn6,butn7,butn8,butn9;
    private boolean flag=true;
    private boolean check_game=false;

    private TextView T;

    private TextView Won;

    TextView O,X;
    private  int butn_count=0;
    private static int x=0,o=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practicing);
        initcomponent();
        turnset();
        getSupportActionBar().setTitle("Tic Tac Toe");
        winingcreteria();
        game_draw();
        wincount();
    }

    private void turnset() {
        if(flag){
            T.setText("X turn");
        }
        else{
            T.setText("0 turn");
        }
    }

    public void wincount(){
        X.setText("X: "+x);
        O.setText("O: "+o);
    }

    private void initcomponent() {
       butn1=findViewById(R.id.btn1);
        butn2=findViewById(R.id.btn2);
        butn3=findViewById(R.id.btn3);
        butn4=findViewById(R.id.btn4);
        butn5=findViewById(R.id.btn5);
        butn6=findViewById(R.id.btn6);
        butn7=findViewById(R.id.btn7);
        butn8=findViewById(R.id.btn8);
        butn9=findViewById(R.id.btn9);
        T=findViewById(R.id.turn);
        Won=findViewById(R.id.gamewon);
        O=findViewById(R.id.o);
        X=findViewById(R.id.x);

    }

    public void game_draw(){
        if(check_game==false&&butn_count>=9){
            Won.setText("Game is Draw");
            butn_count=0;
            resetGame();
        }
    }

    public void winingcreteria(){

        if(butn1.getText()=="X"&&butn2.getText()=="X"&&butn3.getText()=="X" ){
            Won.setText("X is Win");
            x++;
            check_game= true;
            resetGame();
        }
        else if(butn1.getText()=="O"&&butn2.getText()=="O"&&butn3.getText()=="O" ){
            Won.setText("O is Win");
            o++;
            check_game= true;
            resetGame();
        }
        if(butn4.getText()=="X"&&butn5.getText()=="X"&&butn6.getText()=="X" ){
            Won.setText("X is Win");
            x++;
            check_game= true;
            resetGame();
        }
        else if(butn4.getText()=="O"&&butn5.getText()=="O"&&butn6.getText()=="O" ){
            Won.setText("O is Win");
            o++;
            check_game= true;
            resetGame();
        }
        if(butn7.getText()=="X"&&butn8.getText()=="X"&&butn9.getText()=="X" ){
            Won.setText("X is Win");
            x++;
            check_game= true;
            resetGame();
        }
        else if(butn7.getText()=="O"&&butn8.getText()=="O"&&butn9.getText()=="O" ){
            Won.setText("O is Win");

            o++;
            check_game= true;
            resetGame();
        }
        if(butn1.getText()=="X"&&butn4.getText()=="X"&&butn7.getText()=="X" ){
            Won.setText("X is Win");
            x++;
            check_game= true;
            resetGame();
        }
        else if(butn1.getText()=="O"&&butn4.getText()=="O"&&butn7.getText()=="O" ){
            Won.setText("O is Win");

            o++;
            check_game= true;
            resetGame();
        }
        if(butn2.getText()=="X"&&butn5.getText()=="X"&&butn8.getText()=="X" ){
            Won.setText("X is Win");
            x++;
            check_game= true;
            resetGame();
        }
        else if(butn2.getText()=="O"&&butn5.getText()=="O"&&butn8.getText()=="O" ){
            Won.setText("O is Win");

            o++;
            check_game= true;
            resetGame();
        }
        if(butn3.getText()=="X"&&butn6.getText()=="X"&&butn9.getText()=="X" ){
            Won.setText("X is Win");
            x++;
            check_game= true;
            resetGame();
        }
        else if(butn3.getText()=="O"&&butn6.getText()=="O"&&butn9.getText()=="O" ){
            Won.setText("O is Win");
            o++;
            check_game= true;
            resetGame();
        }
        if(butn1.getText()=="X"&&butn5.getText()=="X"&&butn9.getText()=="X" ){
            Won.setText("X is Win");
            x++;
            check_game= true;
            resetGame();
        }
        else if(butn1.getText()=="O"&&butn5.getText()=="O"&&butn9.getText()=="O" ){
            Won.setText("O is Win");
            o++;
            check_game= true;
            resetGame();
        }
        if(butn3.getText()=="X"&&butn5.getText()=="X"&&butn7.getText()=="X" ){
            Won.setText("X is Win");
            x++;
            check_game= true;
            resetGame();
        }
        else if(butn3.getText()=="O"&&butn5.getText()=="O"&&butn7.getText()=="O" ){
            Won.setText("O is Win");
            o++;
            check_game= true;
            resetGame();
        }
    }

    public void resetGame(){
        butn1.setText("---");
        butn2.setText("---");
        butn3.setText("---");
        butn4.setText("---");
        butn5.setText("---");
        butn6.setText("---");
        butn7.setText("---");
        butn8.setText("---");
        butn9.setText("---");
    }
    public void Click_function(View view) {
///Button Response
        if (view.getId() == butn1.getId()) {
            if (butn1.getText().toString().equals("---") && flag == true) {
                butn1.setText("X");
                flag = false;
                turnset();
                butn_count++;
            }
            if (butn1.getText().toString().equals("---") && flag == false) {
                butn1.setText("O");
                flag = true;
                turnset();
                butn_count++;
            }
        }
        if (view.getId() == butn2.getId()) {
            if (butn2.getText().toString().equals("---") && flag == true) {
                T.setText("X turn");
                butn2.setText("X");
                flag = false;
                turnset();
                butn_count++;
            }
            if (butn2.getText().toString().equals("---") && flag == false) {
                T.setText("O turn");
                butn2.setText("O");
                flag = true;
                turnset();
                butn_count++;
            }
        }
        if (view.getId() == butn3.getId()) {
            if (butn3.getText().toString().equals("---") && flag == true) {
                T.setText("X turn");
                butn3.setText("X");
                flag = false;
                turnset();
                butn_count++;
            }
            if (butn3.getText().toString().equals("---") && flag == false) {
                T.setText("O turn");
                butn3.setText("O");
                flag = true;
                turnset();
                butn_count++;
            }
        }
        if (view.getId() == butn4.getId()) {
            if (butn4.getText().toString().equals("---") && flag == true) {
                T.setText("X turn");
                butn4.setText("X");
                flag = false;
                turnset();
                butn_count++;
            }
            if (butn4.getText().toString().equals("---") && flag == false) {
                T.setText("O turn");
                butn4.setText("O");
                flag = true;
                turnset();
                butn_count++;
            }
        }
        if (view.getId() == butn5.getId()) {
            if (butn5.getText().toString().equals("---") && flag == true) {
                butn5.setText("X");
                flag = false;
                turnset();
                butn_count++;
            }
            if (butn5.getText().toString().equals("---") && flag == false) {
                butn5.setText("O");
                flag = true;
                turnset();
                butn_count++;
            }
        }
        if (view.getId() == butn6.getId()) {
            if (butn6.getText().toString().equals("---") && flag == true) {
                butn6.setText("X");
                flag = false;
                turnset();
                butn_count++;
            }
            if (butn6.getText().toString().equals("---") && flag == false) {
                butn6.setText("O");
                flag = true;
                turnset();
                butn_count++;
            }
        }
        if (view.getId() == butn7.getId()) {
            if (butn7.getText().toString().equals("---") && flag == true) {
                butn7.setText("X");
                flag = false;
                turnset();
                butn_count++;
            }
            if (butn7.getText().toString().equals("---") && flag == false) {
                butn7.setText("O");
                flag = true;
                turnset();
                butn_count++;
            }
        }
        if (view.getId() == butn8.getId()) {
            if (butn8.getText().toString().equals("---") && flag == true) {
                butn8.setText("X");
                flag = false;
                turnset();
                butn_count++;
            }
            if (butn8.getText().toString().equals("---") && flag == false) {
                butn8.setText("O");
                flag = true;
                turnset();
                butn_count++;
            }
        }
        if (view.getId() == butn9.getId()) {
            if (butn9.getText().toString().equals("---") && flag == true) {
                butn9.setText("X");
                flag = false;
                turnset();
                butn_count++;
            }
            if (butn9.getText().toString().equals("---") && flag == false){
                butn9.setText("O");
                flag = true;
                turnset();
                butn_count++;
            }
        }
        /////Winning Criteria
        winingcreteria();
        game_draw();
        wincount();

    }
}