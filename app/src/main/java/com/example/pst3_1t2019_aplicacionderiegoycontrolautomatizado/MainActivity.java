package com.example.pst3_1t2019_aplicacionderiegoycontrolautomatizado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void tabla1(View view){
        Intent i = new Intent(this,consumo_por_mes.class);
        startActivity(i);
    }
    public void crearCuenta(View view){
        Intent i = new Intent(this,CrearCuenta.class);
        startActivity(i);

    }
}
