package com.uma.mvp_hugo.model;

/**
 * Created by AlphaGo on 2018/3/4 【dot】
 */

public interface IModel<E> {
    void loadData(ModelGlobalListener<E> listener);
}

