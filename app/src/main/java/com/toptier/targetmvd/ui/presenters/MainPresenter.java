package com.toptier.targetmvd.ui.presenters;

import com.toptier.targetmvd.ui.models.MainModel;
import com.toptier.targetmvd.ui.views.MainView;

public class MainPresenter {
    private MainView mView;
    private MainModel mModel;

    public MainPresenter(MainView view, MainModel model) {
        this.mView = view;
        this.mModel = model;
    }
}
