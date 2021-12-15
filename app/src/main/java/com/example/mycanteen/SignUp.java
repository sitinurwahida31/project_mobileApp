package com.example.mycanteen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    DataBaseHelper db;
    Button login, register;
    EditText username, password, passwordConf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        db = new DataBaseHelper(this);

        username = (EditText)findViewById(R.id.editText_usernameRegist);
        password = (EditText)findViewById(R.id.editText_passwordRegist);
        passwordConf = (EditText)findViewById(R.id.editText_passwordConfSignUp);
        login = (Button)findViewById(R.id.btn_loginSignUp);
        register = (Button)findViewById(R.id.btn_registerSignUp);

        //login
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(SignUp.this, Login.class);
                startActivity(loginIntent);
                finish();
            }
        });

        //register
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strusername = username.getText().toString();
                String strpassword = password.getText().toString();
                String strpasswordConf = passwordConf.getText().toString();
                if (strpassword.equals(strpasswordConf)){
                    Boolean daftar = db.insertUser(strusername, strpassword);
                    if (daftar == true){
                        Toast.makeText(getApplicationContext(), "Daftar Berhasil", Toast.LENGTH_SHORT).show();
                        Intent loginIntent = new Intent(SignUp.this, Login.class);
                        startActivity(loginIntent);
                        finish();
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Daftar Gagal", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "password tidak cocok", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}