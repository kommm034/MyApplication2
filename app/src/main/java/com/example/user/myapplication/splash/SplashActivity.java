package com.example.user.myapplication.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.user.myapplication.Index.MainActivity;
import com.example.user.myapplication.R;

public class SplashActivity extends Activity {
    Handler hadler;
    Runnable runrable;
    long delay_time;
    long time = 3000L;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        hadler = new Handler();
        runrable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        };

    }
    public void onResume(){
        super.onResume();
        delay_time = time;
        hadler.postDelayed(runrable,delay_time);
        time = System.currentTimeMillis();
    }
    public void onPause(){
        super.onPause();
        hadler.removeCallbacks(runrable);
        time = delay_time-(System.currentTimeMillis()-time);

    }
}
