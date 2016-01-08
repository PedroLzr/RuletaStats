package com.example.vesprada.ruletastats;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class RuletaAdapter extends ArrayAdapter<Ruleta> {

    ArrayList<Ruleta> lista;

    public RuletaAdapter(Context context, ArrayList<Ruleta> ruletas){
        super(context, R.layout.listitem_ruleta, ruletas);
        this.lista = ruletas;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View item = convertView;
        ViewHolderRuletas holder;

        if (item == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            item = inflater.inflate(R.layout.listitem_ruleta, null);

            holder = new ViewHolderRuletas();
            holder.ID = (TextView) item.findViewById(R.id.idRuleta);
            holder.nombre = (TextView) item.findViewById(R.id.nombreRuleta);
            holder.electrica = (TextView) item.findViewById(R.id.electrica);

            item.setTag(holder);
        } else {
            holder = (ViewHolderRuletas) item.getTag();
        }

        holder.nombre.setText(lista.get(position).getNombre());
        holder.ID.setText(String.valueOf(lista.get(position).getID()));
        String elec = "";
        if(lista.get(position).getElectrica()==0){
            elec = "No";
        }
        else{
            elec = "Si";
        }
        holder.electrica.setText(elec);

        return (item);
    }

    public int getIDRuletaDesdeListView(int position){
        return lista.get(position).getID();
    }

}
