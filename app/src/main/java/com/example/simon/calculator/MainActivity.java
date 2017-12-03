package com.example.simon.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
              TextView Result;
              EditText Number1,Number2;
              Button add,multiply,substract,divide,factorial;
   float result_num;
   int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Result=(TextView)findViewById(R.id.Result);
        Number1=(EditText) findViewById(R.id.Number1);
        Number2=(EditText) findViewById(R.id.Number2);
        add=(Button) findViewById(R.id.ADD);
        substract=(Button) findViewById(R.id.Substract);
        multiply=(Button) findViewById(R.id.multiply);
        divide=(Button) findViewById(R.id.Divide);




        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(Number1.getText().toString());
                num2=Integer.parseInt(Number2.getText().toString());
                  result_num=num1+num2;
                  Result.setText(String.valueOf(result_num));

            }
        });

        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(Number1.getText().toString());
                num2=Integer.parseInt(Number2.getText().toString());
                result_num=num1-num2;
                Result.setText(String.valueOf(result_num));

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(Number1.getText().toString());
                num2=Integer.parseInt(Number2.getText().toString());
                result_num=num1*num2;
                Result.setText(String.valueOf(result_num));

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(Number1.getText().toString());
                num2=Integer.parseInt(Number2.getText().toString());
                result_num=num1/num2;
                Result.setText(String.valueOf(result_num));

            }
        });

    }
}
