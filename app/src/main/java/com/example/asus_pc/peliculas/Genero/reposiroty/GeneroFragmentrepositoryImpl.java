package com.example.asus_pc.peliculas.Genero.reposiroty;

import com.example.asus_pc.peliculas.ApiRest.RestApiAdapter;
import com.example.asus_pc.peliculas.ApiRest.Service;
import com.example.asus_pc.peliculas.Genero.interactor.GeneroFragmentInterator;
import com.example.asus_pc.peliculas.Genero.model.Genero;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public class GeneroFragmentrepositoryImpl implements GeneroFragmentrepository {

    private GeneroFragmentInterator generoFragmentInteractor;
    List<Genero> generoList;

    public GeneroFragmentrepositoryImpl(GeneroFragmentInterator generoFragmentInteractor) {
        this.generoFragmentInteractor = generoFragmentInteractor;
    }
    @Override
    public void getDataGenero() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<List<Genero>> generos = service.getDataGenero();
        generos.enqueue(new Callback<List<Genero>>() {
            @Override
            public void onResponse(Call<List<Genero>> call, Response<List<Genero>> response) {
                generoList = response.body();
                generoFragmentInteractor.showResultGeneros(generoList);
            }

            @Override
            public void onFailure(Call<List<Genero>> call, Throwable t) {

            }
        });
        }
}
