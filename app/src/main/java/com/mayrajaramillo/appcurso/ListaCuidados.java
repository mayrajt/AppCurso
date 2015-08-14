package com.mayrajaramillo.appcurso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListaCuidados extends AppCompatActivity {
    Mascotas mascotas_datos[];
    MascotasAdapter adapter;
    ListView lvCuidados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cuidados);
        mascotas_datos = new Mascotas[]{
                new Mascotas(R.mipmap.ic_check, "Bañar"),
                new Mascotas(R.mipmap.ic_check, "Higiene Bucal"),
                new Mascotas(R.mipmap.ic_check, "Sacar a pasear"),
                new Mascotas(R.mipmap.ic_check, "Vacunas"),
                new Mascotas(R.mipmap.ic_check, "Desparasitar")
        };

        adapter = new MascotasAdapter(this, R.layout.renglon, mascotas_datos);
        lvCuidados = (ListView) findViewById(R.id.listaMascotas);
        lvCuidados.setAdapter(adapter);
        lvCuidados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                TextView v = (TextView) arg1.findViewById(R.id.text);
                Toast.makeText(getApplicationContext(), v.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lista_cuidados, menu);
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
