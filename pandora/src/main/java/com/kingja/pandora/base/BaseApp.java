package com.kingja.pandora.base;

import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

import com.kingja.pandora.injector.component.BaseAppComponent;
import com.kingja.pandora.injector.module.AppModule;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;


/**
 * Description：App
 * Create Time：2016/10/14:04
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public abstract class BaseApp extends MultiDexApplication {
    private static BaseApp sInstance;
    private BaseAppComponent appComponent;
    private AppModule appModule;

    @Override
    public void onCreate() {
        super.onCreate();
        Logger.addLogAdapter(new AndroidLogAdapter());
        setupComponent();
        sInstance = this;
    }

    private void setupComponent() {
        appComponent = createAppComponent();
        appModule = new AppModule(this);
    }

    protected abstract BaseAppComponent createAppComponent();


    public static BaseApp getContext() {
        return sInstance;
    }

    public BaseAppComponent getAppComponent() {
        return appComponent;
    }

    public AppModule getAppModule() {
        return appModule;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);/*64K说拜拜*/
    }
}
