package com.example.vesprada.ruletastats;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 8;
    private static final String DATABASE_NAME = "NoAzar.db";

    public DBHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_TABLE_RULETA = "CREATE TABLE " + Ruleta.TABLE + "("
                + Ruleta.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Ruleta.KEY_NOMBRE + " TEXT, "
                + Ruleta.KEY_ELECTRICA + " INTEGER)";

        db.execSQL(CREATE_TABLE_RULETA);

        String CREATE_TABLE_CRUPIER = "CREATE TABLE " + Crupier.TABLE + "("
                + Crupier.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Crupier.KEY_NOMBRE + " TEXT, "
                + Crupier.KEY_DESCRIPCION + " TEXT)";

        db.execSQL(CREATE_TABLE_CRUPIER);

        String CREATE_TABLE_TIRADA = "CREATE TABLE " + Tirada.TABLE + "("
                + Tirada.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Tirada.KEY_ID_CRUPIER + " INTEGER, "
                + Tirada.KEY_ID_RULETA + " INTEGER, "
                + Tirada.KEY_NUMERO + " INTEGER, "
                + "FOREIGN KEY (" + Tirada.KEY_ID_CRUPIER + ") REFERENCES " + Crupier.TABLE + "(" + Tirada.KEY_ID_CRUPIER + ")"
                + "FOREIGN KEY (" + Tirada.KEY_ID_RULETA + ") REFERENCES " + Ruleta.TABLE + "(" + Tirada.KEY_ID_RULETA + "))";

        db.execSQL(CREATE_TABLE_TIRADA);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + Ruleta.TABLE);
        db.execSQL("DROP TABLE IF EXISTS " + Crupier.TABLE);
        db.execSQL("DROP TABLE IF EXISTS " + Tirada.TABLE);

        onCreate(db);
    }
}
