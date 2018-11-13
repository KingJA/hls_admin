package com.kingja.pandora.mvp.module;

import com.kingja.pandora.constants.Constants;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Description:TODO
 * Create Time:2018/11/13 0013 上午 11:31
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class Api<T> {

    private final Retrofit retrofit;

    public Api() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(Constants.NETWORK.CONNECTTIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(Constants.NETWORK.WRITETIMEOUT, TimeUnit.SECONDS)
                .readTimeout(Constants.NETWORK.READTIMEOUT, TimeUnit.SECONDS)
                .addInterceptor(httpLoggingInterceptor)
                .build();
        retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(client)
                .build();

    }

    public T getApiService(Class<T> clazz) {
        return retrofit.create(clazz);
    }
}
