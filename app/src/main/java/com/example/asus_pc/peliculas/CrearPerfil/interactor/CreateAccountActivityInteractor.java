package com.example.asus_pc.peliculas.CrearPerfil.interactor;

import com.example.asus_pc.peliculas.CrearPerfil.model.Account;

/**
 * Created by Asus-PC on 04/06/2018.
 */

public interface CreateAccountActivityInteractor {
    void createAccount(Account account);
    void showResult(String msg);
    void showError(String msg);
}
