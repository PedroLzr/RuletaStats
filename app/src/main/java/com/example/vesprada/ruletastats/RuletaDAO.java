package com.example.vesprada.ruletastats;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class RuletaDAO {

    private DBHelper dbHelper;

    public RuletaDAO(Context context){
        dbHelper = new DBHelper(context);
    }

    public int insert(Ruleta ruleta){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Ruleta.KEY_NOMBRE, ruleta.getNombre());


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

}
