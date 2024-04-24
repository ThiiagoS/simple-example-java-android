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

public class CadatroError extends AppCompatActivity {

    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.erro_cadastro);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.errorCadatro), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        String invalidFields = String.valueOf(getIntent().getStringArrayListExtra("CamposIncorretos"));
        TextView msgError = findViewById(R.id.menssagemErroRegister);
        msgError.setText("Erro no Cadastro. Os campos "+ invalidFields + " devem ser preenchidos.");

        btnReturn = findViewById(R.id.buttonVoltar);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CadatroError.this, Cadastro.class);
                startActivity(intent);

            }
        });

    }
}
