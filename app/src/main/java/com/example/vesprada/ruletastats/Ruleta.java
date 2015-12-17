package com.example.vesprada.ruletastats;

public class Ruleta {

    public static final String TABLE = "Ruleta";

    public static final String KEY_ID = "id";
    public static final String KEY_NOMBRE = "nombre";

    private int ID;
    private String nombre;

    public Ruleta(){}

    public Ruleta(int id, String nombre){
        this.ID = id;
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
