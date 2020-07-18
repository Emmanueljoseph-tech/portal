package com.example.portal;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements PortalJava {
    private EditText etEmail, etPassword;
    private Button btnLogin;
    private TextView tvForgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        private final String email, password;

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        tvForgot = findViewById(R.id.tvForgot);

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                email = etEmail.getText().toString().trim();
                password = etPassword.getText().toString().trim();

                validate();
            }
        });

    }

    private void validate() {
        if(email.isEmpty){
            etEmail.setError("Email cannot be empty");
        }else is(password.isEmpty)
    }

}