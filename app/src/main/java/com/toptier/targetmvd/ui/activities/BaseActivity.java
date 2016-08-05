package com.toptier.targetmvd.ui.activities;

import android.support.v7.app.AppCompatActivity;

import com.toptier.targetmvd.ui.providers.BusProvider;

public class BaseActivity extends AppCompatActivity {
    public void register(Object... objects) {
        if (objects != null) {
            for (Object object : objects) {
                if (object != null) {
                    BusProvider.getInstance().register(object);
                }
            }
        }
    }

    public void unregister(Object... objects) {
        if (objects != null) {
            for (Object object : objects) {
                if (object != null) {
                    BusProvider.getInstance().unregister(object);
                }
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
