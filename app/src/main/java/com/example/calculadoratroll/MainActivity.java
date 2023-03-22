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
        getSupportActionBar().hide();
        valor1 = findViewById(R.id.valor1);
        valor2 = findViewById(R.id.valor2);
        resultado = findViewById(R.id.resultado);
    }
    public void clear (View v){
        valor1.getText().clear();
        valor2.getText().clear();
        resultado.setText("");
    }
    public void somar (View v){
        int intValor1 = Integer.parseInt(valor1.getText().toString());
        int intValor2 = Integer.parseInt(valor2.getText().toString());
        int soma = intValor1 + intValor2;
        String resultadoSoma = String.valueOf(soma);
        resultado.setText(resultadoSoma);
    }
    public void subtrair (View v){
        int intValor1 = Integer.parseInt(valor1.getText().toString());
        int intValor2 = Integer.parseInt(valor2.getText().toString());
        int subtracao = intValor1 - intValor2;
        String resultadoSub = String.valueOf(subtracao);
        resultado.setText(resultadoSub);
    }

    public void multiplicar (View v){
        int intValor1 = Integer.parseInt(valor1.getText().toString());
        int intValor2 = Integer.parseInt(valor2.getText().toString());
        int multiplicacao = intValor1 * intValor2;
        String resultadoMulti = String.valueOf(multiplicacao);
        resultado.setText(resultadoMulti);

    }

    public void dividir (View v){
        int intValor1 = Integer.parseInt(valor1.getText().toString());
        int intValor2 = Integer.parseInt(valor2.getText().toString());
        int divisao = intValor1/intValor2;
        String resultadoDivisao = String.valueOf(divisao);
        resultado.setText(resultadoDivisao);
    }

    public void exponenciar (View v){
        int intValor1 = Integer.parseInt(valor1.getText().toString());
        int intValor2 = Integer.parseInt(valor2.getText().toString());
        double potencia = Math.pow(intValor1,intValor2);
        String resultadoPotencia = String.valueOf(potencia);
        resultado.setText(resultadoPotencia);
    }
    public void raiz (View v){
        int intValor1 = Integer.parseInt(valor1.getText().toString());
        double raiz = java.lang.Math.sqrt(intValor1);
        String resultadoRaiz = String.valueOf(raiz);
        resultado.setText(resultadoRaiz);

    }

}