package com.toptier.targetmvd.ui.views;

import com.squareup.otto.Bus;
import com.toptier.targetmvd.R;
import com.toptier.targetmvd.ui.activities.MainActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainView extends BaseView {
    private Bus mBus;

    public MainView(MainActivity activity, Bus bus) {
        super(activity);
        this.mBus = bus;

        ButterKnife.bind(this, activity);
    }

    @OnClick(R.id.sign_in)
    public void signInOnClick() {
        mBus.post(new SignInOnClickEvent());
    }

    @OnClick(R.id.sign_up)
    public void signUpOnClick() {
        mBus.post(new SignUpOnClickEvent());
    }

    public static class SignUpOnClickEvent {}
    public static class SignInOnClickEvent {}
}
