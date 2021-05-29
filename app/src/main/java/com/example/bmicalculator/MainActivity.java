package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText Height;
    private EditText Weight;

    private Button bmiCalc;

    private TextView result;

    double finalResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bmiCalc = findViewById(R.id.bmiCalc);
        Height = findViewById(R.id.Height);
        Weight = findViewById(R.id.Weight);
        result = findViewById(R.id.result);

        bmiCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double height = Double.parseDouble(Height.getText().toString());
                double weight = Double.parseDouble(Weight.getText().toString());

                finalResult = weight / (height * height);

                result.setText(String.valueOf(finalResult));
            }
        });
    }
}