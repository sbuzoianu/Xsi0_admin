package com.example.buzoianustefan.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        ConstraintLayout display = findViewById(R.id.DisplayMessageLayout);

        Integer number = Integer.parseInt(message);
        Boolean isPrime = isPrimeNumber(number);
        if (isPrime) {
            display.setBackgroundColor(Color.GREEN);
        }
        else {
            display.setBackgroundColor(Color.RED);

        }
        TextView textView = findViewById(R.id.textView);
        textView.setText(isPrime.toString());

    }

    public boolean isPrimeNumber(int number) {

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
