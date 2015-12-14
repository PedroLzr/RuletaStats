package com.example.vesprada.ruletastats;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CrupierAdapter extends ArrayAdapter<Crupier> {

    Crupier[] lista;

    public CrupierAdapter(Context context, Crupier[] crupiers){
        super(context, R.layout.listitem_ruleta, crupiers);
        this.lista = crupiers;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View item = convertView;
        ViewHolderCrupiers holder;

        if (item == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            item = inflater.inflate(R.layout.listitem_crupier, null);

            holder = new ViewHolderCrupiers();
            holder.ID = (TextView) item.findViewById(R.id.idCrupier);
            holder.nombre = (TextView) item.findViewById(R.id.nombreCrupier);
            holder.descripcion = (TextView) item.findViewById(R.id.descripcionCrupier);

            item.setTag(holder);
        } else {
            holder = (ViewHolderCrupiers) item.getTag();
        }

        holder.nombre.setText(lista[position].getNombre());
        holder.ID.setText(lista[position].getID());
        holder.descripcion.setText(lista[position].getDescripcion());

        return (item);
    }

}
