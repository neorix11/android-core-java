package com.bluelampcreative.android_core_java.dagger;


import com.bluelampcreative.android_core_java.features.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = {PresenterModule.class, FragmentModule.class})
    abstract MainActivity contributeMainActivityInjector();
}
