package com.example.asus_pc.peliculas.ApiRest;

import android.accounts.Account;

import com.example.asus_pc.peliculas.Genero.model.Genero;
import com.example.asus_pc.peliculas.Login.model.Login;
import com.example.asus_pc.peliculas.Pelicula.model.Pelicula;
import com.example.asus_pc.peliculas.Sinopsis.model.Sinopsis;
import com.example.asus_pc.peliculas.Trailer.model.Trailer;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public interface Service {
    @POST(Constants.URL_POST_LOGIN)
    @FormUrlEncoded
    Call<List<Login>> onSignIn(@Field("user") String user, @Field("pass") String pass);

    @POST(Constants.URL_POST_SIGNUP)
    @FormUrlEncoded
    Call<List<Account>> onSignUp(
            @Field("user") String user,
            @Field("pass") String pass,
            @Field("name") String name,
            @Field("email") String email
    );

    @GET(Constants.URL_GET_PELICULA)
    Call<List<Pelicula>> getDataPelicula();

    @GET(Constants.URL_GET_GROUP)
    Call<List<Genero>> getDataGenero();

    @GET(Constants.URL_GET_NEWS)
    Call<List<Trailer>> getDataTrailer();

    @GET(Constants.URL_GET_PELICULA)
    Call<List<Sinopsis>> getDataSinopsis();


}
