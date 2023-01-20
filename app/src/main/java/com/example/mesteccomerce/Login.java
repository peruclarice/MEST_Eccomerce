package com.example.mesteccomerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button buttonLogin = findViewById(R.id.login_button);
        Button signUpButton = findViewById(R.id.sign_up_btn);
        TextInputEditText textInputEditTextEmailAddress = findViewById(R.id.edit_enter_email_address);
        TextInputEditText textInputEditTextPassword = findViewById(R.id.edit_enter_password);

        buttonLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
//              Toast.makeText(MemberRegistration.this,"Login Clicked",Toast.LENGTH_LONG).show();
                String emailAddress = textInputEditTextEmailAddress.getText().toString().trim();
                String password = textInputEditTextPassword.getText().toString();

                if (emailAddress.isEmpty()){
                    textInputEditTextEmailAddress.setError("Enter a valid email address");
                    return;
                }
                if (password.isEmpty()){
                    textInputEditTextPassword.setError("Password is invalid");
                    return;
                }

                Intent intent = new Intent(Login.this,Home.class);
                startActivity(intent);
                finish();
            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,MemberRegistration.class);
                startActivity(intent);
                finish();
            }
        });

    }
}