package com.example.asus_pc.peliculas.Home.view;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.asus_pc.peliculas.Home.presenter.HomeActivityPresenter;
import com.example.asus_pc.peliculas.Home.presenter.HomeActivityPresenterImpl;
import com.example.asus_pc.peliculas.Login.view.LoginActivity;
import com.example.asus_pc.peliculas.R;
import com.example.asus_pc.peliculas.Utilidades.BottomNavigationViewHelper;

public class HomeActivity extends AppCompatActivity implements HomeActivityView{

    private HomeActivityPresenter homeActivityPresenter;
    BottomNavigationView bottomNavigationView;
    FragmentManager fragmentManager;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        homeActivityPresenter = new HomeActivityPresenterImpl(this);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.id_bnv_index);
        BottomNavigationViewHelper.removeShiftMode(bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.id_menubn_trailer);
        fragmentManager = getSupportFragmentManager();

        initSharedPreferences();
    }

    private void initSharedPreferences() {
        // Inicializar coleccion de preferencias llamada mis "PreferencesWorldCup"
        sharedPreferences = getSharedPreferences("PreferencesWorldCup", Context.MODE_PRIVATE);

        String user = sharedPreferences.getString("user", null);

        if ( (user == null) || (user.equals("")) ){
            Intent intent = new Intent(this, LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }else {
            initBottomNavigationView();
        }
    }

    private void initBottomNavigationView() {

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.id_menubn_pelicula:
                        homeActivityPresenter.ChangeTab(0, fragmentManager);
                        break;
                    case R.id.id_menubn_genero:
                        homeActivityPresenter.ChangeTab(1, fragmentManager);
                        break;
                    case R.id.id_menubn_trailer:
                        homeActivityPresenter.ChangeTab(2, fragmentManager);
                        break;
                    case R.id.id_menubn_sinopsis:
                        homeActivityPresenter.ChangeTab(3, fragmentManager);
                        break;

                }

                return true;
            }
        });
    }

    @Override
    public void showResult() {

    }
}
