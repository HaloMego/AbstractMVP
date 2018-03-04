package com.uma.mvp_hugo.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.uma.mvp_hugo.presenter.BasePresenter;

/**
 * Created by AlphaGo on 2018/3/4 【dot】
 */

public abstract class BaseActivity<V extends IView, T extends BasePresenter<V>> extends AppCompatActivity {
    private T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
        V v = createView();
        mPresenter.attach(v);

    }

    protected abstract V createView();


    protected abstract T createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detach();
    }

    /**
     * Helps to avoid using {@code @SuppressWarnings({"unchecked"})} when casting to a generic type.
     */
    @SuppressWarnings({"unchecked"})
    public static <T> T uncheckedCast(Object obj) {
        return (T) obj;
    }


}
