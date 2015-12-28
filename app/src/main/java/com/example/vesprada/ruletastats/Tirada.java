package com.example.vesprada.ruletastats;


public class Tirada {

    public static final String TABLE = "Tirada";

    public static final String KEY_ID = "id";
    public static final String KEY_ID_RULETA = "id_ruleta";
    public static final String KEY_ID_CRUPIER = "id_crupier";
    public static final String KEY_NUMERO = "numero";

    private int ID;
    private int id_ruleta;
    private int id_crupier;
    private int numero;

    public Tirada(){}

    public Tirada(int id_ruleta, int id_crupier, int numero){
        this.id_ruleta = id_ruleta;
        this.id_crupier = id_crupier;
        this.numero = numero;
    }

    public int getID() {
        return ID;
    }

    public int getId_ruleta() {
        return id_ruleta;
    }

    public int getId_crupier() {
        return id_crupier;
    }

    public int getNumero() {
        return numero;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setId_ruleta(int id_ruleta) {
        this.id_ruleta = id_ruleta;
    }

    public void setId_crupier(int id_crupier) {
        this.id_crupier = id_crupier;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
