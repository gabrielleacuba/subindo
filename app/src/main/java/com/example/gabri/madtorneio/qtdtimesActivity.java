package com.example.gabri.madtorneio;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class qtdtimesActivity extends AppCompatActivity {
    private TextInputEditText campoTorneio;
    private TextView quantidade;
    private int cont = 1;
    private FloatingActionButton soma;
    private FloatingActionButton sub;
    private Button cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qtdtimes);

        campoTorneio = findViewById(R.id.nomeTorneio); //referenciando o nome torneio
        quantidade = findViewById(R.id.resultQtd);
        quantidade.setText(String.valueOf(cont));
        soma = findViewById(R.id.btSoma);
        sub = findViewById(R.id.btSubtrai);
        cadastro = findViewById(R.id.btCadastro);

        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont++;
                if(cont < 33) {
                    quantidade.setText(String.valueOf(cont));
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont--;
                if(cont < 0){
                    cont = 0;
                    quantidade.setText(String.valueOf(cont));
                }else {
                    quantidade.setText(String.valueOf(cont));
                }
            }
        });

        cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),NomeTorneioActivity.class);

                //String nProduto = campoTorneio.getText().toString(); //pega o que está dentro do input

                intent.putExtra("nomeTorneio", "nProduto" );
                //intent.putExtra("qtdTorneio",cont);

                startActivity(intent);
            }
        });
    }


}