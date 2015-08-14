package com.mayrajaramillo.appcurso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    TextView tvMascotas;
    TextView tvTareas;
    TextView tvVeterinario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvMascotas = (TextView) findViewById(R.id.tvMascotas);
        tvTareas = (TextView) findViewById(R.id.tvTareas);
        tvVeterinario = (TextView) findViewById(R.id.tvVeterinario);
        tvMascotas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMascotas = new Intent(getApplicationContext(),ListaMascotas.class);
                startActivity(intentMascotas);
            }
        });
        tvTareas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTareas = new Intent(getApplicationContext(),ListaCuidados.class);
                startActivity(intentTareas);
            }
        });
        tvVeterinario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVeterinario = new Intent(getApplicationContext(),DatosVeterinario.class);
                startActivity(intentVeterinario);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
