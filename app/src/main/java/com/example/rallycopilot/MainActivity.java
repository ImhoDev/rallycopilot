package com.example.rallycopilot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Colocar icono en el ActionBar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }
    //Metodo para mostrar los botones de accion
    public boolean OnCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menuacciones, menu);
        return true;
    }
    //Metodo para agregar las acciones de los botones
    public boolean OnOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.carrera) {
            Toast.makeText(this, "Carrera", Toast.LENGTH_SHORT ).show();
            return true;
        }
        if (id == R.id.rutas) {
            Toast.makeText(this, "Rutas", Toast.LENGTH_SHORT ).show();
            return true;
        }
        if (id == R.id.simbolos) {
            Toast.makeText(this, "Símbolos", Toast.LENGTH_SHORT ).show();
            return true;
        }
        if (id == R.id.opcion1) {
            Toast.makeText(this, "Opción 1", Toast.LENGTH_SHORT ).show();
            return true;
        }
        if (id == R.id.opcion2) {
            Toast.makeText(this, "Opción 2", Toast.LENGTH_SHORT ).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}