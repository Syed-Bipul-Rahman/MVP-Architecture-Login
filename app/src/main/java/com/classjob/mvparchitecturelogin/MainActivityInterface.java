package com.classjob.mvparchitecturelogin;

public interface MainActivityInterface {

    interface View {
        void onSuccess(String msg);

        void onFailer(String msg);
    }

    interface Presenter {
        void doLogin(String email, String password);
    }

}
