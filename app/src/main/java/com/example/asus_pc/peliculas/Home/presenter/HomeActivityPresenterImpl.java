package com.example.asus_pc.peliculas.Home.presenter;

import android.support.v4.app.FragmentManager;

import com.example.asus_pc.peliculas.Home.interactor.HomeActivityInteractor;
import com.example.asus_pc.peliculas.Home.interactor.HomeActivityInteractorImpl;
import com.example.asus_pc.peliculas.Home.view.HomeActivityView;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public class HomeActivityPresenterImpl implements HomeActivityPresenter {
    private HomeActivityView homeActivityView;
    private HomeActivityInteractor homeActivityInteractor;

    public HomeActivityPresenterImpl(HomeActivityView homeActivityView) {
        this.homeActivityView = homeActivityView;
        homeActivityInteractor = new HomeActivityInteractorImpl(this);
    }

    @Override
    public void showResult() {

    }

    @Override
    public void ChangeTab(Integer position, FragmentManager fragmentManager) {
        homeActivityInteractor.ChangeTab(position, fragmentManager);
    }
}
