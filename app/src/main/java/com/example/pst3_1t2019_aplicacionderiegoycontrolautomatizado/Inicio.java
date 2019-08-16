package com.example.pst3_1t2019_aplicacionderiegoycontrolautomatizado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Inicio extends AppCompatActivity {
    TextView consumo,horas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        consumo = (TextView) findViewById(R.id.txt_consumo2);
        horas= (TextView) findViewById(R.id.txt_hora2);
    }
    public void Consultar(View view){
        Intent i = new Intent(this, Consultar.class);
        startActivity(i);
    }

    public void Salir (View view){
        finish();

    }
}
