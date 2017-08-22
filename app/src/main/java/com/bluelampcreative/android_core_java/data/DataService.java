package com.bluelampcreative.android_core_java.data;


import javax.inject.Inject;

public class DataService {

    @Inject
    public DataService() {
    }

    public String getChangeText() {
        return "this is changed text";
    }
}
