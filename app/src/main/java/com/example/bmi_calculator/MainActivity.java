package com.example.bmi_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText EHeight, EWeight;
    private TextView tvOutput;
    private Button btnCom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EHeight = findViewById(R.id.etHeight);
        EWeight = findViewById(R.id.etWeight);
        btnCom = findViewById(R.id.btnCompute);
        tvOutput = findViewById(R.id.tvOutput);

        btnCom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double height = Double.parseDouble(EHeight.getText().toString());
                double weight = Double.parseDouble(EWeight.getText().toString());

                BMIModel bmi = new BMIModel();
                bmi.setHeight(height);
                bmi.setWeight(weight);
                double res = bmi.BMI();

                tvOutput.setText(Double.toString(res) + "  kg/m^2");

                if(res<18.5){
                    Toast.makeText(MainActivity.this,"Underweight",Toast.LENGTH_LONG).show();
                }else if(res>=18.5 && res<=24.9){
                    Toast.makeText(MainActivity.this,"Normalweight",Toast.LENGTH_LONG).show();
                }else if(res>=25 && res<=29.9){
                    Toast.makeText(MainActivity.this,"Overweight",Toast.LENGTH_LONG).show();
                }else if(res>=30){
                    Toast.makeText(MainActivity.this,"Obesity",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

