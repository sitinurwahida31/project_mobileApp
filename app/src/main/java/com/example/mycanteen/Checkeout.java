package com.example.mycanteen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Checkeout extends AppCompatActivity {

    Button scanbtn;
    public static TextView scantext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkeout);
        //Total pembayaran
        TextView text = findViewById(R.id.berhasil);
        TextView total1 = findViewById(R.id.total);
        TextView disc = findViewById(R.id.discount);
        TextView bel = findViewById(R.id.belanja);
        Intent intent = getIntent();
        String sum = intent.getStringExtra("Coba");

        int tot = intent.getIntExtra("Bayar", 0);
        int discount = intent.getIntExtra("Discount", 0);
        int belanja = tot - discount;
        text.setText(sum);
        total1.setText("Rp. "+tot);
        disc.setText("Rp. "+discount);
        bel.setText("Rp. "+belanja);

        //QR Code
        scantext =(TextView) findViewById(R.id.scantext);
        scanbtn =(Button) findViewById(R.id.scanbtn);

        scanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),scannerView.class));
            }
        });
    }
    public void finish(View view) {
        Intent intent = new Intent(Checkeout.this, Home.class);
        startActivity(intent);
    }
}