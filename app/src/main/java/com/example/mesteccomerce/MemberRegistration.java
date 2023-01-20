package com.example.mesteccomerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MemberRegistration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_registration);



        Button signUpButton = findViewById(R.id.sign_up_btn);
        Button backToLoginButton = findViewById(R.id.back_to_login_btn);
        TextInputEditText textInputEditTextFullName = findViewById(R.id.edit_text_enter_full_name);
        TextInputEditText textInputEditTextEmailAddress = findViewById(R.id.edit_text_enter_email_address);
        TextInputEditText textInputEditTextConfirmPassword = findViewById(R.id.edit_text_enter_confirm_password);
        TextInputEditText textInputEditTextPassword = findViewById(R.id.edit_text_enter_password);

        backToLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MemberRegistration.this,"Going back to login",Toast.LENGTH_LONG).show();

                Intent backToLoginIntent = new Intent(MemberRegistration.this,Login.class);
                startActivity(backToLoginIntent);
                finish();
            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullName = textInputEditTextFullName.getText().toString().trim();
                String emailAddress = textInputEditTextEmailAddress.getText().toString().trim();
                String confirmPassword = textInputEditTextConfirmPassword.getText().toString().trim();
                String password = textInputEditTextPassword.getText().toString().trim();

                if (fullName.isEmpty() || emailAddress.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    Toast.makeText(MemberRegistration.this,"Enter all the required fields before proceeding",Toast.LENGTH_LONG).show();
                    return;
                }

                Intent intent = new Intent(MemberRegistration.this,Home.class);
                startActivity(intent);
                finish();

            }
        });

    }
}