package com.bluelampcreative.android_core_java.features;


public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;

    @Override
    public void registerView(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void showFragmentClicked() {
        view.toggleFragment();
    }
}
