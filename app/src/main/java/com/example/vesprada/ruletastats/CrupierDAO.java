package com.example.vesprada.ruletastats;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

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

}
