package com.example.asus_pc.peliculas.Login.view;

import com.example.asus_pc.peliculas.Login.model.Login;

import java.util.List;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public interface LoginActivityView {
    void showResult(List<Login> loginList);
    void showError(String error);
}
