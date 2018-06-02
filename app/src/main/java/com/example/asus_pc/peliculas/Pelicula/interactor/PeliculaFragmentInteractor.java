package com.example.asus_pc.peliculas.Pelicula.interactor;

import com.example.asus_pc.peliculas.Pelicula.model.Pelicula;

import java.util.List;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public interface PeliculaFragmentInteractor {
    void getDataPelicula();
    void showResultPelicula(List<Pelicula> peliculaList);
}
