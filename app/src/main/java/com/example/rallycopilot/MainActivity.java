package com.example.rallycopilot;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menuacciones, menu);
        return super.onCreateOptionsMenu(menu);
    }
    //Metodo para agregar las acciones de los botones
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
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
        if (id == R.id.config) {
            Toast.makeText(this, "Configuración", Toast.LENGTH_SHORT ).show();
            return true;
        }
        if (id == R.id.salir) {
            Toast.makeText(this, "salir", Toast.LENGTH_SHORT ).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}