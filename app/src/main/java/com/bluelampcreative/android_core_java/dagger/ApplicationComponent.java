package com.bluelampcreative.android_core_java.dagger;


import com.bluelampcreative.android_core_java.MainApplication;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {AndroidInjectionModule.class, ActivityModule.class})
public interface ApplicationComponent {

    void inject(MainApplication mainApplication);
}
