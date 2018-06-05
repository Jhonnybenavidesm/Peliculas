package com.example.asus_pc.peliculas.CrearPerfil.interactor;

import com.example.asus_pc.peliculas.CrearPerfil.model.Account;
import com.example.asus_pc.peliculas.CrearPerfil.presenter.CreateAccountActivityPresenter;
import com.example.asus_pc.peliculas.CrearPerfil.repository.CreateAccountActivityRepository;
import com.example.asus_pc.peliculas.CrearPerfil.repository.CreateAccountActivityRepositoryImpl;

/**
 * Created by Asus-PC on 04/06/2018.
 */

public class CreateAccountActivityInteractorImpl implements CreateAccountActivityInteractor {

    private CreateAccountActivityPresenter createAccountActivityPresenter;
    private CreateAccountActivityRepository createAccountActivityRepository;

    public CreateAccountActivityInteractorImpl(CreateAccountActivityPresenter createAccountActivityPresenter) {
        this.createAccountActivityPresenter = createAccountActivityPresenter;
        createAccountActivityRepository = new CreateAccountActivityRepositoryImpl(this);
    }

    @Override
    public void createAccount(Account account) {
        // Validar si los datos estan llenos
        createAccountActivityRepository.createAccount(account);
    }

    @Override
    public void showResult(String msg) {
        createAccountActivityPresenter.showResult(msg);
    }

    @Override
    public void showError(String msg) {
        createAccountActivityPresenter.showError(msg);
    }
}
