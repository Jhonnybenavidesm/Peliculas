package com.example.asus_pc.peliculas.Trailer.presenter;

import com.example.asus_pc.peliculas.Trailer.interactor.TrailerFragmentInteractor;
import com.example.asus_pc.peliculas.Trailer.interactor.TrailerFragmentInteractorImpl;
import com.example.asus_pc.peliculas.Trailer.model.Trailer;
import com.example.asus_pc.peliculas.Trailer.view.TrailerFragmentView;

import java.util.List;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public class TrailerFragmentPresenterImpl implements TrailerFragmentPresenter {

    private TrailerFragmentView trailerFragmentView;
    private TrailerFragmentInteractor trailerFragmentInteractor;

    public TrailerFragmentPresenterImpl(TrailerFragmentView trailerFragmentView) {
        this.trailerFragmentView = trailerFragmentView;
        trailerFragmentInteractor = new TrailerFragmentInteractorImpl(this);
    }

    @Override
    public void getDataTrailer() {
        trailerFragmentInteractor.getDataTrailer();
    }

    @Override
    public void showResultTrailer(List<Trailer> trailerList) {
        trailerFragmentView.showResultTrailer(trailerList);
    }
}
