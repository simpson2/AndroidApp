package com.example.saulius.app1;

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

    public void showToast(View view) {

        EditText inputMessage = findViewById(R.id.textMessage);
        String tMessage = inputMessage.getText().toString();

        if(tMessage.equals("")) {
            Toast.makeText(this, "Please enter text before proceeding.", Toast.LENGTH_SHORT).show();
        }
    }
}
