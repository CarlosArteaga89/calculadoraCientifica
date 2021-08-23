package com.example.calculadoraa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvresultado;
    double numero1, numero2, resultado;
    String operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnCero(View view){
        tvresultado = (TextView)findViewById(R.id.tvresultado);
        tvresultado.setText(tvresultado.getText() + "0");
    }

    public void btnUno(View view){
        tvresultado = (TextView)findViewById(R.id.tvresultado);
        tvresultado.setText(tvresultado.getText() + "1");
    }

    public void btnDos(View view){
        tvresultado = (TextView)findViewById(R.id.tvresultado);
        tvresultado.setText(tvresultado.getText() + "2");
    }

    public void btnTres(View view){
        tvresultado = (TextView)findViewById(R.id.tvresultado);
        tvresultado.setText(tvresultado.getText() + "3");
    }

    public void btnCuatro(View view){
        tvresultado = (TextView)findViewById(R.id.tvresultado);
        tvresultado.setText(tvresultado.getText() + "4");
    }

    public void btnCinco(View view){
        tvresultado = (TextView)findViewById(R.id.tvresultado);
        tvresultado.setText(tvresultado.getText() + "5");
    }

    public void btnSeis(View view){
        tvresultado = (TextView)findViewById(R.id.tvresultado);
        tvresultado.setText(tvresultado.getText() + "6");
    }

    public void btnSiete(View view){
        tvresultado = (TextView)findViewById(R.id.tvresultado);
        tvresultado.setText(tvresultado.getText() + "7");
    }

    public void btnOcho(View view){
        tvresultado = (TextView)findViewById(R.id.tvresultado);
        tvresultado.setText(tvresultado.getText() + "8");
    }

    public void btnNueve(View view){
        tvresultado = (TextView)findViewById(R.id.tvresultado);
        tvresultado.setText(tvresultado.getText() + "9");
    }

    public void btnPunto(View view){
        tvresultado = (TextView)findViewById(R.id.tvresultado);
        tvresultado.setText(tvresultado.getText() + ".");
    }
    //Guardamos el primer numero

    public void guardarNumero1(View view){
        tvresultado = (TextView)findViewById(R.id.tvresultado);
        numero1 = Double.parseDouble(tvresultado.getText().toString());
        tvresultado.setText(" ");
    }
    //Guardamos el segundo numero
    public void guardarNumero2(View view){
        tvresultado = (TextView)findViewById(R.id.tvresultado);
        numero2 = Double.parseDouble(tvresultado.getText().toString());
        tvresultado.setText(" ");
    }

    public void sumar(View view){
        operacion = "+";
        guardarNumero1(view);
    }

    public void restar(View view){
        operacion = "-";
        guardarNumero1(view);
    }

    public void multiplicar(View view){
        operacion = "*";
        guardarNumero1(view);
    }

    public void dividir(View view){
        operacion = "/";
        guardarNumero1(view);
    }

    public void btnIgual(View view){
        tvresultado = (TextView)findViewById(R.id.tvresultado);
        guardarNumero2(view);
        if(operacion.equals("+")){
            resultado = numero1 + numero2;
        } else if (operacion.equals("-")){
            resultado = numero1 - numero2;
        } else if (operacion.equals("*")){
            resultado = numero1 * numero2;
        } else if (operacion.equals("/")){
            resultado = numero1 / numero2;
        }
        tvresultado.setText(" " + resultado);
    }

    //Funcion para calcular el Seno

    public void Seno(View view){
        tvresultado = (TextView)findViewById(R.id.tvresultado);
        try {
            numero1 = Double.parseDouble(tvresultado.getText().toString());
            double radian = Math.toRadians(numero1);
            resultado = Math.sin(radian);
            tvresultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException nbe){};
    }

    //Funcion para calcular el Coseno

    public void Coseno(View view){
        tvresultado = (TextView)findViewById(R.id.tvresultado);
        try {
            numero1 = Double.parseDouble(tvresultado.getText().toString());
            double radian = Math.toRadians(numero1);
            resultado = Math.cos(radian);
            tvresultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException nbe){};
    }

    //Funcion para calcular la Tangente

    public void Tangente(View view){
        tvresultado = (TextView)findViewById(R.id.tvresultado);
        try {
            numero1 = Double.parseDouble(tvresultado.getText().toString());
            double radian = Math.toRadians(numero1);
            resultado = Math.tan(radian);
            tvresultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException nbe){};
    }

    public void Ac (View view) {
        numero1 = 0.0;
        numero2 = 0.0;
        tvresultado = (TextView)findViewById(R.id.tvresultado);
        tvresultado.setText(" ");
    }
}