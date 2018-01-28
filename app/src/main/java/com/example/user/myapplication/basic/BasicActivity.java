package com.example.user.myapplication.basic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.user.myapplication.Index.MainActivity;
import com.example.user.myapplication.R;
import com.example.user.myapplication.gridview.GridviewActivity;
import com.example.user.myapplication.listview.ListviewActivity;
import com.example.user.myapplication.tabview.TabviewActivity;

public class BasicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        Button grid = (Button) findViewById(R.id.grid);
        Button list = (Button) findViewById(R.id.list);
        Button tab = (Button) findViewById(R.id.tab);
        Button about = (Button) findViewById(R.id.about);

        grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BasicActivity.this, GridviewActivity.class);
                startActivity(intent);


            }
        });

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BasicActivity.this, ListviewActivity.class);
                startActivity(intent);


            }
        });
        tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BasicActivity.this, TabviewActivity.class);
                startActivity(intent);


            }
        });


    }
}
