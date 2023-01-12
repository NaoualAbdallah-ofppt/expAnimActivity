package com.example.expanimactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itt = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(itt);
               // overridePendingTransition(R.anim.animation3,R.anim.animation4);
                //pour appliquer une animation à toutes les activités
                //il faut créer un style
                //voir exemple dans theme.xml

            }
        });
    }


//en appuyant sur précédent
    @Override
    public void finish() {
        super.finish();
        //overridePendingTransition(R.anim.animation2,R.anim.animation);
    }
}