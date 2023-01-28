package com.example.contractorcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String taxpercent = getString(R.string.taxConstant);

        Button calculateButton = (Button) findViewById(R.id.button);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                EditText laborText = findViewById(R.id.editTextNumberDecimal2);
                EditText materialsText = findViewById(R.id.editTextNumberDecimal3);

                Double laborCost = new Double(laborText.getText().toString());
                Double materialsCost = new Double(materialsText.getText().toString());

                Double Subtotal = laborCost + materialsCost;
                Double taxValue = (new Double(taxpercent)/100) * Subtotal;
                Double Total = Subtotal + taxValue;

                TextView subTotalTextView = findViewById(R.id.textView4);
                subTotalTextView.setText(""+Subtotal);
                TextView taxTextView = findViewById(R.id.textView6);
                taxTextView.setText(""+taxValue);
                TextView totalTextView = findViewById(R.id.textView8);
                totalTextView.setText(""+Total);
            }
        });
    }

}