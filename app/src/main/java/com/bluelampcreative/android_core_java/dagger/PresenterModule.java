package com.bluelampcreative.android_core_java.dagger;


import com.bluelampcreative.android_core_java.features.MainContract;
import com.bluelampcreative.android_core_java.features.MainPresenter;
import com.bluelampcreative.android_core_java.features.fragments.SetupContract;
import com.bluelampcreative.android_core_java.features.fragments.SetupPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {

    //Break these out into Activity and Fragment presenter Modules if this grows.

    @Provides
    MainContract.Presenter provideMainContractPresenter() {
        return new MainPresenter();
    }

    @Provides
    SetupContract.Presenter provideSetupContractPresenter() {
        return new SetupPresenter();
    }
}
