package com.example.asus_pc.peliculas.Login.presenter;

import com.example.asus_pc.peliculas.Login.interactor.LoginActivityInteractor;
import com.example.asus_pc.peliculas.Login.interactor.LoginActivityInteractorImpl;
import com.example.asus_pc.peliculas.Login.model.Login;
import com.example.asus_pc.peliculas.Login.view.LoginActivityView;

import java.util.List;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public class LoginActivityPresenterImpl implements LoginActivityPresenter{

    private LoginActivityView loginActivityView;
    private LoginActivityInteractor loginActivityInteractor;

    public LoginActivityPresenterImpl(LoginActivityView loginActivityView) {
        this.loginActivityView = loginActivityView;
        loginActivityInteractor = new LoginActivityInteractorImpl(this);
    }

    @Override
    public void signIn(String user, String pass) {
        loginActivityInteractor.signIn(user, pass);
    }

    @Override
    public void showResult(List<Login> loginList) {
        loginActivityView.showResult(loginList);
    }

    @Override
    public void showError(String error) {
        loginActivityView.showError(error);
    }
}
