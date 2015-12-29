package com.example.vesprada.ruletastats;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;

public class RuletaDAO {

    private DBHelper dbHelper;

    public RuletaDAO(Context context){
        dbHelper = new DBHelper(context);
    }

    public int insert(Ruleta ruleta){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Ruleta.KEY_NOMBRE, ruleta.getNombre());
        values.put(Ruleta.KEY_ELECTRICA, ruleta.getElectrica());


        long ruleta_id = db.insert(Ruleta.TABLE, null, values);
        db.close();
        return (int) ruleta_id;
    }

    public Cursor getRuletas(){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        return db.rawQuery(
                "SELECT id AS _id, nombre FROM " + Ruleta.TABLE, null);
    }

    public int getIDxNombre(String nombre){
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        Cursor c = db.rawQuery("SELECT id FROM " + Ruleta.TABLE + " WHERE nombre = '" + nombre + "';", null);

        if(c.moveToFirst()) {
            return c.getInt(0);
        }
        else{
            return 0;
        }
    }

    public ArrayList<Ruleta> getRuletasArray(){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ArrayList<Ruleta> ruletas = new ArrayList<Ruleta>();

        String sql = "SELECT " + Ruleta.KEY_ID
        + ", " + Ruleta.KEY_NOMBRE
        + ", " + Ruleta.KEY_ELECTRICA + " FROM " + Ruleta.TABLE + ";";

        Cursor c = db.rawQuery(sql, null);

        if(c.moveToFirst()){
            do{
                Ruleta r = new Ruleta(c.getInt(0), c.getString(1), c.getInt(2));
                ruletas.add(r);
            }while(c.moveToNext());
        }
        else{
            Log.v("SQLite01", "No se encuentra nada");
            ruletas.add(new Ruleta(0, "No hay ruletas", 0));
        }

        return ruletas;
    }

}
