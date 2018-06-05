package com.example.asus_pc.peliculas.Pelicula.reporitory;

import com.example.asus_pc.peliculas.ApiRest.RestApiAdapter;
import com.example.asus_pc.peliculas.ApiRest.Service;
import com.example.asus_pc.peliculas.Pelicula.interactor.PeliculaFragmentInteractor;
import com.example.asus_pc.peliculas.Pelicula.model.Pelicula;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public class PeliculaFragmentRepositoryImpl  implements PeliculaFragmentRepository{
    private PeliculaFragmentInteractor peliculaFragmentInteractor;
    List<Pelicula> peliculaList;

    public PeliculaFragmentRepositoryImpl(PeliculaFragmentInteractor peliculaFragmentInteractor) {
        this.peliculaFragmentInteractor = peliculaFragmentInteractor;
    }

    @Override
    public void getDataPelicula() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<List<Pelicula>> groups = service.getDataPelicula();
        groups.enqueue(new Callback<List<Pelicula>>() {
            @Override
            public void onResponse(Call<List<Pelicula>> call, Response<List<Pelicula>> response) {
                peliculaList = response.body();
                peliculaFragmentInteractor.showResultPelicula(peliculaList);
            }

            @Override
            public void onFailure(Call<List<Pelicula>> call, Throwable t) {

            }
        });
    }
}
