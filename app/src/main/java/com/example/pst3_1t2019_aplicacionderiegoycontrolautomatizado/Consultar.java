package com.example.pst3_1t2019_aplicacionderiegoycontrolautomatizado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Consultar extends AppCompatActivity {
    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar);
        spinner1= (Spinner)findViewById(R.id.spinner);

        String [] opciones= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Optubre","Noviembre","Diciembre"};
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);
    }
    public void Consultar(View view){
        String seleccion= spinner1.getSelectedItem().toString();
        if (seleccion.equals("Enero")){

            Toast.makeText(this, "Selección Exitosa", Toast.LENGTH_LONG).show();
        } else if (seleccion.equals("Febrero ")){

            Toast.makeText(this, "Selección Exitosa", Toast.LENGTH_LONG).show();
        }else if (seleccion.equals("Marzo")){


            Toast.makeText(this, "Selección Exitosa", Toast.LENGTH_LONG).show();
        }else if (seleccion.equals("Abril")){

            Toast.makeText(this, "Selección Exitosa", Toast.LENGTH_LONG).show();
        }else if (seleccion.equals("Mayo")){

            Toast.makeText(this, "Selección Exitosa", Toast.LENGTH_LONG).show();
        }else if (seleccion.equals("Junio")){

            Toast.makeText(this, "Selección Exitosa", Toast.LENGTH_LONG).show();
        }else if (seleccion.equals("Julio")){

            Toast.makeText(this, "Selección Exitosa", Toast.LENGTH_LONG).show();
        }else if (seleccion.equals("Agosto")){

            Toast.makeText(this, "Selección Exitosa", Toast.LENGTH_LONG).show();
        }else if (seleccion.equals("Septiembre")){

            Toast.makeText(this, "Selección Exitosa", Toast.LENGTH_LONG).show();
        }else if (seleccion.equals("Octubre")){

            Toast.makeText(this, "Selección Exitosa", Toast.LENGTH_LONG).show();
        }else if (seleccion.equals("Noviembre")){

            Toast.makeText(this, "Selección Exitosa", Toast.LENGTH_LONG).show();
        }else if (seleccion.equals("Diciembre")){

            Toast.makeText(this, "Selección Exitosa", Toast.LENGTH_LONG).show();
        }


    }

    public void Ahorro(View view){
        Intent i = new Intent();
        startActivity(i);
    }
    public void Salir (View view){
        finish();

    }
}
