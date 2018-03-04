package com.uma.mvp_hugo.presenter;

import com.uma.mvp_hugo.view.IView;

import java.lang.ref.WeakReference;

/**
 * Created by AlphaGo on 2018/3/4 【dot】
 */

public  abstract  class BasePresenter<V extends IView> {

    private WeakReference<V> mViewRef;

    public void attach(V v) {
        mViewRef = new WeakReference<>(v);
    }

    public void detach() {
        mViewRef.clear();
    }

}
