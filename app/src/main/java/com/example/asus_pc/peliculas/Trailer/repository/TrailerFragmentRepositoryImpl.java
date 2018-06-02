package com.example.asus_pc.peliculas.Trailer.repository;

import com.example.asus_pc.peliculas.ApiRest.RestApiAdapter;
import com.example.asus_pc.peliculas.ApiRest.Service;
import com.example.asus_pc.peliculas.Trailer.interactor.TrailerFragmentInteractor;
import com.example.asus_pc.peliculas.Trailer.model.Trailer;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public class TrailerFragmentRepositoryImpl implements TrailerFragmentRepository{

    private TrailerFragmentInteractor trailerFragmentInteractor;
    List<Trailer> trailerList;

    public TrailerFragmentRepositoryImpl(TrailerFragmentInteractor trailerFragmentInteractor) {
        this.trailerFragmentInteractor = trailerFragmentInteractor;
    }


    @Override
    public void getDataTrailer() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<List<Trailer>> news = service.getDataTrailer();
        news.enqueue(new Callback<List<Trailer>>() {
            @Override
            public void onResponse(Call<List<Trailer>> call, Response<List<Trailer>> response) {
                trailerList = response.body();
                trailerFragmentInteractor.showResultTrailer(trailerList);
            }

            @Override
            public void onFailure(Call<List<Trailer>> call, Throwable t) {

            }
        });
    }
}
