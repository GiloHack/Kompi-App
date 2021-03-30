    package com.example.kompiapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {

    public static int SPLASH_TIME_OUT = 3000;

    private FirebaseAnalytics mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
             Intent i = new Intent(MainActivity.this, LoginActivity.class);
             startActivity(i);
             finish();
           }
       }, SPLASH_TIME_OUT);
    }

}