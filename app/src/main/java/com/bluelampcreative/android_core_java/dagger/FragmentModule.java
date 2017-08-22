package com.bluelampcreative.android_core_java.dagger;


import com.bluelampcreative.android_core_java.features.fragments.SetupFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract SetupFragment contributeSetupFragment();


}
