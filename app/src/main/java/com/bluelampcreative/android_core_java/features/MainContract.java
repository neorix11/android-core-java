package com.bluelampcreative.android_core_java.features;


import com.bluelampcreative.android_core_java.core.BasePresenterContract;

public interface MainContract {

    interface View {
        void toggleFragment();
    }

    interface Presenter extends BasePresenterContract<View> {
        void showFragmentClicked();
    }
}
