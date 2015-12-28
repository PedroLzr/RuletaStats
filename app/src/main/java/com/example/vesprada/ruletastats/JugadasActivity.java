package com.example.vesprada.ruletastats;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

public class JugadasActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugadas);

        Bundle bundle = getIntent().getExtras();

        int id_ruleta = Integer.parseInt(bundle.getString("id_ruleta"));

        int id_crupier = Integer.parseInt(bundle.getString("id_crupier"));

        TiradaDAO tDAO = new TiradaDAO(this);
        ArrayList<Integer> tiradas = tDAO.getTiradas(id_ruleta, id_crupier);

        TextView tvTotalTiradas = (TextView) findViewById(R.id.tvTotalTiradas);
        TextView tvPlenos = (TextView) findViewById(R.id.tvPlenos);
        TextView tvCaballos = (TextView) findViewById(R.id.tvCaballos);
        TextView tvFilas = (TextView) findViewById(R.id.tvFilas);
        TextView tvCuadros = (TextView) findViewById(R.id.tvCuadros);
        TextView tvInfo = (TextView) findViewById(R.id.tvInfo);

        Log.v("SQLite01", String.valueOf(tiradas.size()));

        tvTotalTiradas.setText(tiradas.size());

        String plenos = "";
        ArrayList<String> ArrayPlenos = CalcularJugadas.calcularPlenos(tiradas);
        for(int i = 0; i<ArrayPlenos.size(); i++){
            plenos += ArrayPlenos.get(i) + "\n";
        }
        tvPlenos.setText(plenos);

        String caballos = "";
        ArrayList<String> ArrayCaballos = CalcularJugadas.calcularPlenos(tiradas);
        for(int i = 0; i<ArrayCaballos.size(); i++){
            plenos += ArrayCaballos.get(i) + "\n";
        }
        tvCaballos.setText(caballos);

        String filas = "";
        ArrayList<String> ArrayFilas = CalcularJugadas.calcularPlenos(tiradas);
        for(int i = 0; i<ArrayFilas.size(); i++){
            plenos += ArrayFilas.get(i) + "\n";
        }
        tvFilas.setText(filas);

        String cuadros = "";
        ArrayList<String> ArrayCuadros = CalcularJugadas.calcularPlenos(tiradas);
        for(int i = 0; i<ArrayCuadros.size(); i++){
            plenos += ArrayCuadros.get(i) + "\n";
        }
        tvCuadros.setText(cuadros);

        String info = "";
        ArrayList<String> ArrayInfo = CalcularJugadas.calcularPlenos(tiradas);
        for(int i = 0; i<ArrayInfo.size(); i++){
            plenos += ArrayInfo.get(i) + "\n";
        }
        tvInfo.setText(info);

    }

}
