package com.example.mycanteen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Chekbox
        //minuman
        final CheckBox boba = findViewById(R.id.Boba);
        final CheckBox esteh = findViewById(R.id.esteh);
        final CheckBox esjeruk = findViewById(R.id.esjeruk);
        final CheckBox mineral = findViewById(R.id.mineral);
        //makanan
        final CheckBox miekuah = findViewById(R.id.miekuah);
        final CheckBox mieayam = findViewById(R.id.mieayam);
        final CheckBox sateayam = findViewById(R.id.sate);
        final CheckBox naskun = findViewById(R.id.naskun);
        final CheckBox Bakso = findViewById(R.id.Bakso);
        final CheckBox gado = findViewById(R.id.gado);
        //snack
        final CheckBox nugget = findViewById(R.id.pisnug);
        final CheckBox donat = findViewById(R.id.donat);
        final CheckBox robarcok = findViewById(R.id.robarcok);
        final CheckBox robarcokju = findViewById(R.id.robarcokju);
        final CheckBox sandwich = findViewById(R.id.sandwich);

        //jumlah minuman
        final EditText jml_boba = findViewById(R.id.jumlahBoba);
        final EditText jml_esteh = findViewById(R.id.jumlahesteh);
        final EditText jml_esjeruk = findViewById(R.id.jumlahesjeruk);
        final EditText jml_mineral = findViewById(R.id.jumlahmineral);
        //jumlah makanan
        final EditText jml_miekuah = findViewById(R.id.jumlahmiekuah);
        final EditText jml_mieayam = findViewById(R.id.jumlahmieayam);
        final EditText jml_sate = findViewById(R.id.jumlahsate);
        final EditText jml_naskun = findViewById(R.id.jumlahnaskun);
        final EditText jml_Bakso = findViewById(R.id.jumlahbakso);
        final EditText jml_gado = findViewById(R.id.jumlahgado);
        //jumlah snack
        final EditText jml_pisnug = findViewById(R.id.jumlahPisnug);
        final EditText jml_donat = findViewById(R.id.jumlahdonat);
        final EditText jml_robarcok = findViewById(R.id.jumlahrobarcok);
        final EditText jml_robarcokju = findViewById(R.id.jumlahrobarcokju);
        final EditText jml_sandwich = findViewById(R.id.jumlahsandwich);

        //button pesan
        Button btn = findViewById(R.id.submit);

        //Harga Minuman
        final int Harga_Boba = 10000;
        final int Harga_esteh = 5000;
        final int Harga_esjeruk = 7000;
        final int Harga_mineral = 5000;
        //Harga Makanan
        final int Harga_miekuah = 10000;
        final int Harga_mieayam = 12000;
        final int Harga_sate = 12000;
        final int Harga_naskun = 10000;
        final int Harga_Bakso = 10000;
        final int Harga_gado = 10000;
        //Harga Snack
        final int Harga_pisnug = 10000;
        final int Harga_donat = 8000;
        final int Harga_robarcok = 10000;
        final int Harga_robarcokju = 13000;
        final int Harga_Sandwich = 10000;


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "";
                int totOrder = 0;
                int discount = 0;

                //minuman
                if (boba.isChecked()){
                    String hasil = "Boba";
                    int jml = Integer.parseInt(String.valueOf(jml_boba.getText()));
                    int cal = jml * Harga_Boba;
                    text += jml + "\t\t\t\t\t\t\t" + hasil + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                    totOrder = totOrder + cal;
                }
                if (esteh.isChecked()){
                    String hasil = "Es Teh";
                    int jml = Integer.parseInt(String.valueOf(jml_esteh.getText()));
                    int cal = jml * Harga_esteh;
                    text += jml + "\t\t\t\t\t\t\t" + hasil + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                    totOrder = totOrder + cal;
                }
                if (esjeruk.isChecked()){
                    String hasil = "Es Jeruk";
                    int jml = Integer.parseInt(String.valueOf(jml_esjeruk.getText()));
                    int cal = jml * Harga_esjeruk;
                    text += jml + "\t\t\t\t\t\t\t" + hasil + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                    totOrder = totOrder + cal;
                }
                if (mineral.isChecked()){
                    String hasil = "Air Mineral";
                    int jml = Integer.parseInt(String.valueOf(jml_mineral.getText()));
                    int cal = jml * Harga_mineral;
                    text += jml + "\t\t\t\t\t\t\t" + hasil + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                    totOrder = totOrder + cal;
                }
                //makanan
                if (miekuah.isChecked()){
                    String hasil = "Mie Kuah";
                    int jml = Integer.parseInt(String.valueOf(jml_miekuah.getText()));
                    int cal = jml * Harga_miekuah;
                    text += jml + "\t\t\t\t\t\t\t" + hasil + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                    totOrder = totOrder + cal;
                }
                if (mieayam.isChecked()){
                    String hasil = "Mie Ayam";
                    int jml = Integer.parseInt(String.valueOf(jml_mieayam.getText()));
                    int cal = jml * Harga_mieayam;
                    text += jml + "\t\t\t\t\t\t\t" + hasil + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                    totOrder = totOrder + cal;
                }
                if (sateayam.isChecked()){
                    String hasil = "Sate Ayam";
                    int jml = Integer.parseInt(String.valueOf(jml_sate.getText()));
                    int cal = jml * Harga_sate;
                    text += jml + "\t\t\t\t\t\t\t" + hasil + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                    totOrder = totOrder + cal;
                }
                if (naskun.isChecked()){
                    String hasil = "Nasi Kuning";
                    int jml = Integer.parseInt(String.valueOf(jml_naskun.getText()));
                    int cal = jml * Harga_naskun;
                    text += jml + "\t\t\t\t\t\t\t" + hasil + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                    totOrder = totOrder + cal;
                }
                if (Bakso.isChecked()){
                    String hasil = "Bakso";
                    int jml = Integer.parseInt(String.valueOf(jml_Bakso.getText()));
                    int cal = jml * Harga_Bakso;
                    text += jml + "\t\t\t\t\t\t\t" + hasil + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                    totOrder = totOrder + cal;
                }
                if (gado.isChecked()){
                    String hasil = "Gado-Gado";
                    int jml = Integer.parseInt(String.valueOf(jml_gado.getText()));
                    int cal = jml * Harga_gado;
                    text += jml + "\t\t\t\t\t\t\t" + hasil + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                    totOrder = totOrder + cal;
                }
                //Snack
                if (nugget.isChecked()){
                    String hasil = "Pisang Nuget";
                    int jml = Integer.parseInt(String.valueOf(jml_pisnug.getText()));
                    int cal = jml * Harga_pisnug;
                    text += jml + "\t\t\t\t\t\t\t" + hasil + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                    totOrder = totOrder + cal;
                }
                if (donat.isChecked()){
                    String hasil = "Donat";
                    int jml = Integer.parseInt(String.valueOf(jml_donat.getText()));
                    int cal = jml * Harga_donat;
                    text += jml + "\t\t\t\t\t\t\t" + hasil + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                    totOrder = totOrder + cal;
                }
                if (robarcok.isChecked()){
                    String hasil = "Roti Bakar Coklat";
                    int jml = Integer.parseInt(String.valueOf(jml_robarcok.getText()));
                    int cal = jml * Harga_robarcok;
                    text += jml + "\t\t\t\t\t\t\t" + hasil + "\t\t\t\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                    totOrder = totOrder + cal;
                }
                if (robarcokju.isChecked()){
                    String hasil = "Roti Bakar Coklat Keju";
                    int jml = Integer.parseInt(String.valueOf(jml_robarcokju.getText()));
                    int cal = jml * Harga_robarcokju;
                    text += jml + "\t\t\t\t\t\t\t" + hasil + "\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                    totOrder = totOrder + cal;
                }
                if (sandwich.isChecked()){
                    String hasil = "Sandwich";
                    int jml = Integer.parseInt(String.valueOf(jml_sandwich.getText()));
                    int cal = jml * Harga_Sandwich;
                    text += jml + "\t\t\t\t\t\t\t" + hasil + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                    totOrder = totOrder + cal;
                }
                if (!boba.isChecked() && !esteh.isChecked() && !esjeruk.isChecked() && !mineral.isChecked() && !miekuah.isChecked()
                        && !mieayam.isChecked() && !sateayam.isChecked() && !Bakso.isChecked() && !gado.isChecked() && !nugget.isChecked()
                        && !donat.isChecked() && !robarcok.isChecked() && !robarcokju.isChecked() && !sandwich.isChecked()){
                    Toast.makeText(getApplicationContext(), "Silahkan Pilih Menu Yang Tersedia", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (totOrder > 100000){
                    discount = 10000;
                }

                Intent intent = new Intent(Menu.this, Checkeout.class);

                intent.putExtra("Coba", text);
                intent.putExtra("Bayar", totOrder);
                intent.putExtra("Discount", discount);
                startActivity(intent);
            }
        });
    }
}