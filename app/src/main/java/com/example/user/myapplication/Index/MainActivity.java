package com.example.user.myapplication.Index;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.user.myapplication.advance.AdvanceActivity;
import com.example.user.myapplication.basic.BasicActivity;
import com.example.user.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button advance = (Button) findViewById(R.id.advance);
        Button basic = (Button) findViewById(R.id.basic);

        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,BasicActivity.class);
                startActivity(intent);

            }
        });
        advance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AdvanceActivity.class);
                startActivity(intent);

            }
        });
    }
}
