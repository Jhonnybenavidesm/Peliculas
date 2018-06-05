package com.example.asus_pc.peliculas.CrearPerfil.repository;

import android.util.Log;

import com.example.asus_pc.peliculas.ApiRest.RestApiAdapter;
import com.example.asus_pc.peliculas.ApiRest.Service;
import com.example.asus_pc.peliculas.CrearPerfil.interactor.CreateAccountActivityInteractor;
import com.example.asus_pc.peliculas.CrearPerfil.model.Account;
import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Asus-PC on 04/06/2018.
 */

public class CreateAccountActivityRepositoryImpl implements CreateAccountActivityRepository {
    private CreateAccountActivityInteractor createAccountActivityInteractor;
    List<Account> accountList;

    public CreateAccountActivityRepositoryImpl(CreateAccountActivityInteractor createAccountActivityInteractor) {
        this.createAccountActivityInteractor = createAccountActivityInteractor;
    }

    @Override
    public void createAccount(Account account) {

    }
}
