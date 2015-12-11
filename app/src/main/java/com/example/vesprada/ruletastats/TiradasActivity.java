package com.example.vesprada.ruletastats;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
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
                    Toast.makeText(getApplicationContext(), "Tirada guardada", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Número incorrecto, no se ha guardado", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
