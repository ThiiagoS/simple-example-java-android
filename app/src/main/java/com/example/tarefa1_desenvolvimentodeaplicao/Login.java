package com.example.tarefa1_desenvolvimentodeaplicao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    EditText inputEmail;
    EditText inputPassword;
    Button btnVerifyLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        inputEmail = findViewById(R.id.emailEditText);
        inputPassword = findViewById(R.id.senhaEditText);

        btnVerifyLogin = findViewById(R.id.buttontrylogin);
        btnVerifyLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = inputEmail.getText().toString();
                String senha = inputPassword.getText().toString();

                if (email.equals("thiago.francisco@acad.ftec.com.br") && senha.equals("123456")) {

                    Intent intent = new Intent(Login.this, LoginSuccess.class);
                    startActivity(intent);

                }else{
                    Intent intent = new Intent(Login.this, LoginError.class);
                    startActivity(intent);
                }
            }
        });
    }
}
