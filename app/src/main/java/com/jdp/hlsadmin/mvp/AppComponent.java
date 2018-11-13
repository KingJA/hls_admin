package com.jdp.hlsadmin.mvp;


import android.app.Application;


import com.kingja.pandora.imgaeloader.IImageLoader;
import com.kingja.pandora.injector.component.BaseAppComponent;
import com.kingja.pandora.injector.module.AppModule;
import com.kingja.pandora.injector.module.ImageLoaderModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 项目名称：
 * 类描述：TODO
 * 创建人：KingJA
 * 创建时间：2016/6/13 9:42
 * 修改备注：
 */
@Singleton
@Component(modules = {ApiModule.class, AppModule.class,ImageLoaderModule.class})
public interface AppComponent extends BaseAppComponent{
    UserApi getApi();
    Application getApplication();
    IImageLoader getImageLoader();
}
