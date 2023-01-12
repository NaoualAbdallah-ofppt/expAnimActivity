package com.example.expanimactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       btn=(Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent itt = new Intent(MainActivity.this,MainActivity2.class);
          startActivity(itt);
        //  overridePendingTransition(R.anim.animation,R.anim.animation2);
          //pour appliquer une animation à toutes les activités
          //il faut créer un style
               //voir exemple dans theme.xml

           }
       });
    }

}