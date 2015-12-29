package com.example.vesprada.ruletastats;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SimpleCursorAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class TiradasActivity extends Activity{

    private TextView tvTirada;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnBorrar;
    private Button btnGuardar;

    private boolean primero = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiradas);

        tvTirada = (TextView) findViewById(R.id.tvTirada);

        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btnBorrar = (Button)findViewById(R.id.btnBorrar);
        btnGuardar = (Button)findViewById(R.id.btnGuardar);

        final Spinner spRuleta = (Spinner) findViewById(R.id.spRuleta);
        final Spinner spCrupier = (Spinner) findViewById(R.id.spCrupier);
        final CheckBox cbElectricaTiradas = (CheckBox) findViewById(R.id.cbElectricaTiradas);
        final TextView ultimoNumero = (TextView) findViewById(R.id.ultimoNumero);

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

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(primero) {
                    tvTirada.setText("0");
                }
                else{
                    tvTirada.setText(tvTirada.getText().toString() + "0");
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(primero) {
                    tvTirada.setText("1");
                    primero = false;
                }
                else{
                    tvTirada.setText(tvTirada.getText().toString() + "1");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(primero) {
                    tvTirada.setText("2");
                    primero = false;
                }
                else{
                    tvTirada.setText(tvTirada.getText().toString() + "2");
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(primero) {
                    tvTirada.setText("3");
                    primero = false;
                }
                else{
                    tvTirada.setText(tvTirada.getText().toString() + "3");
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(primero) {
                    tvTirada.setText("4");
                    primero = false;
                }
                else{
                    tvTirada.setText(tvTirada.getText().toString() + "4");
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(primero) {
                    tvTirada.setText("5");
                    primero = false;
                }
                else{
                    tvTirada.setText(tvTirada.getText().toString() + "5");
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(primero) {
                    tvTirada.setText("6");
                    primero = false;
                }
                else{
                    tvTirada.setText(tvTirada.getText().toString() + "6");
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(primero) {
                    tvTirada.setText("7");
                    primero = false;
                }
                else{
                    tvTirada.setText(tvTirada.getText().toString() + "7");
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(primero) {
                    tvTirada.setText("8");
                    primero = false;
                }
                else{
                    tvTirada.setText(tvTirada.getText().toString() + "8");
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(primero) {
                    tvTirada.setText("9");
                    primero = false;
                }
                else{
                    tvTirada.setText(tvTirada.getText().toString() + "9");
                }
            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvTirada.setText("");
                primero = true;
            }
        });

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primero = true;
                int tirada;

                if(tvTirada.getText().toString().equals("")){
                    tirada = 37;
                }
                else{
                    tirada = Integer.parseInt(tvTirada.getText().toString());
                }

                tvTirada.setText("");

                if(tirada < 37){

                    //RuletaDAO rDAO = new RuletaDAO(TiradasActivity.this);
                    //CrupierDAO cDAO = new CrupierDAO(TiradasActivity.this);

                    if(spRuleta.getSelectedItem() == null){
                        Toast.makeText(getApplicationContext(), "Crea antes una ruleta", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        if(spCrupier.getSelectedItem() == null || cbElectricaTiradas.isChecked()){
                            int idRuleta = Integer.parseInt(((Cursor) spRuleta.getSelectedItem()).getString(0));
                            int numero = tirada;

                            Tirada t = new Tirada(idRuleta, numero);
                            TiradaDAO tDAO = new TiradaDAO(TiradasActivity.this);
                            tDAO.insertSinCrupier(t);

                            Toast.makeText(getApplicationContext(), "Tirada guardada sin crupier", Toast.LENGTH_SHORT).show();

                            if(numero == 0){
                                ultimoNumero.setTextColor(ultimoNumero.getContext().getResources().getColor(R.color.VERDE));
                            }
                            else if(numero == 1 || numero == 3 || numero == 5 || numero == 7 || numero == 9 || numero == 12
                                    || numero == 14 || numero == 16 || numero == 18 || numero == 19 || numero == 21 || numero == 23
                                    || numero == 25 || numero == 27 || numero == 30 || numero == 32 || numero == 34 || numero == 36){
                                ultimoNumero.setTextColor(ultimoNumero.getContext().getResources().getColor(R.color.ROJO));
                            }
                            else{
                                ultimoNumero.setTextColor(ultimoNumero.getContext().getResources().getColor(R.color.NEGRO));
                            }

                            ultimoNumero.setText(String.valueOf(numero));

                        }
                        else {
                            int idRuleta = Integer.parseInt(((Cursor) spRuleta.getSelectedItem()).getString(0));
                            int idCrupier = Integer.parseInt(((Cursor) spCrupier.getSelectedItem()).getString(0));
                            int numero = tirada;

                            Tirada t = new Tirada(idRuleta, idCrupier, numero);
                            TiradaDAO tDAO = new TiradaDAO(TiradasActivity.this);
                            tDAO.insert(t);

                            Toast.makeText(getApplicationContext(), "Tirada guardada", Toast.LENGTH_SHORT).show();

                            ultimoNumero.setText(String.valueOf(numero));
                        }
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(), "Número incorrecto, no se ha guardado", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }

}
