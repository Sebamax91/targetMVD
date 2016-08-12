package com.toptier.targetmvd.ui.models;

import com.squareup.otto.Bus;

public class SignInModel {
    private Bus mBus;

    public SignInModel(Bus bus) {
        this.mBus = bus;
    }
}
