package com.example.vesprada.ruletastats;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;

public class CrupierDAO {

    private DBHelper dbHelper;

    public CrupierDAO(Context context){
        dbHelper = new DBHelper(context);
    }

    public int insert(Crupier crupier){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Crupier.KEY_NOMBRE, crupier.getNombre());
        values.put(Crupier.KEY_DESCRIPCION, crupier.getDescripcion());

        long crupier_id = db.insert(Crupier.TABLE, null, values);
        db.close();
        return (int) crupier_id;
    }

    public Cursor getCrupiers(){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        return db.rawQuery(
                "select id AS _id, nombre from " + Crupier.TABLE, null);
    }

    public int getIDxNombre(String nombre){
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        Cursor c = db.rawQuery("SELECT id FROM " + Crupier.TABLE + " WHERE nombre = '" + nombre + "';", null);

        if(c.moveToFirst()) {
            return c.getInt(0);
        }
        else{
            return 0;
        }
    }

    public ArrayList<Crupier> getCrupiersArray(){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ArrayList<Crupier> crupiers = new ArrayList<Crupier>();

        String sql = "SELECT " + Crupier.KEY_ID
                + ", " + Crupier.KEY_NOMBRE
                + ", " + Crupier.KEY_DESCRIPCION + " FROM " + Crupier.TABLE + ";";

        Cursor c = db.rawQuery(sql, null);

        if(c.moveToFirst()){
            do{
                Crupier crupier = new Crupier(c.getInt(0), c.getString(1), c.getString(2));
                crupiers.add(crupier);
            }while(c.moveToNext());
        }
        else{
            Log.v("SQLite01", "No se encuentra nada");
            crupiers.add(new Crupier(0, "No hay crupiers", ""));
        }

        return crupiers;
    }

}
