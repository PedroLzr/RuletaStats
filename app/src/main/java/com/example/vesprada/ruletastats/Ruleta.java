package com.example.vesprada.ruletastats;

public class Ruleta {

    public static final String TABLE = "Ruleta";

    public static final String KEY_ID = "id";
    public static final String KEY_NOMBRE = "nombre";
    public static final String KEY_ELECTRICA = "electrica";

    private int ID;
    private String nombre;
    private int electrica;

    public Ruleta(){}

    public Ruleta(String nombre){
        this.nombre = nombre;
    }

    public Ruleta(String nombre, int elec){
        this.nombre = nombre;
        this.electrica = elec;
    }

    public Ruleta(int id, String nombre, int elec){
        this.ID = id;
        this.nombre = nombre;
        this.electrica = elec;
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

    public int getElectrica() {
        return electrica;
    }

    public void setElectrica(int electrica) {
        this.electrica = electrica;
    }
}
