package com.jdp.hlsadmin.mvp;



import com.jdp.hlsadmin.MainActivity;
import com.kingja.pandora.injector.annotation.PerActivity;
import com.kingja.pandora.injector.module.ActivityModule;

import dagger.Component;

@PerActivity
@Component(dependencies = AppComponent.class, modules = {ActivityModule.class})
public interface BaseCompnent {

    void inject(MainActivity target);
}
