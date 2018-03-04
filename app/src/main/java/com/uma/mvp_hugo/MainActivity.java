package com.uma.mvp_hugo;

import android.os.Bundle;
import android.util.SparseArray;

import com.uma.mvp_hugo.bean.GirlBean;
import com.uma.mvp_hugo.presenter.GirlPresenter;
import com.uma.mvp_hugo.view.BaseActivity;
import com.uma.mvp_hugo.view.IView;

public class MainActivity extends BaseActivity<IView, GirlPresenter<IView>> implements IView<GirlBean> {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected IView createView() {
        return this;
    }


    @Override
    protected GirlPresenter<IView> createPresenter() {
        return null;
    }


    @Override
    public void showLoading() {

    }

    @Override
    public void closeLoading() {

    }

    @Override
    public void setData(SparseArray<GirlBean> data) {

    }

}
