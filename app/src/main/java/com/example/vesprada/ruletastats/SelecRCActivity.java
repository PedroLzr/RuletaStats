package com.example.vesprada.ruletastats;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SimpleCursorAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SelecRCActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecrc);

        final Spinner spRuleta = (Spinner) findViewById(R.id.spRuleta);
        final Spinner spCrupier = (Spinner) findViewById(R.id.spCrupier);
        final CheckBox cbSoloRuleta = (CheckBox) findViewById(R.id.cbSoloRuleta);
        Button btnMostrarJugadas = (Button) findViewById(R.id.btnMostrarJugadas);

        RuletaDAO rDAO = new RuletaDAO(this);

        SimpleCursorAdapter spRuletaAdapter = new SimpleCursorAdapter(this,
                android.R.layout.simple_spinner_item,
                rDAO.getRuletas(),
                new String[]{Ruleta.KEY_NOMBRE},
                new int[]{android.R.id.text1},
                SimpleCursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);

        spRuleta.setAdapter(spRuletaAdapter);

        CrupierDAO cDAO = new CrupierDAO(this);

        SimpleCursorAdapter spCrupierAdapter = new SimpleCursorAdapter(this,
                android.R.layout.simple_spinner_item,
                cDAO.getCrupiers(),
                new String[]{Crupier.KEY_NOMBRE},
                new int[]{android.R.id.text1},
                SimpleCursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);

        spCrupier.setAdapter(spCrupierAdapter);


        cbSoloRuleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cbSoloRuleta.isChecked()) {
                    spCrupier.setEnabled(false);
                } else {
                    spCrupier.setEnabled(true);
                }
            }
        });

        btnMostrarJugadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (spRuleta.getSelectedItem() == null) {
                    Toast.makeText(SelecRCActivity.this, "No hay ninguna ruleta", Toast.LENGTH_SHORT).show();
                }
                else {

                    if(spCrupier.getSelectedItem() == null){
                        cbSoloRuleta.setChecked(true);
                        Toast.makeText(SelecRCActivity.this, "Jugadas sin crupier", Toast.LENGTH_SHORT).show();
                    }

                    if (cbSoloRuleta.isChecked()) {
                        Intent intent = new Intent(SelecRCActivity.this, JugadasActivity.class);
                        intent.putExtra("id_ruleta", ((Cursor) spRuleta.getSelectedItem()).getString(0));
                        intent.putExtra("id_crupier", "-1");
                        startActivity(intent);
                    } else {
                        Log.v("SQLite01", ((Cursor) spRuleta.getSelectedItem()).getString(0));
                        Log.v("SQLite01", ((Cursor) spCrupier.getSelectedItem()).getString(0));

                        Intent intent = new Intent(SelecRCActivity.this, JugadasActivity.class);
                        intent.putExtra("id_ruleta", ((Cursor) spRuleta.getSelectedItem()).getString(0));
                        intent.putExtra("id_crupier", ((Cursor) spCrupier.getSelectedItem()).getString(0));
                        startActivity(intent);
                    }

                    cbSoloRuleta.setChecked(false);
                    if (!spCrupier.isEnabled()) {
                        spCrupier.setEnabled(true);
                    }
                }
            }
        });

    }
}
