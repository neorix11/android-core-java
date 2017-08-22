package com.bluelampcreative.android_core_java.features;


public interface MainContract {

    interface View {
        void toggleFragment();
    }

    interface Presenter {

        void registerView(View view);
        void showFragmentClicked();
    }
}
