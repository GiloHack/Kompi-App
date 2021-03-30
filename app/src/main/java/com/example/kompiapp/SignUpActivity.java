package com.example.kompiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.firestore.FirebaseFirestore;


public class SignUpActivity extends AppCompatActivity {

    EditText fullname, email, pin;
    Button createAccount;
    TextView backtoLogin;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

            fullname = (EditText) findViewById(R.id.crname);
            email = (EditText) findViewById(R.id.cremail);
            pin = (EditText) findViewById(R.id.crpin);
            createAccount = (Button) findViewById(R.id.crbtn);
            backtoLogin = (TextView) findViewById(R.id.b2lg);

            backtoLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(SignUpActivity.this, LoginActivity.class);
                    startActivity(i);
                    finish();
                }
            });

    }
}