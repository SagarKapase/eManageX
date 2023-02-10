package com.example.emanagex;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        EditText user=(EditText) findViewById(R.id.uname);
        EditText pass=(EditText) findViewById(R.id.pass);

       Button login=(Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String get_user=user.getText().toString();
                String get_pass=pass.getText().toString();

                if (validateLogin(get_user,get_pass))
                {
                    Toast.makeText(AdminLogin.this, "Login Successful", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(AdminLogin.this, AdminPanel.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(AdminLogin.this, "Please enter correct details", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    public boolean validateLogin(String username, String password)
    {
        if (username.equals("admin") && password.equals("admin")) {
            return true;
        }
        return false;
    }
}