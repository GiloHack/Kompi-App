package com.example.kompiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResetPinActivity extends AppCompatActivity {

    EditText email;
    Button generate;
    TextView backtolog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_pin);

        email = (EditText) findViewById(R.id.resp);
        generate = (Button) findViewById(R.id.gpin);
        backtolog = (TextView) findViewById(R.id.b2lg);

        backtolog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ResetPinActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}