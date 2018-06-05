package com.example.asus_pc.peliculas.CrearPerfil.view;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.example.asus_pc.peliculas.CrearPerfil.model.Account;
import com.example.asus_pc.peliculas.CrearPerfil.presenter.CreateAccountActivityPresenter;
import com.example.asus_pc.peliculas.CrearPerfil.presenter.CreateAccountActivityPresenterImpl;
import com.example.asus_pc.peliculas.R;

public class CreateAccountActivity extends AppCompatActivity implements CreateAccountActivityView {

    private CreateAccountActivityPresenter createAccountActivityPresenter;
    Toolbar toolbar;
    TextInputEditText textInputEditTextEmail, textInputEditTextName, textInputEditTextUser, textInputEditTextPass, textInputEditTextRePass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        createAccountActivityPresenter = new CreateAccountActivityPresenterImpl(this);
        toolbar = findViewById(R.id.id_tb_toolbarindex);
        toolbar.setTitle(R.string.str_toolbar_account);
        textInputEditTextEmail = findViewById(R.id.id_txv_account_email);
        textInputEditTextName = findViewById(R.id.id_txv_account_name);
        textInputEditTextUser = findViewById(R.id.id_txv_account_username);
        textInputEditTextPass = findViewById(R.id.id_txv_account_password);
        textInputEditTextRePass = findViewById(R.id.id_txv_account_repassword);
    }

    public void clickCreateAccount(View view){
        Account account = new Account(
                textInputEditTextUser.getText().toString(),
                textInputEditTextPass.getText().toString(),
                textInputEditTextName.getText().toString(),
                textInputEditTextEmail.getText().toString(),
                textInputEditTextRePass.getText().toString()
        );
        createAccountActivityPresenter.createAccount(account);
    }

    @Override
    public void showResult(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
