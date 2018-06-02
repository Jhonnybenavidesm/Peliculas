package com.example.asus_pc.peliculas.Sinopsis.presenter;

import com.example.asus_pc.peliculas.Sinopsis.model.Sinopsis;

import java.util.List;

/**
 * Created by Asus-PC on 02/06/2018.
 */

public interface SinopsisFragmentPresenter {
    void showResultSinopsis(List<Sinopsis> sinopsisList);
    void getDataSinopsis();
}
