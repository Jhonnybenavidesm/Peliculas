package com.example.asus_pc.peliculas.Sinopsis.repository;

import com.example.asus_pc.peliculas.ApiRest.RestApiAdapter;
import com.example.asus_pc.peliculas.ApiRest.Service;
import com.example.asus_pc.peliculas.Sinopsis.interactor.SinopsisFragmentInteractor;
import com.example.asus_pc.peliculas.Sinopsis.model.Sinopsis;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Asus-PC on 02/06/2018.
 */

public class SinopsisFragmentRepositoryImpl implements SinopsisFragmentRepository {

    private SinopsisFragmentInteractor sinopsisFragmentInteractor;
    List<Sinopsis> sinopsisList;

    public SinopsisFragmentRepositoryImpl(SinopsisFragmentInteractor sinopsisFragmentInteractor) {
        this.sinopsisFragmentInteractor = sinopsisFragmentInteractor;
    }


    @Override
    public void getDataSinopsis() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<List<Sinopsis>> groups = service.getDataSinopsis();
        groups.enqueue(new Callback<List<Sinopsis>>() {
            @Override
            public void onResponse(Call<List<Sinopsis>> call, Response<List<Sinopsis>> response) {
                sinopsisList = response.body();
                sinopsisFragmentInteractor.showResultSinopsis(sinopsisList);
            }

            @Override
            public void onFailure(Call<List<Sinopsis>> call, Throwable t) {

            }
        });
    }
}
