package com.bluelampcreative.android_core_java.features;


import com.bluelampcreative.android_core_java.core.BasePresenter;

public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {

    @Override
    public void showFragmentClicked() {
        view.toggleFragment();
    }
}
