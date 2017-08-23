package com.bluelampcreative.android_core_java.core;


public interface BasePresenterContract<ViewT> {

    void registerView(ViewT view);
    void deregister();
}
