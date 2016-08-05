package com.toptier.targetmvd.ui.models;

import com.squareup.otto.Bus;

public class MainModel {
    private Bus mBus;

    public MainModel(Bus bus) {
        this.mBus = bus;
    }
}
