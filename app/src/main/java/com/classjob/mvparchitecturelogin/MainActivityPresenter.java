package com.classjob.mvparchitecturelogin;

public class MainActivityPresenter implements MainActivityInterface.Presenter {

    MainActivityInterface.View view;

    public MainActivityPresenter(MainActivityInterface.View view) {
        this.view = view;
    }

    @Override
    public void doLogin(String email, String password) {
        if (email.equals("joybangla") && password.equals("joybangla")) {

            view.onSuccess("Succefully login");

        }else {
            view.onFailer("Failed to login");
        }

    }
}
