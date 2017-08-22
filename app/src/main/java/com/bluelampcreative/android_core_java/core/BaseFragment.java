package com.bluelampcreative.android_core_java.core;

import android.app.Fragment;
import android.content.Context;

import dagger.android.AndroidInjection;


public abstract class BaseFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        AndroidInjection.inject(this);
        super.onAttach(context);
    }
}
