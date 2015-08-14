package com.mayrajaramillo.appcurso;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by MayraH on 10/08/2015.
 */
public class MascotasAdapter extends ArrayAdapter<Mascotas> {
    Context context;
    int layoutId;
    Mascotas datos[] = null;

    public MascotasAdapter(Context context, int layoutId, Mascotas[] datos) {
        super(context, layoutId, datos);
        this.context = context;
        this.layoutId = layoutId;
        this.datos = datos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View renglon = convertView;
        MascotasHolder holder = null;
        if (renglon == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            renglon = inflater.inflate(layoutId, parent, false);
            holder = new MascotasHolder();
            holder.imagen = (ImageView) renglon.findViewById(R.id.image);
            holder.nombre = (TextView) renglon.findViewById(R.id.text);
            renglon.setTag(holder);
        } else {
            holder = (MascotasHolder) renglon.getTag();
        }
        Mascotas mascotas = datos[position];
        holder.nombre.setText(mascotas.nombre);
        holder.imagen.setImageResource(mascotas.imagen);
        return renglon;

    }

    static class MascotasHolder {
        ImageView imagen;
        TextView nombre;
    }
}
