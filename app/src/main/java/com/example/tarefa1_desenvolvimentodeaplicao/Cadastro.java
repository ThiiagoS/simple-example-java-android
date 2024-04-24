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

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cadastro extends AppCompatActivity {
    EditText inputName;
    EditText inputEmail;
    EditText inputAddress;
    EditText inputNumber;
    EditText inputCEP;
    EditText inputComplement;


    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.cadastro);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.cadastro), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        inputName = findViewById(R.id.nomeRegister);
        inputEmail = findViewById(R.id.emailRegister);
        inputAddress = findViewById(R.id.enderecoRegister);
        inputNumber = findViewById(R.id.numeroRegister);
        inputCEP = findViewById(R.id.cepRegister);
        inputComplement = findViewById(R.id.complementoRegister);

        btnSave = findViewById(R.id.saveButton);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = inputName.getText().toString();
                String email = inputEmail.getText().toString();
                String address = inputAddress.getText().toString();
                String number = inputNumber.getText().toString();
                String CEP = inputCEP.getText().toString();
                String complement = inputComplement.getText().toString();

                ArrayList<String> invalidFilds = new ArrayList<>();

                if (name.equals("Nome Completo")) {
                    invalidFilds.add("Nome Completo");
                }
                if (email.equals("Email")) {
                    invalidFilds.add("Email");
                }
                if (address.equals("Endereço")) {
                    invalidFilds.add("Endereço");
                }
                if (number.equals("Número")) {
                    invalidFilds.add("Número");
                }
                if (CEP.equals("CEP")) {
                    invalidFilds.add("CEP");
                }
                if (complement.equals("Complemento")) {
                    invalidFilds.add("Complemento");
                }

                if(invalidFilds.isEmpty()){
                    Intent intent = new Intent(Cadastro.this, CadastroSuccess.class);
                    intent.putExtra("Nome", name);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(Cadastro.this, CadatroError.class);
                    intent.putExtra("CamposIncorretos", invalidFilds);
                    startActivity(intent);
                }
            }
        });

        inputName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (inputName.getText().toString().equals("Nome Completo") || inputName.getText().toString().isEmpty()) {
                    if (hasFocus) {
                        inputName.setText("");
                    } else {
                        inputName.setText("Nome Completo");
                    }
                }
            }
        });
        inputEmail.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (inputEmail.getText().toString().equals("Email") || inputEmail.getText().toString().isEmpty()) {
                    if (hasFocus) {
                        inputEmail.setText("");
                    } else {
                        inputEmail.setText("Email");
                    }
                }
            }
        });
        inputAddress.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (inputAddress.getText().toString().equals("Endereço") || inputAddress.getText().toString().isEmpty()) {
                    if (hasFocus) {
                        inputAddress.setText("");
                    } else {
                        inputAddress.setText("Endereço");
                    }
                }
            }
        });
        inputNumber.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (inputNumber.getText().toString().equals("Número") || inputNumber.getText().toString().isEmpty()) {
                    if (hasFocus) {
                        inputNumber.setText("");
                    } else {
                        inputNumber.setText("Número");
                    }
                }
            }
        });
        inputCEP.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (inputCEP.getText().toString().equals("CEP") || inputCEP.getText().toString().isEmpty()) {
                    if (hasFocus) {
                        inputCEP.setText("");
                    } else {
                        inputCEP.setText("CEP");
                    }
                }
            }
        });
        inputComplement.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (inputComplement.getText().toString().equals("Complemento") || inputComplement.getText().toString().isEmpty()) {
                    if (hasFocus) {
                        inputComplement.setText("");
                    } else {
                        inputComplement.setText("Complemento");
                    }
                }
            }
        });

    }
}
