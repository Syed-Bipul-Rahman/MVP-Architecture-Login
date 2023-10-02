package com.classjob.mvparchitecturelogin;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.classjob.mvparchitecturelogin.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements MainActivityInterface.View {
    ActivityMainBinding binding;
    MainActivityInterface.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
//presenter
        presenter = new MainActivityPresenter(this);

        //start
        binding.logintbn.setOnClickListener(v -> {

            //validadtion

            String username = binding.username.getText().toString();

            String password = binding.password.getText().toString();

            if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
                onFailer("Field(s) are required");

            }else{
                presenter.doLogin(username,password);
            }


        });

    }


    @Override
    public void onSuccess(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailer(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}