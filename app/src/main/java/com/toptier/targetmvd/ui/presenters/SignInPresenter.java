package com.toptier.targetmvd.ui.presenters;

import com.toptier.targetmvd.ui.models.SignInModel;
import com.toptier.targetmvd.ui.views.SignInView;

public class SignInPresenter extends BasePresenter {
    private SignInView mView;
    private SignInModel mModel;

    public SignInPresenter(SignInView view, SignInModel model) {
        this.mView = view;
        this.mModel = model;
    }
}
