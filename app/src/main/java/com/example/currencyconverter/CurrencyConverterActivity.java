package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CurrencyConverterActivity extends AppCompatActivity {

    TextView textView;
    double taka=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);

        textView = findViewById(R.id.textView);

        String currency = getIntent().getStringExtra("currency");

        if (currency.equals("USDollar")){

            taka = Double.parseDouble(getIntent().getStringExtra("value"))*85;
            textView.setText(getIntent().getStringExtra("value")+" US Dollar Equals "+taka+" Bangladeshi Taka");

        }else if (currency.equals("BritishPound")){
            taka = Double.parseDouble(getIntent().getStringExtra("value"))*118;
            textView.setText(getIntent().getStringExtra("value")+" British Pound Equals "+taka+" Bangladeshi Taka");

        }else if (currency.equals("Euro")){
            taka = Double.parseDouble(getIntent().getStringExtra("value"))*101;
            textView.setText(getIntent().getStringExtra("value")+" Euro Equals "+taka+" Bangladeshi Taka");

        }


    }


}