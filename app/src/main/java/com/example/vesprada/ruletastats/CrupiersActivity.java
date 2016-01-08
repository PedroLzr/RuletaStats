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

public class CrupiersActivity extends Activity {

    static CrupierAdapter crupierAdapter;
    static ListView listViewCrupiers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crupiers);

        Button btnCrearCrupier = (Button) findViewById(R.id.btnCrearCrupier);
        listViewCrupiers = (ListView) findViewById(R.id.listViewCrupiers);
        CrupierDAO cDAO = new CrupierDAO(this);
        crupierAdapter = new CrupierAdapter(this, cDAO.getCrupiersArray());
        listViewCrupiers.setAdapter(crupierAdapter);

        btnCrearCrupier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CrupiersActivity.this, RegistrarCrupierActivity.class);
                startActivity(intent);
            }
        });

        listViewCrupiers.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1, final int pos, long id) {

                String[] opc = new String[]{"Borrar"};

                AlertDialog opciones = new AlertDialog.Builder(
                        CrupiersActivity.this)
                        .setTitle("Opciones")
                        .setItems(opc,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int selected) {
                                        if (selected == 0) {
                                            CrupierDAO cDAO = new CrupierDAO(CrupiersActivity.this);
                                            cDAO.borrarCrupier(crupierAdapter.getIDCrupierDesdeListView(pos));
                                            Toast.makeText(getApplicationContext(),
                                                    "Se ha borrado el crupier con id: " + crupierAdapter.getIDCrupierDesdeListView(pos), Toast.LENGTH_SHORT).show();

                                            reloadAllData();

                                            listViewCrupiers.setAdapter(crupierAdapter);
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

        Button btnCrearCrupier = (Button) findViewById(R.id.btnCrearCrupier);
        ListView listViewCrupiers = (ListView) findViewById(R.id.listViewCrupiers);
        CrupierDAO cDAO = new CrupierDAO(this);
        final CrupierAdapter crupierAdapter = new CrupierAdapter(this, cDAO.getCrupiersArray());
        listViewCrupiers.setAdapter(crupierAdapter);

        listViewCrupiers.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1, final int pos, long id) {

                String[] opc = new String[]{"Borrar"};

                AlertDialog opciones = new AlertDialog.Builder(
                        CrupiersActivity.this)
                        .setTitle("Opciones")
                        .setItems(opc,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int selected) {
                                        if (selected == 0) {
                                            CrupierDAO cDAO = new CrupierDAO(CrupiersActivity.this);
                                            cDAO.borrarCrupier(crupierAdapter.getIDCrupierDesdeListView(pos));
                                            Toast.makeText(getApplicationContext(),
                                                    "Se ha borrado el crupier con id: " + crupierAdapter.getIDCrupierDesdeListView(pos), Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                }).create();
                opciones.show();

                return true;
            }
        });
    }

    private void reloadAllData(){
        // update data in our adapter
        crupierAdapter.getData().clear();
        CrupierDAO cDAO = new CrupierDAO(this);
        crupierAdapter.getData().addAll(cDAO.getCrupiersArray());
        // fire the event
        crupierAdapter.notifyDataSetChanged();

        listViewCrupiers.invalidateViews();
        listViewCrupiers.refreshDrawableState();
    }
}
