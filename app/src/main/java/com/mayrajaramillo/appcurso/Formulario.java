package com.mayrajaramillo.appcurso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Formulario extends AppCompatActivity {

    EditText NombreUs;
    EditText Pass;
    EditText PassConfirmacion;
    EditText Email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        NombreUs = (EditText) findViewById(R.id.etNom);
        Pass =(EditText) findViewById(R.id.etPass);
        PassConfirmacion = (EditText) findViewById(R.id.confPass);
        Email =(EditText) findViewById(R.id.etEmail);
        Button btn_reg =(Button) findViewById(R.id.btnForm);
        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),Datos.class);
                String nUsuario = NombreUs.getText().toString();
                String em = Email.getText().toString();
                intent.putExtra("Usuario", nUsuario);
                intent.putExtra("Email", em);

                Toast toast = Toast.makeText(getApplicationContext(), "Registro correcto", Toast.LENGTH_SHORT);
                toast.show();
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_formulario, menu);
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
