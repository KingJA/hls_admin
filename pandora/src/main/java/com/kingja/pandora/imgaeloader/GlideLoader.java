package com.kingja.pandora.imgaeloader;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


/**
 * Description：TODO
 * Create Time：2017/3/9 11:08
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class GlideLoader implements IImageLoader {
    @Override
    public void loadImage(Context context, String url, int resourceId, ImageView view) {
        Glide.with(context)
                .load( url)
                .centerCrop()
                .crossFade()
                .skipMemoryCache(true)
                .into(view);
    }

    @Override
    public void loadImage(Context context, Uri uri, ImageView view) {
        Glide.with(context)
                .load(uri)
                .centerCrop()
                .crossFade()
                .skipMemoryCache(true)
                .into(view);
    }
}
