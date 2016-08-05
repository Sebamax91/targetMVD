package com.toptier.targetmvd.ui.activities;

import android.os.Bundle;

import com.squareup.otto.Bus;
import com.toptier.targetmvd.R;
import com.toptier.targetmvd.ui.models.MainModel;
import com.toptier.targetmvd.ui.presenters.MainPresenter;
import com.toptier.targetmvd.ui.providers.BusProvider;
import com.toptier.targetmvd.ui.views.MainView;

public class MainActivity extends BaseActivity {
    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bus bus = BusProvider.getInstance();
        this.mPresenter = new MainPresenter(
                new MainView(this, bus),
                new MainModel(bus));
    }

    @Override
    protected void onResume() {
        super.onResume();
        register(mPresenter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregister(mPresenter);
    }
}
