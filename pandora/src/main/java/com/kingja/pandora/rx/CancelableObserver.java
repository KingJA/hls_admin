package com.kingja.pandora.rx;

import io.reactivex.observers.DefaultObserver;

/**
 * Description:TODO
 * Create Time:2018/11/13 0013 下午 1:49
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public abstract class CancelableObserver<T> extends DefaultObserver<T> {
    @Override
    public abstract void onNext(T t);

    @Override
    public abstract void onError(Throwable e);

    @Override
    public abstract void onComplete();

    public void cancleRequest() {
        cancel();
    }
}
