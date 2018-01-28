package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BasicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        Button basic1 = (Button) findViewById(R.id.basic1);
        Button basic2 = (Button) findViewById(R.id.basic2);

        basic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BasicActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });

        basic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BasicActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });


    }
}
