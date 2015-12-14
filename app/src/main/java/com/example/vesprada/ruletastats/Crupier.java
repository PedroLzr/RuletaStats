package com.example.vesprada.ruletastats;

public class Crupier {

    private int ID;
    private String nombre;
    private String descripcion;

    public Crupier(){}

    public Crupier(int id, String nombre, String descripcion){
        this.ID = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getID() {
        return ID;
    }

    public String getDescripcion() {
        return descripcion;
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

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}