package com.example.asus_pc.peliculas.ApiRest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public class RestApiAdapter {
    public Service getClientService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(Service.class);
    }
}
