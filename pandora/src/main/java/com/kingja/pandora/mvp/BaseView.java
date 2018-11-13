package com.kingja.pandora.mvp;

/**
 * Description：TODO
 * Create Time：2016/10/10 14:41
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public interface BaseView {
    default void showLoading() {
    }

    default void hideLoading() {
    }

    default boolean ifShowCusLoading() {
        return false;
    }

    default void showCusLoading() {
    }

    default void hideCusLoading() {
    }

    default void showError() {
    }

    default void showLoadingCallback() {
    }

    default void showEmptyCallback() {
    }

    default void showErrorCallback() {
    }

    default void showSuccessCallback() {
    }

    default void showErrorMessage(int code, String message) {

    }

    public default boolean ifRegisterLoadSir() {
        return false;
    }
}
