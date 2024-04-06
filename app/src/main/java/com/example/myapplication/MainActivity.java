package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText nombre;

    private EditText apellido;

    private Button boton;

    private Button boton2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre= findViewById(R.id.editTextText);
        apellido= findViewById(R.id.editTextText2);
        boton=findViewById(R.id.button);
        boton2=findViewById(R.id.button2);


    }

    public void insertar(View view){
        String nombre1= nombre.getText().toString();
        String apellido1= apellido.getText().toString();
        double valor= 7000000;
        String carrera="Ingenieria Industrial";

        Bundle bundle = new Bundle();
        bundle.putString("nombre",nombre1);
        bundle.putString("apellido",apellido1);
        bundle.putDouble("valor",valor);
        bundle.putString("carrera",carrera);
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void insertar2(View view){
        String nombre1= nombre.getText().toString();
        String apellido1= apellido.getText().toString();
        double valor= 8000000;
        String carrera="Ingenieria Sistemas";

        Bundle bundle = new Bundle();
        bundle.putString("nombre",nombre1);
        bundle.putString("apellido",apellido1);
        bundle.putString("carrera",carrera);
        bundle.putDouble("valor",valor);
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}