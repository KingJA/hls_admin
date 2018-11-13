package com.jdp.hlsadmin.mvp;


import com.kingja.pandora.mvp.module.Api;

/**
 * 项目名称：和ApiService相关联
 * 类描述：TODO
 * 创建人：KingJA
 * 创建时间：2016/6/13 15:11
 * 修改备注：
 */
public class UserApi extends Api<ApiService> {
    @Override
    public ApiService getApiService(Class<ApiService> clazz) {
        return super.getApiService(clazz);
    }

    public ApiService getApiService() {
        return getApiService(ApiService.class);
    }
}
