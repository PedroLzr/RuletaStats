package com.example.vesprada.ruletastats;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;

public class TiradaDAO {

    private DBHelper dbHelper;

    public TiradaDAO(Context context){
        dbHelper = new DBHelper(context);
    }

    public int insert(Tirada tirada){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Tirada.KEY_ID_RULETA, tirada.getId_ruleta());
        values.put(Tirada.KEY_ID_CRUPIER, tirada.getId_crupier());
        values.put(Tirada.KEY_NUMERO, tirada.getNumero());

        long tirada_id = db.insert(Tirada.TABLE, null, values);
        db.close();
        return (int) tirada_id;
    }

    public ArrayList<Integer> getTiradas(int id_ruleta, int id_crupier){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        String sql = "SELECT " + Tirada.KEY_NUMERO + " FROM " + Tirada.TABLE + " WHERE " + Tirada.KEY_ID_RULETA + " = " + id_ruleta + " AND "
                + Tirada.KEY_ID_CRUPIER +" = " + id_crupier + ";";
        Log.v("SQLite01", sql);
        Cursor c = db.rawQuery(sql, null);

        if(c.moveToFirst()){
            do{
                numeros.add(c.getInt(0));
            }while(c.moveToNext());
        }
        else{
            Log.v("SQLite01", "No se encuentra nada");
            numeros.add(0);
        }

        return numeros;
    }

    public ArrayList<Integer> getTiradasXRuleta(int id_ruleta){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        String sql = "SELECT " + Tirada.KEY_NUMERO + " FROM " + Tirada.TABLE + " WHERE " + Tirada.KEY_ID_RULETA + " = " + id_ruleta + ";";
        Log.v("SQLite01", sql);
        Cursor c = db.rawQuery(sql, null);

        if(c.moveToFirst()){
            do{
                numeros.add(c.getInt(0));
            }while(c.moveToNext());
        }
        else{
            Log.v("SQLite01", "No se encuentra nada");
            numeros.add(0);
        }

        return numeros;
    }

}
