package com.example.tarefa1_desenvolvimentodeaplicao;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Sobre extends AppCompatActivity {

    Button btnInitialPage;
    Button btnFtecPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.sobre);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.sobre), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnInitialPage = findViewById(R.id.butttonPaginaInicial);
        btnInitialPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sobre.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnFtecPage = findViewById(R.id.buttonPaginaFtec);
        btnFtecPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlFtec = "https://www.ftec.com.br/caxias-do-sul/presencial/";

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlFtec));
                startActivity(intent);
            }
        });

    }
}
