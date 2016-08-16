package com.toptier.targetmvd.ui.views;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class BaseView extends ActivityView {

    public BaseView(AppCompatActivity activity) {
        super(activity);
    }

    protected void setActionBar(AppCompatActivity activity, String title) {
        ActionBar actionBar = activity.getSupportActionBar();

        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(title);
    }

    @Nullable
    public Context getContext() {
        AppCompatActivity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return activity.getApplicationContext();
    }
}
