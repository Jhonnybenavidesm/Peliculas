package com.example.asus_pc.peliculas.Pelicula.presenter;

import com.example.asus_pc.peliculas.Pelicula.model.Pelicula;

import java.util.List;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public interface PeliculaFragmentPresenter {
    void showResultPelicula(List<Pelicula> peliculasList);
    void getDataPelicula();
}
