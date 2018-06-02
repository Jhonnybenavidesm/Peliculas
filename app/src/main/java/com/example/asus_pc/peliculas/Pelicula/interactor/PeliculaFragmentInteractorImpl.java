package com.example.asus_pc.peliculas.Pelicula.interactor;

import com.example.asus_pc.peliculas.Pelicula.model.Pelicula;
import com.example.asus_pc.peliculas.Pelicula.presenter.PeliculaFragmentPresenter;
import com.example.asus_pc.peliculas.Pelicula.reporitory.PeliculaFragmentRepository;
import com.example.asus_pc.peliculas.Pelicula.reporitory.PeliculaFragmentRepositoryImpl;

import java.util.List;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public class PeliculaFragmentInteractorImpl implements PeliculaFragmentInteractor{
    private PeliculaFragmentPresenter peliculaFragmentPresenter;
    private PeliculaFragmentRepository peliculaFragmentRepository;

    public PeliculaFragmentInteractorImpl(PeliculaFragmentPresenter peliculaFragmentPresenter) {
        this.peliculaFragmentPresenter = peliculaFragmentPresenter;
        peliculaFragmentRepository = new PeliculaFragmentRepositoryImpl(this);
    }


    @Override
    public void getDataPelicula() {
        peliculaFragmentRepository.getDataPelicula();
    }

    @Override
    public void showResultPelicula(List<Pelicula> peliculaList) {
        peliculaFragmentPresenter.showResultPelicula(peliculaList);
    }
}
