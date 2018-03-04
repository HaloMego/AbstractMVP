package com.uma.mvp_hugo.model;

import android.util.SparseArray;

import com.uma.mvp_hugo.bean.GirlBean;

/**
 * Created by AlphaGo on 2018/3/4 【dot】
 */

public class GirlModelIMpl<E extends GirlBean> implements IModel<E> {


    @Override
    public void loadData(ModelGlobalListener<E> listener) {
        SparseArray<GirlBean> array = new SparseArray<>();
        array.put(1,new GirlBean());

    }
}
