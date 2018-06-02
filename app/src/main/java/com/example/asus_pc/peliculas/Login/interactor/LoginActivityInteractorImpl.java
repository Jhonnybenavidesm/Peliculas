package com.example.asus_pc.peliculas.Login.interactor;

import com.example.asus_pc.peliculas.Login.model.Login;
import com.example.asus_pc.peliculas.Login.presenter.LoginActivityPresenter;
import com.example.asus_pc.peliculas.Login.repository.LoginActivityRepository;
import com.example.asus_pc.peliculas.Login.repository.LoginActivityRepositoryImpl;

import java.util.List;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public class LoginActivityInteractorImpl  implements LoginActivityInteractor{

    private LoginActivityPresenter loginActivityPresenter;
    private LoginActivityRepository loginActivityRepository;

    public LoginActivityInteractorImpl(LoginActivityPresenter loginActivityPresenter) {
        this.loginActivityPresenter = loginActivityPresenter;
        loginActivityRepository = new LoginActivityRepositoryImpl(this);
    }

    @Override
    public void signIn(String user, String pass) {
        if ("".equals(user) || "".equals(pass)){
            loginActivityPresenter.showError("Los campos no pueden estar vacios");
        }else {
            loginActivityRepository.signIn(user, pass);
        }
    }

    @Override
    public void processData(List<Login> loginList) {
        Boolean searchUser = loginList.get(0).isSearchUser();

        if (searchUser){
            loginActivityPresenter.showResult(loginList);
        }else{
            loginActivityPresenter.showError("El usuario ingresado no existe");
        }
    }
}
