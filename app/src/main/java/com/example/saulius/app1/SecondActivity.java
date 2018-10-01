package com.example.saulius.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showText();

    }

    public void showText() {

        TextView dispText = findViewById(R.id.dispText);
        String s = getIntent().getStringExtra(MainActivity.TEXT_OUT);

        dispText.setText(s);
    }
}
