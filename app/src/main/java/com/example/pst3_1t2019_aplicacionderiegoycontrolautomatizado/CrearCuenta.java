package com.example.pst3_1t2019_aplicacionderiegoycontrolautomatizado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class CrearCuenta extends AppCompatActivity {
    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);

        spinner1= (Spinner)findViewById(R.id.spinner);

        String [] opciones= {"Sector Norte(Guayaquil)","Daule"};
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);

        String seleccion= spinner1.getSelectedItem().toString();
        if (seleccion.equals("Sector Norte(Guayaquil)")){


            Toast.makeText(this, "Selección Exitosa", Toast.LENGTH_LONG).show();
        } else if (seleccion.equals("Daule")){

            Toast.makeText(this, "Selección Exitosa", Toast.LENGTH_LONG).show();
        }

    }
}
