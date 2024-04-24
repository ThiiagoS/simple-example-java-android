package com.example.tarefa1_desenvolvimentodeaplicao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CadastroSuccess extends AppCompatActivity {

    Button btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.sucesso_cadastro);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.successCadastro), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        String name = getIntent().getStringExtra("Nome");
        TextView msgSucess = findViewById(R.id.menssagemSucesso);
        msgSucess.setText("Olá " + name + ". Cadastro realizado com sucesso");

        btnAbout = findViewById(R.id.buttonSobreMsgSucesso);
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CadastroSuccess.this, Sobre.class);
                startActivity(intent);

            }
        });

    }
}
