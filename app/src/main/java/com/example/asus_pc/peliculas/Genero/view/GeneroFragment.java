package com.example.asus_pc.peliculas.Genero.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.asus_pc.peliculas.Genero.adapter.GeneroAdapter;
import com.example.asus_pc.peliculas.Genero.model.Genero;
import com.example.asus_pc.peliculas.Genero.presenter.GeneroFragmentPresenter;
import com.example.asus_pc.peliculas.Genero.presenter.GeneroFragmentPresenterImpl;
import com.example.asus_pc.peliculas.R;

import java.util.List;


public class GeneroFragment extends Fragment implements GeneroFragmentView{
    private GeneroFragmentPresenter generoFragmentPresenter;
    ProgressBar progressBarGroup;
    RecyclerView recyclerViewGroup;

    public GeneroFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_genero, container, false);

        progressBarGroup = (ProgressBar) view.findViewById(R.id.id_pgb_genero);
        recyclerViewGroup = (RecyclerView) view.findViewById(R.id.id_rcv_genero);
        recyclerViewGroup.setLayoutManager(new LinearLayoutManager(getContext()));

        generoFragmentPresenter = new GeneroFragmentPresenterImpl(this);

        progressBarGroup.setVisibility(View.VISIBLE);
        generoFragmentPresenter.getDataGenero();

        return view;
    }

    @Override
    public void showResultGenero(List<Genero> generoList) {
        progressBarGroup.setVisibility(View.GONE);
        recyclerViewGroup.setAdapter(new GeneroAdapter(generoList, getContext()));
    }
}
