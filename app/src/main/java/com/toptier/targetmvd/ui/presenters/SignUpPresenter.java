package com.toptier.targetmvd.ui.presenters;

import com.toptier.targetmvd.ui.models.SignUpModel;
import com.toptier.targetmvd.ui.views.SignUpView;

public class SignUpPresenter {
    private SignUpView mView;
    private SignUpModel mModel;

    public SignUpPresenter(SignUpView view, SignUpModel model) {
        this.mView = view;
        this.mModel = model;
    }
}
