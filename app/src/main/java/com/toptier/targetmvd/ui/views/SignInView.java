package com.toptier.targetmvd.ui.views;

import com.squareup.otto.Bus;
import com.toptier.targetmvd.ui.activities.SignInActivity;

public class SignInView extends ActivityView {
    private Bus mBus;

    public SignInView(SignInActivity activity, Bus bus) {
        super(activity);
        this.mBus = bus;
    }
}
