package com.example.asus_pc.peliculas.Genero.interactor;

import com.example.asus_pc.peliculas.Genero.model.Genero;
import com.example.asus_pc.peliculas.Genero.presenter.GeneroFragmentPresenter;
import com.example.asus_pc.peliculas.Genero.reposiroty.GeneroFragmentrepository;
import com.example.asus_pc.peliculas.Genero.reposiroty.GeneroFragmentrepositoryImpl;

import java.util.List;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public class GeneroFragmentInteratorImpl implements GeneroFragmentInterator {
    private GeneroFragmentPresenter generoFragmentPresenter;
    private GeneroFragmentrepository generoFragmentRepository;

    public GeneroFragmentInteratorImpl(GeneroFragmentPresenter generoFragmentPresenter) {
        this.generoFragmentPresenter = generoFragmentPresenter;
        generoFragmentRepository = new GeneroFragmentrepositoryImpl(this);
    }



    @Override
    public void getDataGenero() {
        generoFragmentRepository.getDataGenero();
    }

    @Override
    public void showResultGenero(List<Genero> generoList) {
        generoFragmentPresenter.showResultGenero(generoList);
    }
}
