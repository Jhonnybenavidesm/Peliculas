package com.example.asus_pc.peliculas.CrearPerfil.presenter;

import com.example.asus_pc.peliculas.CrearPerfil.interactor.CreateAccountActivityInteractor;
import com.example.asus_pc.peliculas.CrearPerfil.interactor.CreateAccountActivityInteractorImpl;
import com.example.asus_pc.peliculas.CrearPerfil.model.Account;
import com.example.asus_pc.peliculas.CrearPerfil.view.CreateAccountActivityView;

/**
 * Created by Asus-PC on 04/06/2018.
 */

public class CreateAccountActivityPresenterImpl implements CreateAccountActivityPresenter {

    private CreateAccountActivityView createAccountActivityView;
    private CreateAccountActivityInteractor createAccountActivityInteractor;

    public CreateAccountActivityPresenterImpl(CreateAccountActivityView createAccountActivityView) {
        this.createAccountActivityView = createAccountActivityView;
        createAccountActivityInteractor = new CreateAccountActivityInteractorImpl(this);
    }

    @Override
    public void createAccount(Account account) {
        createAccountActivityInteractor.createAccount(account);
    }

    @Override
    public void showResult(String msg) {
        createAccountActivityView.showResult(msg);
    }

    @Override
    public void showError(String msg) {
        createAccountActivityView.showError(msg);
    }
}
