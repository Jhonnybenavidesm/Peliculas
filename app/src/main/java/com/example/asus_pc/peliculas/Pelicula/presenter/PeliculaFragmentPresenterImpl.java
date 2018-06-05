package com.example.asus_pc.peliculas.Pelicula.presenter;

import com.example.asus_pc.peliculas.Pelicula.interactor.PeliculaFragmentInteractor;
import com.example.asus_pc.peliculas.Pelicula.interactor.PeliculaFragmentInteractorImpl;
import com.example.asus_pc.peliculas.Pelicula.model.Pelicula;
import com.example.asus_pc.peliculas.Pelicula.view.PeliculaFragmentView;

import java.util.List;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public class PeliculaFragmentPresenterImpl implements PeliculaFragmentPresenter{

    private PeliculaFragmentView peliculaFragmentView;
    private PeliculaFragmentInteractor peliculaFragmentInteractor;

    public PeliculaFragmentPresenterImpl(PeliculaFragmentView peliculaFragmentView) {
        this.peliculaFragmentView = peliculaFragmentView;
        peliculaFragmentInteractor = new PeliculaFragmentInteractorImpl(this);
    }

    @Override
    public void showResultPelicula(List<Pelicula> peliculasList) {
        peliculaFragmentView.showResultPelicula(peliculasList);
    }

    @Override
    public void getDataPelicula() {
        peliculaFragmentInteractor.getDataPelicula();
    }
}
