package com.example.asus_pc.peliculas.Trailer.view;

import com.example.asus_pc.peliculas.Trailer.model.Trailer;

import java.util.List;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public interface TrailerFragmentView {
    void getDataTrailer();
    void showResultTrailer(List<Trailer> trailerList);
}
