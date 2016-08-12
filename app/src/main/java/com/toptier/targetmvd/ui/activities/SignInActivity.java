package com.toptier.targetmvd.ui.activities;

import android.os.Bundle;

import com.squareup.otto.Bus;
import com.toptier.targetmvd.R;
import com.toptier.targetmvd.ui.models.SignInModel;
import com.toptier.targetmvd.ui.presenters.SignInPresenter;
import com.toptier.targetmvd.ui.providers.BusProvider;
import com.toptier.targetmvd.ui.views.SignInView;

public class SignInActivity extends BaseActivity {
    private SignInPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Bus bus = BusProvider.getInstance();
        this.mPresenter = new SignInPresenter(
                new SignInView(this, bus),
                new SignInModel(bus));
    }

    @Override
    public void onResume() {
        super.onResume();
        register(mPresenter);
    }

    @Override
    public void onPause() {
        super.onPause();
        unregister(mPresenter);
    }
}
