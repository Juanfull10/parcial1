package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    private static TextView texto1;

    private static TextView texto2;

    private static TextView texto3;

    private static  TextView texto4;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        texto1 = findViewById(R.id.texto1);
        texto2= findViewById(R.id.texto2);
        texto3= findViewById(R.id.texto3);
        texto4= findViewById(R.id.textView6);

        double descuento;

        Intent intent =getIntent();
        Bundle bundle= intent.getExtras();
        String nombre= bundle.getString("nombre");
        String apellido= bundle.getString("apellido");
        Double valor=bundle.getDouble("valor");
        String carrera=bundle.getString("carrera");


        texto1.setText(String.valueOf(nombre));
        texto2.setText(String.valueOf(apellido));
        texto3.setText(Double.toString(valor));
        texto4.setText(Double.toString(valor));



    }



}