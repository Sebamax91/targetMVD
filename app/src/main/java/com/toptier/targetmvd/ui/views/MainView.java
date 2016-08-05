package com.toptier.targetmvd.ui.views;

import com.squareup.otto.Bus;
import com.toptier.targetmvd.ui.activities.MainActivity;

public class MainView {
    private MainActivity mActivity;
    private Bus mBus;

    public MainView(MainActivity activity, Bus bus) {
        this.mActivity = activity;
        this.mBus = bus;
    }
}
