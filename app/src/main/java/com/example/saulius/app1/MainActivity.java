package com.example.saulius.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static final String TEXT_OUT = "text_out";
    public void sendText(View view) {

        EditText inputMessage = findViewById(R.id.Message);
        String message = inputMessage.getText().toString();

        if(message.equals("")) {
            Toast.makeText(this, "Please enter text before proceeding.", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent sendText = new Intent(this, SecondActivity.class);
            sendText.putExtra(TEXT_OUT, message);
            startActivity(sendText);
        }
    }
}
