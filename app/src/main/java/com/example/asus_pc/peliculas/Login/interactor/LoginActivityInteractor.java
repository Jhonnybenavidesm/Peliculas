package com.example.asus_pc.peliculas.Login.interactor;

import com.example.asus_pc.peliculas.Login.model.Login;

import java.util.List;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public interface LoginActivityInteractor {
    void signIn(String user, String pass);
    void processData(List<Login> loginList);
}
