package com.example.asus_pc.peliculas.Home.presenter;

import android.support.v4.app.FragmentManager;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public interface HomeActivityPresenter {
    void showResult();
    void ChangeTab(Integer position, FragmentManager fragmentManager);
}
