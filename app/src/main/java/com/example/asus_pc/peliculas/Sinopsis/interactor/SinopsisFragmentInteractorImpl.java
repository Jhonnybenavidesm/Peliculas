package com.example.asus_pc.peliculas.Sinopsis.interactor;

import com.example.asus_pc.peliculas.Sinopsis.model.Sinopsis;
import com.example.asus_pc.peliculas.Sinopsis.presenter.SinopsisFragmentPresenter;
import com.example.asus_pc.peliculas.Sinopsis.repository.SinopsisFragmentRepository;
import com.example.asus_pc.peliculas.Sinopsis.repository.SinopsisFragmentRepositoryImpl;

import java.util.List;

/**
 * Created by Asus-PC on 02/06/2018.
 */

public class SinopsisFragmentInteractorImpl implements SinopsisFragmentInteractor {

    private SinopsisFragmentPresenter sinopsisFragmentPresenter;
    private SinopsisFragmentRepository sinopsisFragmentRepository;

    public SinopsisFragmentInteractorImpl(SinopsisFragmentPresenter sinopsisFragmentPresenter) {
        this.sinopsisFragmentPresenter = sinopsisFragmentPresenter;
        sinopsisFragmentRepository = new SinopsisFragmentRepositoryImpl(this);
    }

    @Override
    public void getDataSinopsis() {
        sinopsisFragmentRepository.getDataSinopsis();
    }

    @Override
    public void showResultSinopsis(List<Sinopsis> sinopsisList) {
        sinopsisFragmentPresenter.showResultSinopsis(sinopsisList);
    }
}
