package com.example.vesprada.ruletastats;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class RuletasActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruletas);

        Button btnCrearRuleta = (Button) findViewById(R.id.btnCrearRuleta);
        ListView listViewRuletas = (ListView) findViewById(R.id.listViewRuletas);
        RuletaDAO rDAO = new RuletaDAO(this);
        RuletaAdapter ruletaAdapter = new RuletaAdapter(this, rDAO.getRuletasArray());
        listViewRuletas.setAdapter(ruletaAdapter);

        btnCrearRuleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RuletasActivity.this, RegistrarRuletaActivity.class);
                startActivity(intent);
            }
        });

    }

}
