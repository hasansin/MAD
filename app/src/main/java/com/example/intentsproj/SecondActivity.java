package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    double num1;
    double num2;
    double result;

    String r;
    TextView txt_number1;
    TextView txt_number2;
    TextView txt2_answer ;
    TextView txt_num1view;
    TextView txt_num2view;

    Button b_add;
    Button b_subtract;
    Button b_multiply;
    Button b_divide;
    String rf ;    //final result
     String n1 ;
     String n2 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txt_number1 = findViewById(R.id.textView6);
        txt_number2 = findViewById(R.id.textView7);
        txt_num1view = findViewById(R.id.textView3);
        txt_num2view= findViewById(R.id.textView4);
        txt2_answer =findViewById(R.id.textView5);
        b_add =findViewById(R.id.button2);
        b_subtract= findViewById(R.id.button3);
        b_multiply = findViewById(R.id.button4);
        b_divide =findViewById(R.id.button5);


        Intent i = getIntent();
        num1 = i.getDoubleExtra("number1",0);
        num2 = i.getDoubleExtra("number2",0);



        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result = num1 + num2;
                r =   Double.toString(result);
                 n1 = Double.toString(num1);
                 n2 = Double.toString(num2);
                rf = n1+ " + " + n2 +" = " + r;

                 txt2_answer.setText(rf);



                b_subtract.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        result = num1 - num2;
                         r =  Double.toString(result);
                         n1 = Double.toString(num1);
                         n2 = Double.toString(num2);
                        rf = n1+ " - " + n2 +" = " + r;
                        txt2_answer.setText(rf);
                    }
                });

                b_multiply.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        result = num1 * num2;
                         r =  Double.toString(result);
                         n1 = Double.toString(num1);
                         n2 = Double.toString(num2);
                        rf = n1+ " * " + n2 +" = " + r;
                        txt2_answer.setText(rf);
                    }
                });

                b_divide.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        result = num1 / num2;
                         r =  Double.toString(result);
                         n1 = Double.toString(num1);
                         n2 = Double.toString(num2);
                         rf = n1+ " / " + n2 +" = " + r;
                        txt2_answer.setText(rf);
                    }
                });



            }
        });








    }

    @Override
    public void onResume() {
        super.onResume();

         n1 = Double.toString(num1);
         n2 = Double.toString(num2);

        txt_number1.setText(n1);
        txt_number2.setText(n2);
    }



}