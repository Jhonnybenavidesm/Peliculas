package com.example.asus_pc.peliculas.Trailer.interactor;

import com.example.asus_pc.peliculas.Trailer.model.Trailer;
import com.example.asus_pc.peliculas.Trailer.presenter.TrailerFragmentPresenter;
import com.example.asus_pc.peliculas.Trailer.repository.TrailerFragmentRepository;
import com.example.asus_pc.peliculas.Trailer.repository.TrailerFragmentRepositoryImpl;

import java.util.List;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public class TrailerFragmentInteractorImpl implements TrailerFragmentInteractor{

    private TrailerFragmentPresenter trailerFragmentPresenter;
    private TrailerFragmentRepository trailerFragmentRepository;

    public TrailerFragmentInteractorImpl(TrailerFragmentPresenter trailerFragmentPresenter) {
        this.trailerFragmentPresenter = trailerFragmentPresenter;
        trailerFragmentRepository = new TrailerFragmentRepositoryImpl(this);
    }

    @Override
    public void getDataTrailer() {
        trailerFragmentRepository.getDataTrailer();
    }

    @Override
    public void showResultTrailer(List<Trailer> trailerList) {
        trailerFragmentPresenter.showResultTrailer(trailerList);
    }
}
