package com.example.vesprada.ruletastats;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class RuletaAdapter extends ArrayAdapter<Ruleta> {

    Ruleta[] lista;

    public RuletaAdapter(Context context, Ruleta[] ruletas){
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

            item.setTag(holder);
        } else {
            holder = (ViewHolderRuletas) item.getTag();
        }

        holder.nombre.setText(lista[position].getNombre());
        holder.ID.setText(lista[position].getID());

        return (item);
    }

}
