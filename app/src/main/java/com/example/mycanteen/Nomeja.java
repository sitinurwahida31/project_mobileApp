package com.example.mycanteen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Nomeja extends AppCompatActivity {
    private Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nomeja);
    }
    public void btn_login(View view) {
        Intent intent = new Intent(Nomeja.this, SplashScreen.class);
        startActivity(intent);
    }
}