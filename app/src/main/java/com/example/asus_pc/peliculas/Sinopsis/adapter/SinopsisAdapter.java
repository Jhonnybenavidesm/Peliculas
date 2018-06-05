package com.example.asus_pc.peliculas.Sinopsis.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus_pc.peliculas.R;
import com.example.asus_pc.peliculas.Sinopsis.model.Sinopsis;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Asus-PC on 02/06/2018.
 */

public class SinopsisAdapter extends RecyclerView.Adapter {

    List<Sinopsis> sinopsisList;
    Context context;

    public SinopsisAdapter(List<Sinopsis> sinopsisList, Context context) {
        this.sinopsisList = sinopsisList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sinopsis, parent, false);
        return new ViewHolderSinopsis(item);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Sinopsis object = sinopsisList.get(position);
        ViewHolderSinopsis viewHolderSinopsis = (ViewHolderSinopsis) holder;
        viewHolderSinopsis.textViewSinopsisName.setText(object.getName());

        Picasso.get().load(object.getUrl_img()).into(viewHolderSinopsis.imageViewSinopsisImg);
    }

    @Override
    public int getItemCount() {
        return sinopsisList.size();
    }

    public class ViewHolderSinopsis extends RecyclerView.ViewHolder {

        TextView textViewSinopsisName;
        ImageView imageViewSinopsisImg;

        public ViewHolderSinopsis(View item) {
            super(item);
            textViewSinopsisName = item.findViewById(R.id.id_txv_sinopis_name);
            imageViewSinopsisImg = item.findViewById(R.id.id_img_sinopsis);
        }
    }
}
