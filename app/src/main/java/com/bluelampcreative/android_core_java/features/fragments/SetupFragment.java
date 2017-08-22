package com.bluelampcreative.android_core_java.features.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bluelampcreative.android_core_java.R;
import com.bluelampcreative.android_core_java.core.BaseFragment;
import com.bluelampcreative.android_core_java.data.DataService;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class SetupFragment extends BaseFragment implements SetupContract.View {

    @BindView(R.id.txt_fragment_text)
    TextView changeText;

    @Inject
    DataService dataService;
    @Inject
    SetupContract.Presenter presenter;

    public static Fragment create() {
        return new SetupFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setup, container, false);

        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.btn_change_text)
    public void onChangedTextButtonClick() {
        changeText.setText(dataService.getChangeText());
    }
}
