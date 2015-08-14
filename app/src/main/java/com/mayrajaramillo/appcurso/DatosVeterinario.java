package com.mayrajaramillo.appcurso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class DatosVeterinario extends AppCompatActivity {

    TextView nomV;
    TextView dirV;
    TextView telV;
    TextView emailV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_veterinario);

        nomV= (TextView) findViewById(R.id.nombreVeterinario);
        dirV = (TextView) findViewById(R.id.direccionVeterinario);
        telV =(TextView) findViewById(R.id.telVeterinario);
        emailV = (TextView) findViewById(R.id.emailVeterinario);

        nomV.setText("Daniela Flores");
        dirV.setText("Av. Panorama 1002-A, Valle del Campestre ");
        telV.setText("7-17-64-86");
        emailV.setText("daniela.flores93@gmail.com");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_datos_veterinario, menu);
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
