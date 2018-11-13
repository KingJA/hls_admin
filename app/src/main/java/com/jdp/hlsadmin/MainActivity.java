package com.jdp.hlsadmin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jdp.hlsadmin.base.App;
import com.jdp.hlsadmin.mvp.AppComponent;
import com.jdp.hlsadmin.mvp.DaggerBaseCompnent;
import com.jdp.hlsadmin.page.login.LoginPresenter;
import com.kingja.pandora.base.BaseApp;
import com.kingja.pandora.uitil.EncryptUtil;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerBaseCompnent.builder()
                .appComponent((AppComponent) BaseApp.getContext().getAppComponent())
                .build()
                .inject(this);
        loginPresenter.login("1@1", EncryptUtil.getDoubleMd5("123456"), 0);
    }
}
