package com.example.asus_pc.peliculas.Genero.presenter;

import com.example.asus_pc.peliculas.Genero.model.Genero;

import java.util.List;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public interface GeneroFragmentPresenter {
    void showResultGenero(List<Genero> generoList);
    void getDataGenero();
}
