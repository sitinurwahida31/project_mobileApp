package com.example.mycanteen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Splashscreen();
    }

    void  Splashscreen(){
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent moveSecond = new Intent(SplashScreen.this, SplashScreen2.class);
                startActivity(moveSecond);
                finish();
            }
        }, 2000);
    }
}