package com.bluelampcreative.android_core_java.core;


public abstract class BasePresenter<ViewT> implements BasePresenterContract<ViewT> {

    public ViewT view = null;

    @Override
    public void registerView(ViewT view) {
        this.view = view;
    }

    @Override
    public void deregister() {
        view = null;
    }
}
