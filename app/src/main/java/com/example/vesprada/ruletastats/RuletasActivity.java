package com.example.vesprada.ruletastats;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class RuletasActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruletas);

        Button btnCrearRuleta = (Button) findViewById(R.id.btnCrearRuleta);
        final ListView listViewRuletas = (ListView) findViewById(R.id.listViewRuletas);
        RuletaDAO rDAO = new RuletaDAO(this);
        final RuletaAdapter ruletaAdapter = new RuletaAdapter(this, rDAO.getRuletasArray());
        listViewRuletas.setAdapter(ruletaAdapter);

        btnCrearRuleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RuletasActivity.this, RegistrarRuletaActivity.class);
                startActivity(intent);
            }
        });

        listViewRuletas.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1, final int pos, long id) {

                String[] opc = new String[]{"Borrar"};

                AlertDialog opciones = new AlertDialog.Builder(
                        RuletasActivity.this)
                        .setTitle("Opciones")
                        .setItems(opc,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int selected) {
                                        if (selected == 0) {
                                            RuletaDAO rDAO = new RuletaDAO(RuletasActivity.this);
                                            rDAO.borrarRuleta(ruletaAdapter.getIDRuletaDesdeListView(pos));
                                            Toast.makeText(getApplicationContext(),
                                                    "Se ha borrado la ruleta con id: " + ruletaAdapter.getIDRuletaDesdeListView(pos), Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                }).create();
                opciones.show();

                return true;
            }
        });

    }

    public void onResume() {
        super.onResume();

        Button btnCrearRuleta = (Button) findViewById(R.id.btnCrearRuleta);
        final ListView listViewRuletas = (ListView) findViewById(R.id.listViewRuletas);
        RuletaDAO rDAO = new RuletaDAO(this);
        final RuletaAdapter ruletaAdapter = new RuletaAdapter(this, rDAO.getRuletasArray());
        listViewRuletas.setAdapter(ruletaAdapter);

        btnCrearRuleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RuletasActivity.this, RegistrarRuletaActivity.class);
                startActivity(intent);
            }
        });

        listViewRuletas.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1, final int pos, long id) {

                String[] opc = new String[]{"Borrar"};

                AlertDialog opciones = new AlertDialog.Builder(
                        RuletasActivity.this)
                        .setTitle("Opciones")
                        .setItems(opc,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int selected) {
                                        if (selected == 0) {
                                            RuletaDAO rDAO = new RuletaDAO(RuletasActivity.this);
                                            rDAO.borrarRuleta(ruletaAdapter.getIDRuletaDesdeListView(pos));
                                            Toast.makeText(getApplicationContext(),
                                                    "Se ha borrado la ruleta con id: " + ruletaAdapter.getIDRuletaDesdeListView(pos), Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                }).create();
                opciones.show();

                return true;
            }
        });
    }

}
