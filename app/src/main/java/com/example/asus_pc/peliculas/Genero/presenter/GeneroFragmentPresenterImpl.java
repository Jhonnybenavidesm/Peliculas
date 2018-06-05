package com.example.asus_pc.peliculas.Genero.presenter;

import com.example.asus_pc.peliculas.Genero.interactor.GeneroFragmentInterator;
import com.example.asus_pc.peliculas.Genero.interactor.GeneroFragmentInteratorImpl;
import com.example.asus_pc.peliculas.Genero.model.Genero;
import com.example.asus_pc.peliculas.Genero.view.GeneroFragmentView;

import java.util.List;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public class GeneroFragmentPresenterImpl implements GeneroFragmentPresenter {

    private GeneroFragmentView generoFragmentView;
    private GeneroFragmentInterator generoFragmentInteractor;

    public GeneroFragmentPresenterImpl(GeneroFragmentView generoFragmentView) {
        this.generoFragmentView = generoFragmentView;
        generoFragmentInteractor = new GeneroFragmentInteratorImpl(this);
    }
    @Override
    public void showResultGenero(List<Genero> generoList) {
        generoFragmentView.showResultGenero(generoList);
    }

    @Override
    public void getDataGenero() {
        generoFragmentInteractor.getDataGenero();
    }
}
