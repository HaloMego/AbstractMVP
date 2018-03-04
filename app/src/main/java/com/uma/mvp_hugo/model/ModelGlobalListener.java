package com.uma.mvp_hugo.model;

import android.util.SparseArray;

public interface ModelGlobalListener<E> {
    void setData(SparseArray<E> data);
}
