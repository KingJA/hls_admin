package com.jdp.hlsadmin.entity;

import com.google.gson.Gson;
import com.kingja.pandora.mvp.BaseView;
import com.kingja.pandora.rx.CancelableObserver;
import com.orhanobut.logger.Logger;


/**
 * Description：TODO
 * Create Time：2016/10/12 15:56
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class ResultObserver<T> extends CancelableObserver<HttpResult<T>> {
    protected BaseView baseView;

    public ResultObserver(BaseView baseView) {
        this.baseView = baseView;
    }
    @Override
    public void onNext(HttpResult<T> httpResult) {
        Logger.json(new Gson().toJson(httpResult));
    }

    @Override
    public void onError(Throwable e) {
        Logger.e("onError",e.getMessage());
    }

    @Override
    public void onComplete() {
        Logger.e("onError");
    }
}
