package com.example.pst3_1t2019_aplicacionderiegoycontrolautomatizado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.database.sqlite.SQLiteDatabase;

public class CrearCuenta extends AppCompatActivity {
    private EditText nombre, email, usuario,contraseña, confirmar_contraseña;
    //Variables de la base de datos
    private SQLiteDatabase db;
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
        nombre= findViewById(R.id.txtnombre);
        email= findViewById(R.id.txtemail);
        usuario= findViewById(R.id.txtusuario);
        contraseña= findViewById(R.id.txtcontraseña);


    }
    public void añadirUsuario(View view){

        String nombre_db = nombre.getText().toString();
        String contraseña_db = contraseña.getText().toString();
        String correo_db = email.getText().toString();
        String sector_db = spinner1.getSelectedItem().toString();
        if(!TextUtils.isEmpty(nombre_db)&&!TextUtils.isEmpty(contraseña_db)&&!TextUtils.isEmpty(correo_db)&&!TextUtils.isEmpty(sector_db)){
            db = LoginActivity.dataBaseManager.getWritableDatabase();
            db.execSQL("insert into usuarios (usuario,contrasena,nombres,apellidos,fecha_nacimiento,sexo)" +
                    "values('"+correo_db+"','"+"','"+nombre_db+"','"+contraseña_db+"',"+sector_db+"')");
            db.close();
            Intent intent = new Intent(this,LoginActivity.class);
            startActivity(intent);
        } else{
            Toast.makeText(this, "Ingrese datos validos", Toast.LENGTH_SHORT).show();
        }
    }
}
