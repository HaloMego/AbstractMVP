package com.uma.mvp_hugo.presenter;

import android.util.SparseArray;

import com.uma.mvp_hugo.bean.GirlBean;
import com.uma.mvp_hugo.model.GirlModelIMpl;
import com.uma.mvp_hugo.model.ModelGlobalListener;
import com.uma.mvp_hugo.view.IView;

/**
 * Created by AlphaGo on 2018/3/4 【dot】
 */

public class GirlPresenter<T extends IView> extends BasePresenter<T> {
    private GirlModelIMpl<GirlBean> girlModel = new GirlModelIMpl<>();
    private IView mGirlView;

    public void fetch() {
        if (mGirlView != null) {
            mGirlView.showLoading();
        }
        girlModel.loadData(new ModelGlobalListener<GirlBean>() {
            @Override
            public void setData(SparseArray<GirlBean> data) {

            }
        });
    }

}
