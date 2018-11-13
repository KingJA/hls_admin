package com.kingja.pandora.i;

import android.content.DialogInterface;

/**
 * Description:TODO
 * Create Time:2018/11/13 0013 下午 2:05
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public interface CommonDialog {
    void show();

    void dismiss();

    void setCancelable(boolean flag);

    void setCanceledOnTouchOutside(boolean flag);

    void setOnDismissListener(OnDismissListener onDismissListener);

    void setMessage(String message);
    boolean isShowing();

    interface OnCancelListener {
        void onCancel(DialogInterface dialog);
    }

    interface OnDismissListener {
        void onDismiss(DialogInterface dialog);
    }

    interface OnShowListener {
        void onShow(DialogInterface dialog);
    }
}
