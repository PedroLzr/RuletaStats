package com.example.vesprada.ruletastats;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CrupiersActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crupiers);

        Button btnCrearCrupier = (Button) findViewById(R.id.btnCrearCrupier);

        btnCrearCrupier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CrupiersActivity.this, RegistrarCrupierActivity.class);
                startActivity(intent);
            }
        });
    }

}
