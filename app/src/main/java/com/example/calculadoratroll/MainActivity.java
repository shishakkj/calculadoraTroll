package com.example.calculadoratroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText valor1, valor2;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActionBar().hide();
        valor1 = findViewById(R.id.valor1);
        valor2 = findViewById(R.id.valor2);
        resultado = findViewById(R.id.resultado);
    }
    public void somar (View v){
        int intValor1 = Integer.parseInt(valor1.getText().toString());
        int intValor2 = Integer.parseInt(valor2.getText().toString());
        int soma = intValor1 + intValor2;
        String resultadoSoma = String.valueOf(soma);
        resultado.setText(resultadoSoma);

    }
}