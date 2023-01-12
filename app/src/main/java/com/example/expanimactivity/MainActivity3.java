package com.example.expanimactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    //en appuyant sur précédent
    @Override
    public void finish() {
        super.finish();
      //  overridePendingTransition(R.anim.animation3,R.anim.animation4);
    }
}