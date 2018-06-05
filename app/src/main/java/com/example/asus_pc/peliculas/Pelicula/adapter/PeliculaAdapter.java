package com.example.asus_pc.peliculas.Pelicula.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus_pc.peliculas.Pelicula.model.Pelicula;
import com.example.asus_pc.peliculas.R;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public class PeliculaAdapter extends RecyclerView.Adapter {

    List<Pelicula> peliculaList;
    Context context;

    public PeliculaAdapter(List<Pelicula> peliculaList, Context context) {
        this.peliculaList = peliculaList;
        this.context = context;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pelicula, parent, false);
        return new PeliculaAdapter.ViewHolderPelicula(item);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Pelicula object = peliculaList.get(position);
        PeliculaAdapter.ViewHolderPelicula viewHolderPelicula = (PeliculaAdapter.ViewHolderPelicula) holder;
        viewHolderPelicula.textViewPeliculaName.setText(object.getTitulo());
        Picasso.get().load(object.getImagen()).into(viewHolderPelicula.imageViewPeliculaImg);
    }

    @Override
    public int getItemCount() {

            return peliculaList.size();
    }

    public class ViewHolderPelicula extends RecyclerView.ViewHolder {
        TextView textViewPeliculaName;
        ImageView imageViewPeliculaImg;

        public ViewHolderPelicula(View item) {
            super(item);
            textViewPeliculaName = item.findViewById(R.id.id_txv_pelicula_name);
            imageViewPeliculaImg = item.findViewById(R.id.id_img_pelicula);
        }
    }
}
