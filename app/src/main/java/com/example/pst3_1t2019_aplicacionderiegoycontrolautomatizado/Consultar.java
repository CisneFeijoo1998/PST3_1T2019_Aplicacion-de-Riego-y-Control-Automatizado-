package com.example.pst3_1t2019_aplicacionderiegoycontrolautomatizado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Consultar extends AppCompatActivity {
    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar);
        spinner1= (Spinner)findViewById(R.id.spinner);
        String [] opciones= {"Enero","Febrero","Marzo","Abrl","Mayo","Junio","Julio","Agosto","Septiembre","Optubre","Noviembre","Diciembre"};
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);
    }

    public void Ahorro(View view){
        Intent i = new Intent();
        startActivity(i);
    }
    public void Salir (View view){
        finish();

    }
}
