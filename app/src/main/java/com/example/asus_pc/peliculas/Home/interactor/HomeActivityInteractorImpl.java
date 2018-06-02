package com.example.asus_pc.peliculas.Home.interactor;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.asus_pc.peliculas.Genero.view.GeneroFragment;
import com.example.asus_pc.peliculas.Home.presenter.HomeActivityPresenter;
import com.example.asus_pc.peliculas.Pelicula.view.PeliculaFragment;
import com.example.asus_pc.peliculas.R;
import com.example.asus_pc.peliculas.Sinopsis.view.SInopsisFragment;
import com.example.asus_pc.peliculas.Trailer.view.TrailerFragment;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public class HomeActivityInteractorImpl implements HomeActivityInteractor {

    private HomeActivityPresenter homeActivityPresenter;

    public HomeActivityInteractorImpl(HomeActivityPresenter homeActivityPresenter) {
        this.homeActivityPresenter = homeActivityPresenter;
    }

    @Override
    public void ChangeTab(Integer position, FragmentManager fragmentManager) {

        switch (position) {
            case 0:
                PeliculaFragment PeliculaFragment = new PeliculaFragment();
                fragmentManager
                        .beginTransaction()
                       .replace(R.id.id_fl_index, PeliculaFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null)
                        .commit();
                break;
            case 1:
                GeneroFragment generoFragment = new GeneroFragment();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.id_fl_index, generoFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null)
                        .commit();
                break;
            case 2:
                TrailerFragment trailerFragment = new TrailerFragment();
                fragmentManager
                        .beginTransaction()
                       .replace(R.id.id_fl_index, trailerFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null)
                        .commit();
                break;

            case 3:
                SInopsisFragment SInopsisFragment = new SInopsisFragment();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.id_fl_index, SInopsisFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null)
                        .commit();
                break;
        }

    }
}
