package com.example.asus_pc.peliculas.Genero.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.asus_pc.peliculas.Genero.model.Genero;
import com.example.asus_pc.peliculas.Pelicula.model.Pelicula;
import com.example.asus_pc.peliculas.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public class GeneroAdapter extends RecyclerView.Adapter {

    List<Genero> generoList;
    Context context;

    public GeneroAdapter(List<Genero> generoList, Context context) {
        this.generoList = generoList;
        this.context = context;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_genero, parent, false);
        return new ViewHolderGenero(item);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Genero object = generoList.get(position);
        ViewHolderGenero viewHolderGroup = (ViewHolderGenero) holder;
        viewHolderGroup.textViewGeneroTitle.setText(object.getGenero());
        viewHolderGroup.textViewGeneroTeamName1.setText(object.getTeam1());
        viewHolderGroup.textViewGeneroTeamName2.setText(object.getTeam2());
        viewHolderGroup.textViewGeneroTeamName3.setText(object.getTeam3());
        viewHolderGroup.textViewGeneroTeamName4.setText(object.getTeam4());
        Picasso.get().load(object.getTeam_img1()).into(viewHolderGroup.circleImageViewGeneroTeam1);
        Picasso.get().load(object.getTeam_img2()).into(viewHolderGroup.circleImageViewGeneroTeam2);
        Picasso.get().load(object.getTeam_img3()).into(viewHolderGroup.circleImageViewGeneroTeam3);
        Picasso.get().load(object.getTeam_img4()).into(viewHolderGroup.circleImageViewGeneroTeam4);

    }

    @Override
    public int getItemCount() {
        return generoList.size();
    }


    public class ViewHolderGenero extends RecyclerView.ViewHolder {
        TextView textViewGeneroTitle, textViewGeneroTeamName1, textViewGeneroTeamName2, textViewGeneroTeamName3, textViewGeneroTeamName4;
        CircleImageView circleImageViewGeneroTeam1, circleImageViewGeneroTeam2, circleImageViewGeneroTeam3, circleImageViewGeneroTeam4;

        public ViewHolderGenero(View item) {
            super(item);
            textViewGeneroTitle = item.findViewById(R.id.id_txv_genero_title);
            textViewGeneroTeamName1 = item.findViewById(R.id.id_txv_genero_teamname1);
            textViewGeneroTeamName2 = item.findViewById(R.id.id_txv_genero_teamname2);
            textViewGeneroTeamName3 = item.findViewById(R.id.id_txv_genero_teamname3);
            textViewGeneroTeamName4 = item.findViewById(R.id.id_txv_genero_teamname4);
            circleImageViewGeneroTeam1 = item.findViewById(R.id.id_img_genero_team1);
            circleImageViewGeneroTeam2 = item.findViewById(R.id.id_img_genero_team2);
            circleImageViewGeneroTeam3 = item.findViewById(R.id.id_img_genero_team3);
            circleImageViewGeneroTeam4 = item.findViewById(R.id.id_img_genero_team4);

        }
    }
}

