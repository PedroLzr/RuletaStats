package com.example.vesprada.ruletastats;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrarCrupierActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarcrupier);

        final EditText nombreCrupier = (EditText) findViewById(R.id.etNombreCrupier);
        final EditText descripcionCrupier = (EditText) findViewById(R.id.etDescripcionCrupier);
        Button btnNuevoCrupier = (Button) findViewById(R.id.btnNuevoCrupier);

        btnNuevoCrupier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nombreCrupier.getText().toString().equals("")){
                    Toast.makeText(RegistrarCrupierActivity.this, "Introduce un nombre para el crupier", Toast.LENGTH_SHORT).show();
                }
                else {
                    Crupier c = new Crupier(nombreCrupier.getText().toString(), descripcionCrupier.getText().toString());
                    CrupierDAO cDAO = new CrupierDAO(RegistrarCrupierActivity.this);
                    cDAO.insert(c);

                    Toast.makeText(RegistrarCrupierActivity.this, "Crupier guardado", Toast.LENGTH_SHORT).show();
                    nombreCrupier.setText("");
                    descripcionCrupier.setText("");
                }
            }
        });

    }

}
