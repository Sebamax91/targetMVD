package com.toptier.targetmvd.ui.views;

import com.squareup.otto.Bus;
import com.toptier.targetmvd.ui.activities.SignUpActivity;

public class SignUpView extends BaseView {
    private Bus mBus;

    public SignUpView(SignUpActivity activity, Bus bus) {
        super(activity);
        this.mBus = bus;
    }
}
