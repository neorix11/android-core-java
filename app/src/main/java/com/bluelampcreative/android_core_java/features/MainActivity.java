package com.bluelampcreative.android_core_java.features;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.bluelampcreative.android_core_java.R;
import com.bluelampcreative.android_core_java.core.BaseActivity;
import com.bluelampcreative.android_core_java.features.fragments.SetupFragment;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.AndroidInjection;
import timber.log.Timber;


public class MainActivity extends BaseActivity implements MainContract.View {

    public static Intent create(Context context) {
        return new Intent(context, MainActivity.class);
    }

    @Inject
    MainContract.Presenter presenter;

    @BindView(R.id.frame_fragment_content)
    FrameLayout fragmentContent;

    @BindView(R.id.btn_show_fragment)
    Button showFragmentButton;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.registerView(this);
        setContentFragment(SetupFragment.create());
    }

    @OnClick(R.id.btn_show_fragment)
    public void onShowFragmentButtonClick() {
        presenter.showFragmentClicked();
    }

    @Override
    public void toggleFragment() {
        Timber.i("Toggling Fragment");
        if (fragmentContent.getVisibility() == View.VISIBLE) {
            setButtonText("Hide Fragment");
            fragmentContent.setVisibility(View.GONE);
        } else {
            setButtonText("Show Fragment");
            fragmentContent.setVisibility(View.VISIBLE);
        }
    }

    private void setButtonText(String buttonText) {
        showFragmentButton.setText(buttonText);
    }

    private void setContentFragment(Fragment fragment) {
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_fragment_content, fragment)
                .commit();
    }
}
