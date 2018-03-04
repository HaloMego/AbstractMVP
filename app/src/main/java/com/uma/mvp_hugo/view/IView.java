package com.uma.mvp_hugo.view;

import android.util.SparseArray;

/**
 * Created by AlphaGo on 2018/3/4 【dot】
 */

public interface IView<E> {
    void showLoading();

    void closeLoading();

    void setData(SparseArray<E> data);
}
