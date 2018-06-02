package com.example.asus_pc.peliculas.Sinopsis.view;

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

import com.example.asus_pc.peliculas.R;
import com.example.asus_pc.peliculas.Sinopsis.adapter.SinopsisAdapter;
import com.example.asus_pc.peliculas.Sinopsis.model.Sinopsis;
import com.example.asus_pc.peliculas.Sinopsis.presenter.SinopsisFragmentPresenter;
import com.example.asus_pc.peliculas.Sinopsis.presenter.SinopsisFragmentPresenterImpl;

import java.util.List;


public class SInopsisFragment extends Fragment implements SinopsisFragmentView{
    private SinopsisFragmentPresenter sinopsisFragmentPresenter;
    ProgressBar progressBarSinopsis;
    RecyclerView recyclerViewSinopsis;

    public SInopsisFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sinopsis, container, false);

        progressBarSinopsis = (ProgressBar) view.findViewById(R.id.id_pgb_sinopsis);
        recyclerViewSinopsis = (RecyclerView) view.findViewById(R.id.id_rcv_sinopsis);
        recyclerViewSinopsis.setLayoutManager(new LinearLayoutManager(getContext()));

        sinopsisFragmentPresenter = new SinopsisFragmentPresenterImpl(this);

        progressBarSinopsis.setVisibility(View.VISIBLE);
        sinopsisFragmentPresenter.getDataSinopsis();

        return view;
    }


    @Override
    public void showResultSinopsis(List<Sinopsis> sinopsisList) {
        progressBarSinopsis.setVisibility(View.GONE);
        recyclerViewSinopsis.setAdapter(new SinopsisAdapter(sinopsisList, getContext()));
    }
}
