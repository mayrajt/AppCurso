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

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Mascotas mascotas_datos[] = new Mascotas[]{
                new Mascotas(R.mipmap.ic_mascotas, "Winky"),
                new Mascotas(R.mipmap.ic_mascotas, "Jack"),
                new Mascotas(R.mipmap.ic_mascotas, "Black"),
                new Mascotas(R.mipmap.ic_mascotas, "Chester"),
                new Mascotas(R.mipmap.ic_mascotas, "Shido")
        };

        MascotasAdapter adapter = new MascotasAdapter(this, R.layout.renglon, mascotas_datos);
        ListView lsv = (ListView) findViewById(R.id.listaMascotas);
        lsv.setAdapter(adapter);
        lsv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
