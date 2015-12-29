package com.example.vesprada.ruletastats;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrarRuletaActivity extends Activity{

    static int elec = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarruleta);

        final EditText nombreRuleta = (EditText) findViewById(R.id.etNombreRuleta);
        final CheckBox cbElectrica = (CheckBox) findViewById(R.id.cbElectrica);
        Button btnNuevaRuleta = (Button) findViewById(R.id.btnNuevaRuleta);

        cbElectrica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbElectrica.isChecked()) {
                    elec = 1;
                } else {
                    elec = 0;
                }
            }
        });

        btnNuevaRuleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nombreRuleta.getText().toString().equals("")){
                    Toast.makeText(RegistrarRuletaActivity.this, "Introduce un nombre para la ruleta", Toast.LENGTH_SHORT).show();
                }
                else{
                    Ruleta r = new Ruleta(nombreRuleta.getText().toString(), elec);
                    RuletaDAO rDAO = new RuletaDAO(RegistrarRuletaActivity.this);
                    rDAO.insert(r);

                    Toast.makeText(RegistrarRuletaActivity.this, "Ruleta guardada", Toast.LENGTH_SHORT).show();

                    nombreRuleta.setText("");
                    cbElectrica.setChecked(false);
                    elec = 0;
                }
            }
        });

    }

}
