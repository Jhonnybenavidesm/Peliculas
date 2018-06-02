package com.example.asus_pc.peliculas.Sinopsis.presenter;

import com.example.asus_pc.peliculas.Sinopsis.interactor.SinopsisFragmentInteractor;
import com.example.asus_pc.peliculas.Sinopsis.interactor.SinopsisFragmentInteractorImpl;
import com.example.asus_pc.peliculas.Sinopsis.model.Sinopsis;
import com.example.asus_pc.peliculas.Sinopsis.view.SinopsisFragmentView;

import java.util.List;

/**
 * Created by Asus-PC on 02/06/2018.
 */

public class SinopsisFragmentPresenterImpl implements SinopsisFragmentPresenter {

    private SinopsisFragmentView sinopsisFragmentView;
    private SinopsisFragmentInteractor sinopsisFragmentInteractor;

    public SinopsisFragmentPresenterImpl(SinopsisFragmentView sinopsisFragmentView) {
        this.sinopsisFragmentView = sinopsisFragmentView;
        sinopsisFragmentInteractor = new SinopsisFragmentInteractorImpl(this);
    }

    @Override
    public void showResultSinopsis(List<Sinopsis> sinopsisList) {
        sinopsisFragmentInteractor.showResultSinopsis(sinopsisList);
    }

    @Override
    public void getDataSinopsis() {
        sinopsisFragmentInteractor.getDataSinopsis();
    }
}
