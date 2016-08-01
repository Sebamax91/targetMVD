package com.toptier.targetmvd.ui.views;

import android.content.Context;
import android.view.View;

import com.squareup.otto.Bus;
import com.toptier.targetmvd.ui.activities.SignUpActivity;

import butterknife.ButterKnife;

public class SignUpView extends View {
    private Bus mBus;

    public SignUpView(SignUpActivity activity, Bus bus) {
        super(activity);
        this.mBus = bus;

        ButterKnife.bind(this, activity);
    }
}
