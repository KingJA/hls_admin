package com.jdp.hlsadmin.page.login;


import com.jdp.hlsadmin.entity.Login;
import com.kingja.pandora.mvp.BasePresenter;
import com.kingja.pandora.mvp.BaseView;

/**
 * Description：TODO
 * Create Time：2016/10/10 14:38
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public interface LoginContract {
    interface View extends BaseView {
        void onLoginSuccess(Login account);
    }

    interface Presenter extends BasePresenter<View> {
        void login(String accountName, String password, int accountType);
    }
}
