package com.jdp.hlsadmin.base;

import com.jdp.hlsadmin.mvp.ApiModule;
import com.jdp.hlsadmin.mvp.DaggerAppComponent;
import com.kingja.pandora.base.BaseApp;
import com.kingja.pandora.injector.component.BaseAppComponent;
import com.kingja.pandora.injector.module.AppModule;

/**
 * Description:TODO
 * Create Time:2018/11/13 0013 下午 2:39
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class App extends BaseApp {
    @Override
    protected BaseAppComponent createAppComponent() {
        return DaggerAppComponent.builder()
                .apiModule(new ApiModule())
                .appModule(new AppModule(this))
                .build();
    }
}
